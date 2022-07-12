package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class treeset {

	public static void main(String[] args) {
		TreeSet t=new TreeSet();
		t.add(3);
		t.add(6);
		t.add(5);
		t.add(9);
		t.add(34);
		t.add(5);
		
		System.out.println(t);
      System.out.println(t.first());
      
      System.out.println(t.floor(11));
      System.out.println(t.higher(7));
      System.out.println(t.last());
      System.out.println(t.lower(15));
      System.out.println(t.pollFirst());
      System.out.println(t.pollLast());
     // System.out.println(t.remove(t));
      System.out.println(t.comparator());
      //System.out.println(t.);
      for(Object v:t)
      {
    	  System.out.println(v);
      }
      Iterator rt=t. iterator();
      while(rt.hasNext())
      {
    	  System.out.println(rt.next());
      }
      
	}

}
