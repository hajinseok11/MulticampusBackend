package Ex06_Network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;

import java.net.URL;

// URL 클래스
// 웹상의 주소를 자바에서 엑세스 할 수 있도록 제공되는 클래스
// 네트워크로 연결할 수 있고 리소스를 가져올 수 있다. 
public class Ex02_URLTest {
    public static void main(String[] args) {
        try {
            // URL url = new URL("https://www.naver.com");
            URL url = new URL("https://n.news.naver.com/article/296/0000076324");
            //                     ------  ---------------- ----------------------
            //                     프로토콜     호스트            path
            //                                              -----------------------
            //                                                   file                                                                
            System.out.println(url);
            System.out.println("url.getHost()=>" +url.getHost());
            System.out.println("url.getPath()=>" +url.getPath());
            System.out.println("url.getPort()=>" +url.getPort());
            // port정보를 리턴
            // -1을 리턴하는 것은 -1포트로 접속했다라는 의미가 아니라 프로토콜에 등록되어있는 기본 폰트로 접속했다는 의미
            // http 프로토콜은 80
            System.out.println("url.getPort()=>" + url.getPort());
            System.out.println("url.getProtocol()=>" +url.getProtocol());
            System.out.println("url.getFile()=>" +url.getFile());
            // in이 참조하는 데이터를 읽어서 모두 출력하기
            // input하는 경우 한글이 있으면 BufferedReader를 사용,바이너리데이터(이미지, 동영상, 소리...)
            // BufferedInputStream, FileInputStream
            // 출력: 파일로 - FileOutPutStream

            // url.openStream()이 InputStream을 반환하므로 한글이 있는 경우 깨져서 전달이 되므로
            // Reader의 하위 스트림을 이용해서 읽어주어야 한다.
            // InputStreamReader로 변환한 후 빠르게 읽기 위해서 BufferedReder로 변환
            // => BufferedReader로 OpenStream의 결과를 바로 받지 못하는 이유는 BufferedReader가 보조스트림이므로
            //    바로 InputStream으로 변환하는 기능이 없다.
            // InputStream in = url.openStream();
            // InputStreamReader isr = new InputStreamReader(in);
            // BufferedReader br = new BufferedReader(isr);
            BufferedReader br = new BufferedReader(
                                        new InputStreamReader(url.openStream()));
            while(true){
                String data = br.readLine();
                if(data == null){
                    break;
                }
                System.out.println(data);
            }
        } catch (MalformedURLException e){
                e.printStackTrace();
        } catch (IOException e) {
                e.printStackTrace();
        }
    }
}
