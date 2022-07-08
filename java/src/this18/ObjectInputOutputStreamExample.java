package this18;
/*
 * objectinputstream �� ��Ʈ�����κ���
 * �о���� ����ȭ�� ��ü�� ������ȭ�ؼ� ��ü�� �����Ҽ��ִ�.
 * ������ȭ�ҋ� �ʿ��� Ŭ���� ������ ã�����Ұ��FileNotFoundException�� �߻���Ų��.
 * 
 *  objectoutputstream�� ���ؼ� ����ȭ�� �� ������ ��ϵ� data��ü���� dataŬ������ �ݵ�� serializable�� �����ϰ��ִ�
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
		oos.writeObject(new String("ȫ�浿"));
		
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
