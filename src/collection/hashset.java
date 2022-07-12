package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.stream.Collector;

public class hashset {

	public static void main(String[] args) {
		HashSet h=new HashSet();
		h.add('A');
		h.add(56);
		h.add("rami");
		h.add(23.5);
		h.add('a');
		h.add(null);
		h.add(null);
		System.out.println(h);
		HashSet hh=new HashSet();
		hh= (HashSet)h.clone();
		System.out.println(hh);
		System.out.println(h.contains('A'));
		System.out.println(h.remove('a'));
		System.out.println(h);
		System.out.println(h.size());
		System.out.println("----------specific hashset----------");
		HashSet<Integer>h1 = new HashSet<>();
		h1.add(12);
		h1.add(56);
		h1.add(67);
		System.out.println(h1);
		System.out.println("==========hashsetfor float======");
		HashSet<Character>hc=new HashSet<>();
		hc.add('d');
		hc.add('r');
		hc.add('t');
		hc.add('j');
		hc.add(null);
		System.out.println("------using for each loop-------");
		for(Character v:hc)
		{
		System.out.println(v);
		}
		System.out.println("=======using iterator========");
		Iterator jk=hc.iterator();
		while(jk.hasNext())
		{
			System.out.println(jk.next());
		}
		hc.clear();
		System.out.println(hc.isEmpty());
		
//		System.out.println("=====using for loop-------");
//		for(int i=0;i<=hc.size()-1;i++)
//		{
//			System.out.println(i);//not possible
//		}
		HashSet<Float>hc1=new HashSet<>();
		hc1.add((float) 4.6);
		System.out.println(hc1);
		
		  

	}

}
