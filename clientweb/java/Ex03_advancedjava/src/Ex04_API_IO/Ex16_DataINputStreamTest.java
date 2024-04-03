package Ex04_API_IO;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class Ex16_DataINputStreamTest {
    public static void main(String[] args) throws Exception {
        DataInputStream dis = new DataInputStream(new FileInputStream("c:/MulticampusBackend/clientweb/java/Ex03_advancedjava/src/data/dos.txt"));

        System.out.println(dis.readInt());
        System.out.println(dis.readDouble());
        System.out.println(dis.readUTF());
        dis.close();
    }
}
