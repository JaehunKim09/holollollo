package test;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjextinputStreamEX {

	public static void main(String[] args) {
		ObjectInputStream ois=null;
		try {
			/*
			 * ���Ͽ� ���ܵ� ��ü�� �о���̱� ���� ObjectInputStream ��ü ����
			 * ������ȭ : ���� �ڷ������� ��ȯ ������ȭ�Ҷ� �ʿ��� Ŭ���������� ã�� ���� ���
			 * ClassNotFoundException�� �߻���Ų��.
			 * */
			ois = new ObjectInputStream(new FileInputStream("src/test/test.txt"));
			Data data = (Data) ois.readObject();
			
			System.out.println(data+"\n----------------------");
			System.out.println("��ȣ : "+data.getNo());
			System.out.println("�̸� : "+data.getName());
			System.out.println("���� : "+data.getMail());
		}catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
