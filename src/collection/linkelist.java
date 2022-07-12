package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class linkelist {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add("qwe");
		l.add(123);
		l.add('a');
		l.add(34.6);
		System.out.println(l);
		System.out.println(l.getFirst());
		System.out.println(l);
		System.out.println(l.peek());
		System.out.println(l.poll());
		System.out.println(l);
		//System.out.println();
		

		System.out.println(l);
		Iterator tt=l.iterator();
		while(tt.hasNext())
		{
			System.out.println(tt.next());
		}
		
		
		
		


	}

}
