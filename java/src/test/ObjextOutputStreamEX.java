package test;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjextOutputStreamEX {

	public static void main(String[] args) {
		ObjectOutputStream oos=null;
		try {
			/*
			 * 메모리에 생성된 객체를 직렬화 해서 스트림을 통해
			 * 기록할수있는ObjextOutputStream을 통해서 직렬화된 후 파일로 기록된 Data
			 * 객체 생성 Data클래스는 반드시  Serializable 을 구형하고 있어야한다.ㅣ
			 * */
			oos=new ObjectOutputStream(new FileOutputStream("src/test/test.txt"));
			Data data = new Data();
			data.setNo(25);
			data.setName("홍길동");
			data.setMail("hong@naver.com");
			/*
			 * ObjectOutputStream을 객체를 직렬화해서 스트림을 통해 기록할수있는 writeObject()을 제공
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
