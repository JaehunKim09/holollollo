package this15;

public class Member {
	public String name;
	public int age;

	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member mem = (Member) obj;
			System.out.println("member.name.equals(name)"+mem.name.equals(name));
			System.out.println("mem.age==age="+(mem.age=age));
			return mem.name.equals(name) && (mem.age == age);
		} else {
			return false;
		}

	}

	@Override
	public int hashCode() {

		return name.hashCode() + age;
	}

}
