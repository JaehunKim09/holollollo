package this18;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("���ڿ� �Է�>");
		String s=sc.nextLine();
		System.out.println(s);
		System.out.println();
		
		System.out.print("���� �Է�>");
		int i=sc.nextInt();
		System.out.println(i);
		System.out.println();
		
		System.out.print("�Ǽ� �Է�>");
		double d=sc.nextDouble();
		System.out.println(d);
		

	}

}
