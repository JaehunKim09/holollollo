package jang8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {

	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("src/jang8/test.txt");
			FileInputStream fin = null;

			for (int i = 0; i < 10; i++) {
				int n = 10 - i;//����� ����� ����
				fout.write(n);//���Ͽ� ������� ���̳ʸ��� ����

			}
			fout.close();//��Ʈ���ݴ´�

			fin = new FileInputStream("src/jang8/test.txt");
			int c = 0;
			while ((c = fin.read()) != -1) {
				System.out.print(c + " ");
			}
			fin.close();
		} catch (IOException e) {
			System.out.println("����� ����");
		}

	}

}