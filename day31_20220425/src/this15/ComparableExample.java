package this15;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableExample {

	public static void main(String[] args) {
		TreeSet<Person> treeSet=new TreeSet<Person>();//�ڵ� ��������
		
		treeSet.add(new Person("ȫ�浿",45));
		treeSet.add(new Person("���ڹ�",25));
		treeSet.add(new Person("������",31));
		
		Iterator<Person> it=treeSet.descendingIterator();//iterator();�ڵ���������//descendingIterator();�� �ڵ� ��������
		while(it.hasNext()) {
			Person person=it.next();
			System.out.println(person.name+":"+person.age);
		}

	}

}
