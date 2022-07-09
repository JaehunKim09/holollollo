package this15;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparatorExample {

	public static void main(String[] args) {
		/*
		 * TreeSet<Fruit> treeSet=new TreeSet<Fruit>(); fruit이 Comparable 을 구현하지 않았기 떄문에 예외발생
		 *
		 * treeSet.add(new Fruit("포도",3000));
		 * treeSet.add(new Fruit("수박",10000));
		 * treeSet.add(new Fruit("딸기",6000));
		 * 
		 */
		TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new DescendingComparator());// DescendingComparator();내림차순 정렬
		treeSet.add(new Fruit("포도", 3000));
		treeSet.add(new Fruit("수박", 10000));
		treeSet.add(new Fruit("딸기", 6000));
		Iterator<Fruit> it = treeSet.iterator();
		while (it.hasNext()) {
			Fruit fruit = it.next();
			System.out.println(fruit.name + ":" + fruit.price);
		}

	}

}
