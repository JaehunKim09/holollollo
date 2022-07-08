package test;

import java.io.FileWriter;
import java.io.PrintWriter;

public class SawonWriter {

	public static void main(String[] args) {
		String fileName="src/test/sawon.txt";
		
		try {
			FileWriter fw=new FileWriter(fileName);
			PrintWriter pw=new PrintWriter(fw);
			
			pw.println("a1,90,90,90,90");
			pw.println("a2,80,80,80,80");
			pw.println("a3,70,70,70,70");
			System.out.println("sawon.txt에 저장");
			fw.close();pw.close();
		}catch (Exception e) {
			System.out.println(e.getMessage()+"입출력 에러");
			
		}

	}

}
