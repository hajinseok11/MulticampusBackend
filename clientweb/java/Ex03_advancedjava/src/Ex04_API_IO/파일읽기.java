package Ex04_API_IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

public class 파일읽기 {
    public static void main(String[] args) {
        /** 1) 기본 준비 */
        // 읽어올 파일의 경로
        final String PATH = "./test.txt";
        // 읽어온 내용
        byte[] data = null;

        /* 2) 파일 읽기 */
        InputStream is = null;
        try {
            is = new FileInputStream(PATH);

            // 읽은 내용을 담기 위한 배열을 파일의 용량만큼 사이즈를 할당
            // is.available() -> 열고 있는 파일의 크기
            data = new byte[is.available()];
            // 파일 읽기 - 파라미터로 전달된 배열 안에, 파일의 내용을 담아준다.
            is.read(data);
            System.out.println("[INFO] 파일 읽기 성공 >> "+ PATH);
            } catch (FileNotFoundException e) {
                System.out.println("[ERROR] 지정된 경로를 찾을 수 없음. >> "+PATH);
                e.printStackTrace();
            } catch (IOException e) {
                System.out.println("[ERROR] 파일 읽기 실패 >> "+ PATH);
            e.printStackTrace();
            }catch(Exception e){
                System.out.println("[ERROR] 알 수 없는 에러 >> " +PATH);
                e.printStackTrace();
            }finally{
                if(is!=null){
                    try {
                        is.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            /* 3) 읽은 내용(byte[])을 문자열로 변환 */
            // data 배열에 내용이 있다면?
            if(data != null){
                try {
                    String content = new String(data,"utf-8");
                    System.out.println(content);
                } catch (UnsupportedEncodingException e) {
                    System.out.println("[ERROR] 인코딩 지정 에러");
                    e.printStackTrace();
                }
            }
    }
}
