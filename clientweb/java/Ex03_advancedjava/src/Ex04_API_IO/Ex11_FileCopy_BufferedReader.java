package Ex04_API_IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// FileReader를 BufferedReader와 함께 사용해서 파일을읽고 FileWriter로 파일을 쓰기
public class Ex11_FileCopy_BufferedReader {
    public static void main(String[] args) {
        BufferedReader br = null;
        FileWriter fw = null;
        try{
            br = new BufferedReader(new FileReader("c:/MulticampusBackend/clientweb/java/Ex03_advancedjava/src/Ex01_API_Lang/Ex13_MathTest.java")); 
            fw = new FileWriter("c:/MulticampusBackend/clientweb/java/Ex03_advancedjava/src/data/output.txt"); 
            int count = 0;
            long start = System.nanoTime();
            
            // String line = ""; // readLine 메소드의 실행결과를 저장할 변수
            // while ((line = br.readLine()) != null ) { // while문의 ()안에 조건을 정의
            //                                     // 파일의 한 문자를 읽어서 null이 아닐동안 계속 반복작업
            //         fw.write(line);
            //         count++;
            // }
            while (true){
                String line = br.readLine();
                if(line == null){
                    break;
                }
                fw.write(line);
                count++;
            }
            long stop = System.nanoTime();
            System.out.println();
            System.out.println("실행횟수 =>"+ count);       // 실행 횟수 => 14
            System.out.println("실행시간 =>"+ (stop-start));    // 실행 시간 => 2736600


        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally{
            try {
                if (br!=null)br.close();
                if(fw != null)fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
}
