package this18;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("문자열 입력>");
		String s=sc.nextLine();
		System.out.println(s);
		System.out.println();
		
		System.out.print("정수 입력>");
		int i=sc.nextInt();
		System.out.println(i);
		System.out.println();
		
		System.out.print("실수 입력>");
		double d=sc.nextDouble();
		System.out.println(d);
		

	}

}
