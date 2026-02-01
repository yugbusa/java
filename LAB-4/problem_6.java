import java.util.Scanner;

public class problem_6 {
    public static void main(String[] args) {
        problem_6 yb = new problem_6();
        yb.palindrome();

    }

    void palindrome() {

        int rem, temp2 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no.:");
        int a = sc.nextInt();
        int temp = a;
        while (a != 0) {
            rem = a % 10;
            a = a / 10;
            temp2 = temp2 * 10 + rem;
        }
        if (temp == temp2) {
            System.out.println("The no. is palindrome");
        } else {
            System.out.println("The no. is not palindrome");
        }
        sc.close();
    }
}