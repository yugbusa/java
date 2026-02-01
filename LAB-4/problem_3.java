import java.util.Scanner;

public class problem_3 {
    public static void main(String[] args) {
        problem_3 yb = new problem_3();
        yb.largest();

    }

    void largest() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first no.:");
        int a = sc.nextInt();
        System.out.print("Enter the second no.:");
        int b = sc.nextInt();
        System.out.print("Enter the third no.:");
        int c = sc.nextInt();
        int largest = (a > b ? (a > c ? a : c) : (b > c ? b : c));
        System.out.println("The largest no. is " + largest);
        sc.close();
    }

}