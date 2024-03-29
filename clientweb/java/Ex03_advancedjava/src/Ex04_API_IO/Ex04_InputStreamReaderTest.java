package Ex04_API_IO;
// InputSreamReader를 이용해서 한 문자씩 읽을 수 있도록 수정
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Ex04_InputStreamReaderTest {
    public static void main(String[] args) {
        double mypi = Math.PI;

        // InputStream in = System.in;
        InputStreamReader isr = new InputStreamReader(System.in);
        PrintStream myout = System.out;
        // myout.println("test");
        try {
            while(true){
                int data = isr.read();
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
