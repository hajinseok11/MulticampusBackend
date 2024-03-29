package Ex04_API_IO;

import java.io.File;

// File클래스의 API에 대해서 살펴보기
// => File과 Directory를 제어하기 위해서 제공되는 클래스
// 
public class Ex01_FileTest {
    public static void main(String[] args) {
        // 기본경로가 프로젝트 경로
        // C:\MulticampusBackend
        File file1 = new File("c:/MulticampusBackend/clientweb/java/Ex03_advancedjava/src/data/test.txt");
        File file2 = new File("C:/MulticampusBackend");
        System.out.println(file1);
        System.out.println(file1.length());
        System.out.println("file1.canRead()=>" + file1.canRead());
        System.out.println("file1.canWrite()=>" + file1.canWrite());
        System.out.println("file1.getAbsolutePath()=>" + file1.getAbsolutePath());
        System.out.println("file1.getName()=>" + file1.getName());
        System.out.println("file1.getParent()=>" + file1.getParent());
        System.out.println("file1.getPath()=>" + file1.getPath());
        
        System.out.println("file1.isDirectory()=>" + file1.isDirectory());
        System.out.println("file1.isFile()=>" + file1.isFile());
        System.out.println("file2.isDirectory()=>" + file2.isDirectory());
        System.out.println("file2.isFile()=>" + file2.isFile());

        System.out.println("file1.lastModified()=>"+file1.lastModified());
        System.out.println("file1.length()=>"+file1.length());

        System.out.println(file2);
    }
}
