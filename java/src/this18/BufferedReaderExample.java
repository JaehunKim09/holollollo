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
		BufferedReader br=new BufferedReader(re);//���� ��Ʈ�� ����
		
		System.out.print("�Է� : ");
		String line = br.readLine();//���� ��ü �б�
		
		System.out.print("��� : "+line);

	}

}
