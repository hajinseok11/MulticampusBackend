package Ex06_Network;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Ex05_MyNetClient01 {
    public static void main(String[] args) {
        // 서버와 통신할 수 있는 클라이언트 소켓 객체를 생성
        // 서버의 ip와 port정보를 알아야 한다. 즉, 서버가 open해 놓은 port 로 접속
        // Socket객체를 생성하면 생상과 동시에 매개변수로 전달한 ip주소로 접속한다.
        // FileReader 클래스가 생성자에서 OS와 통신하면서 파일을 오픈하고 연결했던 것 처럼
        // Socket클래스는 생성자에서 서버에 연결
        try {
            // Socket socket = new Socket("49.142.60.150",50000);
            Socket socket = new Socket("43.202.143.132",50000);
            System.out.println("서버에 접속완료");
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
