package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Scanner;

/*
 * 자바 소스 파일이름을 입력하세요>>
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
		System.out.println("자바 소스 파일이름을 입력하세요>>");
		//파일리더 생성해주세요 in=null;
		FileReader in=null;
		
		//s 에서 엔터전까지 읽어오세요.
		src=sc.nextLine();
		//try~chatch
		try {
			//in파일객체 생성
			in = new FileReader(src);
		int c;
		//while() 내에서 입력한 파일을 읽어서 화면에 출력해 주세요
		while((c=in.read())!= -1) {
			System.out.print((char)c);
		}
		in.close();
		sc.close();

		}catch (Exception e) {
			System.out.println("입출력 오류");
		}
		
	}

}
