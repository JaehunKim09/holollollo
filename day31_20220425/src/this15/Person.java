package this15;

public class Person implements Comparable<Person>{
	public String name;
	public int age;
	
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}

	@Override //��������
	public int compareTo(Person o) {
		if(age<o.age)return -1;//o.age �� (�θ�)���� ���� age�̴�. -1�� �ݴ��1�� �ϸ� ������������ �����
		else if(age==o.age)return 0;
		else return 1;
		
	}
	

}
