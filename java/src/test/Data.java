package test;
/*
 * objectoutputstream ����ȭ : �Ϸĵ� ����Ʈ�� ����
 * objectinputstream  ������ȭ :  ���� �ڷ������� ��ȯ
 * ��ü�� ����ȭ
 * ����ӽ� �ȿ� �����ϴ� Ư�� ��ü(��ü�� �޸𸮿� ��ü�� ���� ����)�� ��������
 * ����Ʈ���·� ��ȯ�ϴ°�
 * ��ü�� ����ȭ�� ���� ���α׷��� ����Ǵ� ���� ������ ��ü�� ��Ʈ���� �̿��ؼ� ���������� �����ϰų� �����Ҽ��ִ�
 * ]����ȭ ������ Ŭ���� ����¹��
 * 1)serializavle �������̽��� �̿�
 * 2)externalizable �������̽��� �̿�
 * */

import java.io.Serializable;

public class Data implements Serializable{
	int no;
	String name;
	String mail;
	
	@Override
	public String toString() {
		return "��ȣ : " + no + "\n�̸� : " + name + "\n���� : " + mail + "...";
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	

}
