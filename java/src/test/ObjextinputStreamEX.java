package test;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjextinputStreamEX {

	public static void main(String[] args) {
		ObjectInputStream ois=null;
		try {
			/*
			 * 파일에 저잔된 객체를 읽어들이기 위해 ObjectInputStream 객체 생성
			 * 역직렬화 : 원래 자료형으로 변환 역질렬화할때 필요한 클래스파일을 찾지 못할 경우
			 * ClassNotFoundException을 발생시킨다.
			 * */
			ois = new ObjectInputStream(new FileInputStream("src/test/test.txt"));
			Data data = (Data) ois.readObject();
			
			System.out.println(data+"\n----------------------");
			System.out.println("번호 : "+data.getNo());
			System.out.println("이름 : "+data.getName());
			System.out.println("메일 : "+data.getMail());
		}catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
