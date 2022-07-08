package this18;
/*
 * objectinputstream 은 스트림으로부터
 * 읽어들인 직렬화된 객체를 역직렬화해서 객체를 생성할수있다.
 * 역직렬화할떄 필요한 클래스 파일을 찾지못할경우FileNotFoundException을 발생시킨다.
 * 
 *  objectoutputstream을 통해서 직렬화된 후 파일을 기록된 data객체생성 data클래스는 반드시 serializable을 구현하고있다
 * */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectInputOutputStreamExample {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("src/this18/ObjectInputOutputStreamExample.dat");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		oos.writeObject(new Integer(10));
		oos.writeObject(new Double(3.14));
		oos.writeObject(new int[] {1,2,3});
		oos.writeObject(new String("홍길동"));
		
		oos.flush(); oos.close();fos.close();
		FileInputStream fis=new FileInputStream("src/this18/ObjectInputOutputStreamExample.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Integer obj1=(Integer)ois.readObject();
		Double obj2 =(Double)ois.readObject();
		int [] obj3 =(int[])ois.readObject();
		String obj4 =(String)ois.readObject();
		
		ois.close(); fis.close();
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3[0]+","+obj3[1]+","+obj3[2]);
		System.out.println(obj4);

	}

}
