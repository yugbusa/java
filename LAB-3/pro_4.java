import java.util.Scanner;

public class pro_4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
         System.out.println("enter the fahrenheit value");
        int f=sc.nextInt();
        System.out.println("enter the celsius value"+((f-32)*5/9.0));
        sc.close();
       
    }
    
}
