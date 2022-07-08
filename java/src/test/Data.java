package test;
/*
 * objectoutputstream 직렬화 : 일렬된 바이트로 전선
 * objectinputstream  역직렬화 :  원래 자료형으로 변환
 * 객체의 직렬화
 * 가상머신 안에 존재하는 특정 객체(객체의 메모리와 객체의 대한 정보)를 순차적인
 * 바이트형태로 변환하는것
 * 객체의 직렬화를 통해 프로그램이 실행되는 동안 생성된 객체를 스트림을 이용해서 지속적으로 보관하거나 전송할수있다
 * ]직렬화 가능한 클래스 만드는방법
 * 1)serializavle 인터페이스를 이용
 * 2)externalizable 인터페이스를 이용
 * */

import java.io.Serializable;

public class Data implements Serializable{
	int no;
	String name;
	String mail;
	
	@Override
	public String toString() {
		return "번호 : " + no + "\n이름 : " + name + "\n메일 : " + mail + "...";
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
