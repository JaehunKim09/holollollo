package this18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferedReaderExample {

	public static void main(String[] args) throws Exception {
		InputStream is= System.in;
		Reader re=new InputStreamReader(is);
		BufferedReader br=new BufferedReader(re);//버퍼 스트림 생성
		
		System.out.print("입력 : ");
		String line = br.readLine();//한줄 전체 읽기
		
		System.out.print("출력 : "+line);

	}

}
