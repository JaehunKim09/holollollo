package this18;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class OutputStreamWritetExample {

	public static void main(String[] args) throws Exception  {
//		FileOutputStream fos = new FileOutputStream("src/this18/OutputStreamWriterExample.txt");
//		Writer wr = new OutputStreamWriter(fos);
		
		FileReader fr = new FileReader("src/this18/OutputStreamWriterExample.java");
		FileWriter fw = new FileWriter("src/this18/Output.txt",true);
		int read;
		char ch[] = new char[100];
		while((read = fr.read(ch))!= -1) {
			String data = new String(ch,0,read);
			
			System.out.println(data);
			fw.write(data);
		}
		fw.flush();
		fw.close();
		fr.close();
		
		
//		String data = "바이트 출력 스트림을 문자 출력 스트림으로 변환";
//		wr.write(data);
//		
//		wr.flush();
//		wr.close();
		System.out.println("파일 저장 끝");

	}

}
