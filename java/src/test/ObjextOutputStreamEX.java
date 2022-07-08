package test;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjextOutputStreamEX {

	public static void main(String[] args) {
		ObjectOutputStream oos=null;
		try {
			/*
			 * �޸𸮿� ������ ��ü�� ����ȭ �ؼ� ��Ʈ���� ����
			 * ����Ҽ��ִ�ObjextOutputStream�� ���ؼ� ����ȭ�� �� ���Ϸ� ��ϵ� Data
			 * ��ü ���� DataŬ������ �ݵ��  Serializable �� �����ϰ� �־���Ѵ�.��
			 * */
			oos=new ObjectOutputStream(new FileOutputStream("src/test/test.txt"));
			Data data = new Data();
			data.setNo(25);
			data.setName("ȫ�浿");
			data.setMail("hong@naver.com");
			/*
			 * ObjectOutputStream�� ��ü�� ����ȭ�ؼ� ��Ʈ���� ���� ����Ҽ��ִ� writeObject()�� ����
			 * */
			oos.writeObject(data);
			
		}catch (Exception e) {
			e.printStackTrace();
			
		}finally {
			try {
				if(oos !=null)oos.close();
			}catch (Exception e2) {
				System.out.println(e2.getMessage());
			}
		}

	}

}
