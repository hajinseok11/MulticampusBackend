package Ex06_Network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/*
 * 키보드로 입력하는 내용을 서버로 보내기
 * 서버가 다시 보내오는 메세지를 콘솔에 출력하기
 */
public class Ex14_EchoClientExam02 {
    public static void main(String[] args) {
        Socket socket = null;
        BufferedReader in = null;
        PrintWriter out = null;
        BufferedReader keyin = null;
        try {
            // 1. 서버에 접속
            socket = new Socket("49.142.60.150",12346);
            // 2. 서버와 통신할 입출력 스트림과 키보드로 입력하는 내용을 읽을 스트림을 생성
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(),true);
            keyin = new BufferedReader(new InputStreamReader(System.in));
            String sendMsg = "";    // 서버로 보낼 메시지
            String reMsg = "";      // 서버에서 받는 메시지

            // 서버가 보내온 환영메시지를 읽기
            reMsg = in.readLine();
            System.out.println("서버>>>"+reMsg);
            while ((sendMsg = keyin.readLine())!=null) {
                // 클라이언트 -> 서버 (키보드 입력한 데이터 보내기)
                out.println(sendMsg);
                // 클라이언트 <- 서버
                reMsg = in.readLine();
                System.out.println("서버>>>"+reMsg);
            }

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
