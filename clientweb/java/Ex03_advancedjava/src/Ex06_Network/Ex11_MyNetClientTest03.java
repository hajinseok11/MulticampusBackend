package Ex06_Network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Ex11_MyNetClientTest03 {
 public static void main(String[] args) {
        Socket socket = null;
        BufferedReader in = null;
        /*
         * PrintWriter는 출력 버퍼에 임시로 보관되어서 출력될 때까지 대기중인 데이터를 내보내는 작업을 처리
         * flush() 메소드를 호출해서 버퍼를 비우고 데이터를 내보내는 작업을 해야한다.
         * -------
         *        > 출력버퍼를 비우고 데이터를 출력하게 된다.
         */
        PrintWriter out = null; 
        try {
            // 1. 서버에 접속
            socket = new Socket("49.142.60.150",12345);
            // 2. 서버와 통신하기 위한 input/output스트림 객체 생성
            in = new BufferedReader(
                    new InputStreamReader(
                        socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(),true);
            //3. 클라이언트 <- 서버(서버가 보내온 메시지를 읽기 - 2번 연속 읽기)
            String serverMsg1 = in.readLine();
            String serverMsg2 = in.readLine();
            System.out.println("서버가 전송한 메시지 1>>> "+serverMsg1);
            System.out.println("서버가 전송한 메시지 2>>> "+serverMsg2);
            // 4. 클라이언트 -> 서버
            out.println(7);
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
 }   
}
