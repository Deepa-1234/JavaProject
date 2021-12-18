package pac1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionsPractice {

	public static void main(String[] args) {

//		Vector a=new Vector();
//		a.add(180);
//		a.add(10);
//		a.add(200);
//		a.add(1);
//		for(Object o:a) {
//			System.out.println(o);
//		}
//		System.out.println(a.get(2));
//		int k=(int) a.get(0);
//		System.out.println(k);
		
		//System.out.println(a);
		//Collections.sort(a,new Mycomparator());
		//Collections.reverse(a);
		//System.out.println(a);
		
//		LinkedHashSet h1=new LinkedHashSet();
//		h1.add(23);
//		h1.add(340);
//		h1.add(23);
//		h1.add(8);
//		h1.add(700);
//		h1.add(5);
//		System.out.println(h1);
//		for(Object o:h1) {
//			System.out.println(o);
//		}
//		ArrayList a1=new ArrayList(h1);
//		System.out.println(h1);
//		Collections.sort(a1);
//		System.out.println(a1);
		PriorityQueue pq= new PriorityQueue();
		pq.add(78);
		pq.add(2);
		pq.add(100);
		pq.add(9);
		pq.add(78);
		//pq.add("hello");
		System.out.println(pq);
//		while(!(pq.isEmpty())) {
//			System.out.println(pq.poll());
//		}
		for(Object j:pq) {
			System.out.println(j);
		}
	
		}

}
