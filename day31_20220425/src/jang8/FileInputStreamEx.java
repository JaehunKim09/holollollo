package jang8;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx {

	public static void main(String[] args) {
		FileInputStream in = null;
		try {
			in = new FileInputStream("src/jang8/data.txt");//data.txt�� ������ �ѱ��̶� ���� //("c:\\windows\\system.ini");
			
			int c;
			while((c = in.read())!= -1) {
				System.out.print((char)c);
			}
			in.close();
		}catch(IOException e) {
			System.out.println("����� ����");
		}
	}
}
