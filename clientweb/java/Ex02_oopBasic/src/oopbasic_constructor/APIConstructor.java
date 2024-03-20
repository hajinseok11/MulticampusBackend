package oopbasic_constructor;

import java.io.FileInputStream;

// API의 생성자들을 확인
public class APIConstructor {
    public static void main(String[] args) throws Exception {
        // 1. String 클래스
        byte [] data1 = {97,98,99,100}; // ASCII
        char [] data2 = {'0','1','0','-'};
        String str1 = new String(data1);
        System.out.println(str1);

        String str2 = new String(data1,2,2); // index0 부터 시작
        System.out.println(str2);

        String str3 = new String(data2);
        System.out.println(str3);

        String str4 = new String(data2,0,3);
        System.out.println(str4);

        // FileInputStream
        FileInputStream fis = new FileInputStream("test.txt");
        System.out.println((char)fis.read());

    }
    
}
