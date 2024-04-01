package Ex04_API_IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// FileReadr로 파일을 읽고 FileWriter로 파일을 쓰기
public class Ex09_FileCopy {
    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;
        try{
            fr = new FileReader("c:/MulticampusBackend/clientweb/java/Ex03_advancedjava/src/Ex01_API_Lang/Ex13_MathTest.java"); 
            fw = new FileWriter("c:/MulticampusBackend/clientweb/java/Ex03_advancedjava/src/data/output.txt"); 
            int count = 0;
            long start = System.nanoTime();
            
            int data = 0; // read메소드의 실행결과를 저장할 변수
            while ((data = fr.read()) != -1 ) { // while문의 ()안에 조건을 정의
                                                // 파일의 한 문자를 읽어서 -1이 아닐동안 계속 반복작업
                    fw.write(data);
                    count++;
            }
            long stop = System.nanoTime();
            System.out.println();
            System.out.println("실행횟수 =>"+ count);    // 실행횟수 -> 624
            System.out.println("실행시간 =>"+ (stop-start));    // 실행시간 => 4134400


        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally{
            try {
                if (fr!=null)fr.close();
                if(fw != null)fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
}
