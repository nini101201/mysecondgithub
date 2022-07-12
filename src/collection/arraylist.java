package collection;

import java.util.ArrayList;
import java.util.ListIterator;

import javax.swing.text.html.HTMLDocument.Iterator;

public class arraylist {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(23);
		a.add("fsdfds");
		a.add('t');
		a.add(null);
		System.out.println(a.get(3));
		System.out.println("---------using listIterator=00======");
		
		ListIterator it=a.listIterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("----using for each");
		    for(Object v:a)
		    {
		    	System.out.println(v);
		    }
		    System.out.println(" for iterator");
		    	 java.util.Iterator op=a.iterator();
		    	
		    	while(op.hasNext())
		    	{
		    		System.out.println(op.next());
		    	}
		    	
		    	
		    	
		    
		}
	}


