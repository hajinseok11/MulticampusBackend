package Ex04_API_IO;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * File 객체를 활용한 예제
 * file참조변수에 할당된 File객체의 내부에 있는 파일과 모든 폴더의 정보출력
 * 
 * tool --- [폴더]
 * ....
 * ....
 * ArgsTest.java ------ [파일(15:2024/03/29)]
 *                         ----  -----------
 * 1. 지정한 File객체의 내부정보(폴더 내부의 모든 파일과 디렉토리 정보)를 받아올 수 있는 메소드를 찾기
 *  => File클래스의 API문서에서 결과가 배열이나 자료구조인 메소드를 찾기
 *  => FIle API 문서에서 사용방법을 찾아서 작업   
 * 
 */
public class Ex02_FileExam {
    public static void main(String[] args) {
        File file = new File("C:/MulticampusBackend");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        File [] files = file.listFiles();
        for(File f:files){
            if(f.isDirectory()){
                System.out.println("["+f.getName()+"] ---------------- [폴더]");
            }else{
                System.out.println(f.getName()+ "] ---------------- [파일("
                                                    + f.length()+":"
                                                    + sdf.format(f.lastModified())
                                                    +":"
                                                    +sdf.format(new Date(f.lastModified()))
                                                    +")]");
            }
        }
    }
    
}
