import java.util.Scanner;

public class pro_1  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks of maths");
        int maths = sc.nextInt();
        System.out.println("emter the marks of chemistry");
        int chemistry = sc.nextInt();
        System.out.println("emter the marks of biology");
        int biology = sc.nextInt();
        System.out.println("emter the marks of english");
        int english = sc.nextInt();
        System.out.println("emter the marks of computer");
        int computer = sc.nextInt();
        sc.close();
       double totalmarks = maths + chemistry + biology + english + computer;
       double percentage = (totalmarks / 500) * 100;
       System.out.println("percentage is " + percentage);
       if (percentage>=60) {
        System.out.println("first division");
       }
       else if (percentage<50 && percentage>59) {
        System.out.println("second division");  
       }
       else if (percentage<40 && percentage>49) {
        System.out.println("third division");        
       }
       if (percentage<40) {
        System.out.println("fail");
       }
    }
    
}
