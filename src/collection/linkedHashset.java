package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class linkedHashset {

	public static void main(String[] args) {
		LinkedHashSet<Float> lh=new LinkedHashSet<>();
		lh.add( 4.5f);
		lh.add(6.8f);
		lh.add((float) 6.7);
		lh.add((float) 6.9);
		lh.add(null);
		System.out.println(lh);
		System.out.println(lh.size());
		System.out.println(lh.getClass());
		System.out.println(lh.hashCode());
		System.out.println(lh.remove(6.8f));
		for(Float v:lh)
		{
			System.out.println(v);
		}
		Iterator t1=lh. iterator();
		while(t1.hasNext())
		{
			System.out.println(t1.next());
		}
		

	}

}
