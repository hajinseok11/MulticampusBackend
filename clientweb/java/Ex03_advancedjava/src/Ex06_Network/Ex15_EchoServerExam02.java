package Ex06_Network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDate;
import java.util.Date;


/*
 * 클라이언트가 키보드로 입력한 내용을 보내오면 메시지를 계속 읽어서 클라이언트에게 다시 보내주기
 */
public class Ex15_EchoServerExam02 {
    public static void main(String[] args) {
        Socket client = null;
        BufferedReader in = null;
        PrintWriter out = null;
        LocalDate now = null;
        try {
            ServerSocket server = new ServerSocket(12346);
            System.out.println("안녕하세요 클라이언트님?");
            while(true){
                // client가 접속하면 client의 정보를 Vector와 같은 동기화가 적용되어있는 자료구조에 저장하는 작업
                client = server.accept();
                String ip = client.getInetAddress().getHostAddress();

                // 클라이언트와 통신할 수 있는 Input/Output 스트림 클래스를 소켓에서 가져오기
                in = new BufferedReader(new InputStreamReader(client.getInputStream()));
                out =new PrintWriter(client.getOutputStream(),true);

                // 클라이언트가 보내는 데이터를 계속 읽어서 클라이언트에게 다시 보내주는 작업을 처리
                out.println("안녕하세요 클라이언트님");
                String reMsg = ""; // 클라이언트가 보내오는 메세지를 저장할 변수
                while (true) {
                    // 서버 <- 클라이언트

                    reMsg = in.readLine();
                    if(reMsg == null){
                        break;
                    }else if(reMsg.equals("안녕하세요?")||reMsg.equals("하이")) {
                        out.println(ip+"님 반가워요");
                    }else if(reMsg.equals("오늘 날짜는")) {
                        out.println(new Date().toString());
                    }else{
                        out.println(ip+"남 어여 가~~");
                    }
                    }
                }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

