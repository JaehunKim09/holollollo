package this18;
/*
 * PrintStream
 * ��� �ڷ����� ����Ҽ��ִ� print() println() �޼ҵ尡 �����ε� �Ǿ��ִ�.
 * ���α׷��� ���۵Ǹ� ��ġ�� ����� ��� ��Ʈ���� System.in, System.out, System.err, ��ü�� PrintStream��ü�̴�.
 * �ٸ� ��Ʈ������ �ٸ��� �÷�������� �ڵ����� ó���Ҽ��ִ� �����ڸ� ������ �ִ�.
 * ��� �޼ҵ�� ����ó���� �����ʴ´�.
 * 
 * PrintWriter
 * PrintWriter�� �ٸ� ��Ʈ���� �ٸ��� ����Ʈ ��� ��Ʈ���� ������� ��Ʈ���� ������ ��ü�� �����Ҽ��ִ� Ŭ�����̴�.
 * �ڵ� �÷������(auto flush)�� �����ִ�.
 * PrintWriterŬ������ �����ڴ� FileNotFoundException���ܸ� �߻��ϱ� ������ �ݵ�� ����ó���� �ؾ��Ѵ�.
 * */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamExample {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("src/this18/PrintStreamExample.txt");
		PrintStream ps = new PrintStream(fos);
		
		ps.println("[������ ���� ��Ʈ��]");
		ps.print("��ġ ");
		ps.println("�����Ͱ� ����ϴ� ��ó��");
		ps.println("�����͸� ����մϴ�");
		
		ps.flush();
		ps.close();
		fos.close();

	}

}
