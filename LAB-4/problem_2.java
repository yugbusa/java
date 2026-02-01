import java.util.Scanner;

public class problem_2 {
    public static void main(String[] args) {
        problem_2 yb = new problem_2();
        yb.evenOrOdd();
    }

    void evenOrOdd() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no.:");
        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println("The no. is Even");
        } else {
            System.out.println("The no. is Odd");
        }
        sc.close();
    }
}