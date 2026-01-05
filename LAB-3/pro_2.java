import java.util.Scanner;

public class pro_2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.println("enter a,b");
        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.println("enter the mathematical operater");
        String symbol=sc.next();
        sc. close();
        switch (symbol) {
            case "+":
                System.out.println("sum of "+(a+b));
                break;
            case "-":
                System.out.println(" subtraction of"+(a-b));
                break;
            case "*":
                System.out.println("product"+(a*b));
                break;
            case "/":
                System.out.println("division"+(a/b));  
                break;
            case "%":
            System.out.println("modulas"+(a%b));  
             break;
        
           
        }



    }
    
}
