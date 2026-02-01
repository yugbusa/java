import java.util.Scanner;

public class problem_7 {
    public static void main(String[] args) {
        problem_7 yb = new problem_7();
        yb.rangePrime();
    }

    void rangePrime() {

        int a, b, count, k = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the starting number: ");
        a = sc.nextInt();

        System.out.print("Enter the ending number: ");
        b = sc.nextInt();
        int n = b - a + 1;
        int c[] = new int[n];

        for (int i = a; i <= b; i++) {
            count = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }

            if (count == 2) { // prime number
                c[k] = i;
                k++;
            }
        }

        System.out.println("Prime numbers are:");
        for (int m = 0; m < k; m++) {
            System.out.println(c[m]);
        }
        sc.close();
    }
}