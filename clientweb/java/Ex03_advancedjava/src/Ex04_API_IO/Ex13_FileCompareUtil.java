package Ex04_API_IO;

import java.io.BufferedReader;
import java.io.FileReader;

/*
 * static메소드 정의하고 호출하는 방법
 * BufferedReader의 사용방법
 * String클래스에서 문자열을 대소문자까지 비교하는 방법
 * ArrayList를 사용하는 방법
 * 
 * 
 */


import java.util.ArrayList;

public class Ex13_FileCompareUtil {
	public static void main(String[] args) {
		try {
			ArrayList<String> result = compareFile("c:/MulticampusBackend/clientweb/java/Ex03_advancedjava/src/data/fstFile1.txt","c:/MulticampusBackend/clientweb/java/Ex03_advancedjava/src/data/scdFile1.txt");
			for(String data:result){
				System.out.println(data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static ArrayList<String> compareFile(String fstFileName, String scdFileName) throws Exception {
		ArrayList<String> result = new ArrayList<>();
		BufferedReader fstFile = new BufferedReader(new FileReader(fstFileName));
		BufferedReader scdFile = new BufferedReader(new FileReader(scdFileName));
		int count = 0;
		while(true){
			String line1 = fstFile.readLine();
			String line2 = scdFile.readLine();
			if(line1 == null){
				break;
			}
			count++;
			if (!line1.equals(line2)){ // line1과 line2가 문자열이 같지 않으면
				result.add("LINE"+count+":"+line2);
			}
		}
		fstFile.close();
		scdFile.close();
		return result;

	}
}
