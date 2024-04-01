package Ex04_API_IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex12_Grade {
	public static void main(String args[]) { 
		
		Ex12_Grade grade = new Ex12_Grade();
		
		String fileName = "score.txt";
		grade.printGrade(fileName);
		
	}
		
	public void printGrade(String fileName) {
		
		/* 이곳에 프로그램을 완성하십시오. */
		BufferedReader br = null;
		try {
			br =  new BufferedReader(new FileReader("c:/MulticampusBackend/clientweb/java/Ex03_advancedjava/src/data/score.txt"));
			while(true) {
				String line = br.readLine();
				
				if(line==null) {
					break;
				}
				String[] arr = line.split(",");
				System.out.println(arr[0]+"의 점수는 "+arr[1]+"점 입니다.");
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
		
		//System.out.println();
		
	} 
	
}