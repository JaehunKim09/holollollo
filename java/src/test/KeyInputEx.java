package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Scanner;

/*
 * �ڹ� �ҽ� �����̸��� �Է��ϼ���>>
 *src/Test/text.txt
 *a1,90,90,90,90
 *a2,80,80,80,80
 *a3,70,70,70,70
 *
 * */

public class KeyInputEx {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String src;
		System.out.println("�ڹ� �ҽ� �����̸��� �Է��ϼ���>>");
		//���ϸ��� �������ּ��� in=null;
		FileReader in=null;
		
		//s ���� ���������� �о������.
		src=sc.nextLine();
		//try~chatch
		try {
			//in���ϰ�ü ����
			in = new FileReader(src);
		int c;
		//while() ������ �Է��� ������ �о ȭ�鿡 ����� �ּ���
		while((c=in.read())!= -1) {
			System.out.print((char)c);
		}
		in.close();
		sc.close();

		}catch (Exception e) {
			System.out.println("����� ����");
		}
		
	}

}
