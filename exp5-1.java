import java.util.ArrayList; 
import java.util.Scanner; 
public class SumOfIntegers { 
    public static void main(String[] args) { 
    ArrayList<Integer> numbers = new ArrayList<>(); 
    Scanner sc = new Scanner(System.in); 
    System.out.println("Enter numbers (type 'end' to stop):"); 
    while (true) { 
        String input = sc.next(); 
        if (input.equalsIgnoreCase("end")) { 
        break; 
    } 
    try { 
    // Autoboxing: Converting primitive int to Integer 
        numbers.add(Integer.parseInt(input)); 
        } catch (NumberFormatException e) { 
        System.out.println("Invalid input, please enter an integer."); 
        } 
    } 
    int sum = 0; 
    for (Integer num : numbers) { 
    // Unboxing: Converting Integer to primitive int 
        sum += num; 
    } 
    System.out.println("Sum of entered integers: " + sum); 
    sc.close(); 
    } 
} 