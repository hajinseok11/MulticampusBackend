package Ex04_API_IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

//읽기는 BufferedReader
//쓰기는 PrintWriter 자주사용: 프린트스트림에서 향상된기능
public class Ex14_PrintWriterTest {
	public static void main(String[] args) {
		//fstFile1을 BufferedReader로 읽어서 PrintWriter로 out.txt로 출력하기
		BufferedReader br = null; 
		PrintWriter pw = null;
			try {
				br = new BufferedReader(new FileReader("c:/MulticampusBackend/clientweb/java/Ex03_advancedjava/src/data/fstFile1.txt"));
				pw = new PrintWriter("c:/MulticampusBackend/clientweb/java/Ex03_advancedjava/src/data/out.txt");
				String line="";
				while((line = br.readLine())!=null) {
					pw.println(line);
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}finally {
				if(br!=null)
					try {
						br.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				if(pw!=null) pw.close();
			}
		
	}

}
