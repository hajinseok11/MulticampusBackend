package Ex04_API_IO;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class Ex03_InputStreamTest {
    public static void main(String[] args) {
        double mypi = Math.PI;
        // System.out.println(mypi);
        InputStream in = System.in;
        PrintStream myout = System.out;
        // myout.println("test");
        try {
            while(true){
                int data = in.read();
                if(data ==13){
                    break;
                }
                System.out.print((char)data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
