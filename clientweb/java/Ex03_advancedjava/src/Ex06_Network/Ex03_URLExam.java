package Ex06_Network;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Ex03_URLExam {
    public static void main(String[] args) {
        // 이미지는 바이트 단위로 입출력
        URL url = null;
        BufferedInputStream bis = null; // 웹상의 리소스인 이미지와 연결해서 데이터를 읽기 위한 스트림 클래스
        FileOutputStream fos = null;     // 읽은 데이터를 파일로 저장하기 위해서 필요한 스트림 클래스
        try {
            url = new URL("https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMzExMjlfMTI1%2FMDAxNzAxMjU1Njc0NTY5.WpSfeXbN3jP2NrTHnsHe0qTkokSKAh_mOQrwzw0lxo0g.RfoRPTjEiybNNvVFkCQe0FBjAVOOH0CjlqxK9LlTJZUg.PNG.zpfhfhqn%2F%25C8%25AD%25B8%25E9_%25C4%25B8%25C3%25B3_2023-11-29_200101.png&type=sc960_832");
            // 1. URL에 전달한 자원에 접속해서 데이터를 읽기
            bis = new BufferedInputStream(url.openStream());
            fos = new FileOutputStream("src/data/myImg.jpg");
            // 2. 읽어온 스트림을 파일로 저장
            while(true){
                int data = bis.read();
                if(data == -1){
                    break;
                }
                fos.write(data);
            }
        } catch (MalformedURLException e) {
                e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
           try{
                if(bis!=null)bis.close();
                if(fos!=null)fos.close();
            }catch(IOException e){
                e.printStackTrace();
           }
                
            }
        }  
    }


