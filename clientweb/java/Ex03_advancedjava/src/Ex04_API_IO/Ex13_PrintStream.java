package Ex04_API_IO;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Ex13_PrintStream {
    public static void main(String[] args) throws Exception {
        PrintStream ps = new PrintStream("c:/MulticampusBackend/clientweb/java/Ex03_advancedjava/src/data/p_out.txt");
        ps.println(3);
        ps.println('C');
        ps.close();
    }
}
