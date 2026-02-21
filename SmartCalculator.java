import java.util.Scanner; 

public class SmartCalculator {
    public static void main(String[] args) { // 2. This is the "Engine"
        Scanner input = new Scanner(System.in); // Create a scanner object

        System.out.println("--- Welcome to your Home-Built Calculator ---");
        
        System.out.print("Enter first number: ");
        int num1 = input.nextInt(); // 3. Save first number

        System.out.print("Enter second number: ");
        int num2 = input.nextInt(); // 4. Save second number

        int sum = num1 + num2; // 5. The Logic (DSA starts here!)
        
        System.out.println("The total sum is: " + sum);

        input.close(); // Clean up
    }
}