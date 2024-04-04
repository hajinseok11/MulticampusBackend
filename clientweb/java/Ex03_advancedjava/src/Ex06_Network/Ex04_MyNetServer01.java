package Ex06_Network;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 서버용 프로그램
 * => 서버는 클라이언트가 언제라도 접속할 수 있도록 포트를 열고 무한대기 해야한다.
 *                                                        ----------
 *                                                          무한루프
 */
public class Ex04_MyNetServer01 {
    public static void main(String[] args) {
        // 1. 클라이언트와 통신할 수 있도록 준비
        //    => ServerSocket객체를 생성하기
        try {
            ServerSocket server = new ServerSocket(50000);  // 65535번 까지 사용이 가능
            System.out.println("서버 준비완료.... 클라이언트의 접속을 기다림");
            // 2. 클라이언트가 접속하면 클라이언트 정보를 가져와서 통신 준비를 해야한다.
            //    => 접속한 클라이언트 정보를 객체로 만들어서 리턴
            //    => 클라이언트가 접속할 때까지 대기하면서 클라이언트가 접속하면 클라이언트와 통신할 수 있도록 Socket
            //       객체를 만들어서 리턴
            while(true){
                Socket client = server.accept();
                InetAddress clientIP = client.getInetAddress();
                System.out.println("접속한 클라이언트 => "+ clientIP.getHostAddress());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
