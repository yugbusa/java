import java.util.Scanner;
public class A6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a chercter");
        char a=sc.next().charAt(0);
        if (a=='a'|| a=='e'|| a=='i'|| a=='o'|| a=='u' ) {
            System.out.println("chearter is vowel");
        }
        else{
            System.out.println("not vowal");
        }sc.close();
    }
    
}


    

