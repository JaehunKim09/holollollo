package this15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample1 {

	public static void main(String[] args) {
		Set<String> set=new HashSet<String>();
		
		set.add("Java");
		set.add("Jdbc");
		set.add("Servlet/JSP");
		set.add("Java");//중복이면 하나 무시 없어짐 하나만 저장됨
		set.add("iBATIS");
		
		int size = set.size();
		System.out.println("총 객체수:"+size);
		
		Iterator<String> it= set.iterator();
		while(it.hasNext()) {
			String element = it.next();
			System.out.println("\t"+element);
		}
		set.remove("Java");
		set.remove("iBATIS");
		
		System.out.println("총 객체수 :"+set.size());
		
		it=set.iterator();
		while(it.hasNext()) {
			String element=it.next();
			System.out.println("\t"+element);
		}
		set.clear();
		if(set.isEmpty()) {
			System.out.println("비어있음");
		}
		
	}

}
