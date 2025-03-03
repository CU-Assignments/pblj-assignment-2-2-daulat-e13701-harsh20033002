import java.io.*; 

class Student implements Serializable { 
    private static final long serialVersionUID = 1L; 
    int id; 
    String name; 
    double gpa; 
    public Student(int id, String name, double gpa) { 
    this.id = id; 
    this.name = name; 
    this.gpa = gpa; 
} 
    @Override 
    public String toString() { 
    return "ID: " + id + ", Name: " + name + ", GPA: " + gpa; 
    } 
} 
public class StudentSerialization { 
// Serialize the Student Object 
    public static void serializeStudent(Student student, String filename) { 

        try (ObjectOutputStream out = new ObjectOutputStream(new 
        FileOutputStream(filename))) { 
        out.writeObject(student); 
        System.out.println("Student serialized successfully!"); 
        } catch (FileNotFoundException e) { 
        System.out.println("File not found: " + e.getMessage()); 
        } catch (IOException e) { 
        System.out.println("IO Exception: " + e.getMessage()); 
        } 
    } 
// Deserialize the Student Object 
    public static void deserializeStudent(String filename) { 
        try (ObjectInputStream in = new ObjectInputStream(new 
        FileInputStream(filename))) { 
        Student student = (Student) in.readObject(); 
        System.out.println("Deserialized Student: " + student); 
        } catch (FileNotFoundException e) { 
        System.out.println("File not found: " + e.getMessage()); 
        } catch (IOException e) { 
        System.out.println("IO Exception: " + e.getMessage()); 
        } catch (ClassNotFoundException e) { 
        System.out.println("Class not found: " + e.getMessage()); 
        } 
    } 
    public static void main(String[] args) { 
        Student student = new Student(101, "Dipesh", 8.5); 
        String filename = "student.ser"; 
        // Serialize 
        serializeStudent(student, filename); 
        // Deserialize 
        deserializeStudent(filename); 
    } 
}
