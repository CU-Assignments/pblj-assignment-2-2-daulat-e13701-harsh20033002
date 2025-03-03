import java.io.*; 
import java.util.ArrayList; 
import java.util.Scanner; 
// Serializable Class 
class Employee implements Serializable { 
  private static final long serialVersionUID = 1L; 
  int id; 
  String name; 
  String designation; 
  double salary; 
  public Employee(int id, String name, String designation, double salary) { 
  this.id = id; 
  this.name = name; 
  this.designation = designation; 
  this.salary = salary; 
  } 
  @Override 
  public String toString() { 
  return "ID: " + id + ", Name: " + name + ", Designation: " + designation + ", Salary: 
  " + salary; 
  } 
  } 
  public class EmployeeManagement { 
  private static final String FILE_NAME = "employees.dat"; 
  // Method to add an employee 
  public static void addEmployee() { 
  Scanner sc = new Scanner(System.in); 
  System.out.print("Enter Employee ID: "); 
  int id = sc.nextInt(); 
  sc.nextLine(); // Consume newline 
  System.out.print("Enter Employee Name: "); 
  String name = sc.nextLine(); 
  System.out.print("Enter Designation: "); 
  String designation = sc.nextLine(); 
  System.out.print("Enter Salary: "); 
  double salary = sc.nextDouble(); 
  DEPARTMENT OF 
  COMPUTER SCIENCE & ENGINEERING 
  Employee employee = new Employee(id, name, designation, salary); 
  ArrayList<Employee> employees = readEmployees(); 
  employees.add(employee); 
  writeEmployees(employees); 
  System.out.println("Employee added successfully!"); 
  } 
// Method to display all employees 
public static void displayAllEmployees() { 
ArrayList<Employee> employees = readEmployees(); 
if (employees.isEmpty()) { 
System.out.println("No employees found."); 
} else { 
for (Employee emp : employees) { 
System.out.println(emp); 
} 
} 
} 
// Method to read employees from the file 
public static ArrayList<Employee> readEmployees() { 
ArrayList<Employee> employees = new ArrayList<>(); 
try (ObjectInputStream in = new ObjectInputStream(new 
FileInputStream(FILE_NAME))) { 
employees = (ArrayList<Employee>) in.readObject(); 
} catch (FileNotFoundException e) { 
System.out.println("No existing records found."); 
} catch (IOException | ClassNotFoundException e) { 
System.out.println("Error reading employee data: " + e.getMessage()); 
} 
return employees; 
} 
// Method to write employees to the file 
public static void writeEmployees(ArrayList<Employee> employees) { 
try (ObjectOutputStream out = new ObjectOutputStream(new 
FileOutputStream(FILE_NAME))) { 
out.writeObject(employees); 
} catch (IOException e) { 
System.out.println("Error writing employee data: " + e.getMessage()); 
} 
} 
DEPARTMENT OF 
COMPUTER SCIENCE & ENGINEERING 
// Main Menu 
public static void main(String[] args) { 
Scanner sc = new Scanner(System.in); 
while (true) { 
System.out.println("\n--- Employee Management System ---"); 
System.out.println("1. Add an Employee"); 
System.out.println("2. Display All Employees"); 
System.out.println("3. Exit"); 
System.out.print("Choose an option: "); 
int choice = sc.nextInt(); 
switch (choice) { 
case 1: 
addEmployee(); 
break; 
case 2: 
displayAllEmployees(); 
break; 
case 3: 
System.out.println("Exiting..."); 
sc.close(); 
System.exit(0); 
break; 
default: 
System.out.println("Invalid choice. Please try again."); 
} 
} 
} 
} 
