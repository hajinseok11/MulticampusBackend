package Ex06_Network;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

// InetAddress -> 자바에서 IP주소를 모델링 해놓은 객체
//                로컬과 도메인을 통해서 IP주소를 가져올 수 있도록 지원되는 API
public class Ex01_InetAddressTest {
    public static void main(String[] args) {
        try {
            InetAddress ia = InetAddress.getByName("www.naver.com");
            System.out.println("ia.getHostName()=>" + ia.getHostName());
            System.out.println("ia.getHostAddress()=>" + ia.getHostAddress());
            System.out.println("InetAddress.getLocalHost)=>" + InetAddress.getLocalHost());
            System.out.println("================================");
            InetAddress [] iaArr = InetAddress.getAllByName(args[0]);
            for(InetAddress ip : iaArr){
                System.out.println("ip.getHostName()=>" + ip.getHostName());
                System.out.println("ip.getHostAddress()=>" + ip.getHostAddress());
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
