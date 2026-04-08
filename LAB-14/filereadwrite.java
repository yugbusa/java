

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class filereadwrite {
    public static void main(String[] args) throws IOException {
        FileOutputStream fout=new FileOutputStream("CSE4_8.txt");
        FileInputStream fin=new FileInputStream("CSE_4.txt");


        String s="Welcome to java";
        byte[] b=s.getBytes();
        fout.write(b);
    

    int i= 0;
    while((i=fin.read())!=-1){
        System.out.println((char)i);
    }
    fin.close();
    fout.close();
}
}