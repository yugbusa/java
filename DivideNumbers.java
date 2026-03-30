import java.util.Scanner;

public class DivideNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number (Num1): ");
            String str1 = sc.nextLine();
            int num1 = Integer.parseInt(str1);   

            System.out.print("Enter second number (Num2): ");
            String str2 = sc.nextLine();
            int num2 = Integer.parseInt(str2);   

            if (num2 == 0) {
                throw new ArithmeticException("Division by zero is not allowed");
            }

            int result = num1 / num2;
            System.out.println("Result: " + result);
        }

        catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid integers only.");
        }

        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }

        finally {
            sc.close();
            System.out.println("Program finished.");
        }
    }
}