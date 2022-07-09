package this15;

public class Person implements Comparable<Person>{
	public String name;
	public int age;
	
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}

	@Override //오름차순
	public int compareTo(Person o) {
		if(age<o.age)return -1;//o.age 는 (부모)새로 들어온 age이다. -1을 반대로1로 하면 내림차순으로 변경됨
		else if(age==o.age)return 0;
		else return 1;
		
	}
	

}
