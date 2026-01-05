import java.util.Scanner;


public class pro_5 {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.println("enter the first num:");
        int a=sc.nextInt();
        System.out.println("enter the second num:");
        int b=sc.nextInt();
        System.out.println("enter the third num:");
        int c=sc.nextInt();
        sc.close();
        
        if(a>b && a>c){
            System.out.println("first num is largest:"+a);        
        }
        else if (b>a && b>c){
            System.out.println("second num is largest;"+b);
        }

        else{
            System.out.println("third num is largest:"+c);
        }
    }

    
}
