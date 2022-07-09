package this15;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		List<String> list1=new ArrayList<String>();//검색이빠름, 중간에 삽입 삭제는 느림, 추가는 빠름
		List<String> list2=new LinkedList<String>();//검색이 느림, 삽입 삭제는 빠름
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list1.add(0,String.valueOf(i));//정수를 String형 객체로 변환
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린시간:"+(endTime-startTime)+" ns");
		
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list2.add(0,String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린시간:"+(endTime-startTime)+" ns");
	}
}
