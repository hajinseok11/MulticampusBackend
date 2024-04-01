package Ex04_API_IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// byte 단위입력
// FileInputStream을 이용해서 파일을 읽고 콘솔로 출력하기
public class Ex07_FileReaderTest2 {
    public static void main(String[] args) {
        FileReader fis = null;
        try{
            // 1. 파일오픈
            fis = new FileReader("c:/MulticampusBackend/clientweb/java/Ex03_advancedjava/src/data/test.txt"); 
            int count = 0;
            long start = System.nanoTime();
            // 2. 파일 엑세스
            while (true) {
                int data = fis.read();
                if(data==-1){
                    break;
                }
                System.out.print((char)data);
                count++; // 엑세스 횟수를 체크하기 위한 int형 변수
            }
            long stop = System.nanoTime();
            System.out.println();
            System.out.println("실행횟수 =>"+ count);    
            System.out.println("실행시간 =>"+ (stop-start));    
        }catch(FileNotFoundException e){
            System.out.println("FileNotFoundException~~~");
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally{
            // 3. 자원반납
            try {
                if (fis!=null)fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
}
