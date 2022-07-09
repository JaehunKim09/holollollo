package this15;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparatorExample {

	public static void main(String[] args) {
		/*
		 * TreeSet<Fruit> treeSet=new TreeSet<Fruit>(); fruit�� Comparable �� �������� �ʾұ� ������ ���ܹ߻�
		 *
		 * treeSet.add(new Fruit("����",3000));
		 * treeSet.add(new Fruit("����",10000));
		 * treeSet.add(new Fruit("����",6000));
		 * 
		 */
		TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new DescendingComparator());// DescendingComparator();�������� ����
		treeSet.add(new Fruit("����", 3000));
		treeSet.add(new Fruit("����", 10000));
		treeSet.add(new Fruit("����", 6000));
		Iterator<Fruit> it = treeSet.iterator();
		while (it.hasNext()) {
			Fruit fruit = it.next();
			System.out.println(fruit.name + ":" + fruit.price);
		}

	}

}
