package Ex04_API_IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// byte 단위입력
// FileInputStream을 이용해서 파일을 읽고 콘솔로 출력하기
public class Ex06_FileInputStreamTest2 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try{
            // 1. 파일오픈
            fis = new FileInputStream("c:/MulticampusBackend/clientweb/java/Ex03_advancedjava/src/data/test.txt"); 
            // 2. 파일 엑세스
            while (true) {
                int data = fis.read();
                if(data==-1){
                    break;
                }
                System.out.print((char)data);
            }
        }catch(FileNotFoundException e){
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
