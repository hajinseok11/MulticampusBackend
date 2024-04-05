package Ex04_API_IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

public class 파일쓰기 {
    public static void main(String[] args) {
        /* 1) 기본준비 */
        // 저장할 파일의 경로
        final String PATH = "./test.txt";
        // 파일에 저장할 내용
        String data = "안녕하세요. 자바";
        // 저장할 파일의 경로
        // final String PATH = "./test.csv";
        // 파일에 저장할 내용
        // String data = "하진석,20,175,100\n하진석,20,175,100\n하진석,20,175,100\n";

        /* 2) 저장할 내용을 스트림(byte 배열 -> 이진수모음)으로 변환 */
        byte [] buffer= null;
        try {
            buffer = data.getBytes("utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        /* 3) 파일 쓰기 */
        OutputStream os = null;
        try {
            // 저장할 파일 스트림 생성
            os = new FileOutputStream(PATH);
            // 파일 쓰기
            os.write(buffer);
            System.out.println("[INFO] 파일 저장 성공 >> "+ PATH);
        } catch (FileNotFoundException e) {
            System.out.println("[ERROR] 저장된 경로를 찾을 수 없음 >> "+PATH);
            e.printStackTrace();
        } catch (IOException e){
            System.out.println("[ERROR] 파일 저장 실패 >> "+ PATH);
            e.printStackTrace();
        } catch (Exception e){
            System.out.println("[ERROR] 알 수 없는 에러 >> "+ PATH);
            e.printStackTrace();
        } finally {
            if (os !=null){
                try{
                    os.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }          
    }
}

