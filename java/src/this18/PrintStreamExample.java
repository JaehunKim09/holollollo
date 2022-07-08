package this18;
/*
 * PrintStream
 * 모든 자료형을 출력할수있는 print() println() 메소드가 오버로딩 되어있다.
 * 프로그램이 시작되면 장치와 연결된 출력 스트림인 System.in, System.out, System.err, 객체가 PrintStream객체이다.
 * 다른 스트림과는 다르게 플러쉬기능을 자동으로 처리할수있는 생성자를 가지고 있다.
 * 모든 메소드는 예외처리를 하지않는다.
 * 
 * PrintWriter
 * PrintWriter는 다른 스트림과 다르게 바이트 출력 스트림과 문자출력 스트림을 가지고 객체를 생성할수있는 클래스이다.
 * 자동 플러쉬기능(auto flush)을 갖고있다.
 * PrintWriter클래스의 생성자는 FileNotFoundException예외를 발생하기 때문에 반드시 예외처리를 해야한다.
 * */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamExample {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("src/this18/PrintStreamExample.txt");
		PrintStream ps = new PrintStream(fos);
		
		ps.println("[프린터 보조 스트림]");
		ps.print("마치 ");
		ps.println("프린터가 출력하는 것처럼");
		ps.println("데이터를 출력합니다");
		
		ps.flush();
		ps.close();
		fos.close();

	}

}
