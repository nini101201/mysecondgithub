package collection;

import java.util.Enumeration;
import java.util.Vector;

public class vector {

	public static void main(String[] args) {
	Vector<String>vt=new Vector<>();
	vt.add("Mrunali");
	vt.add("prasd");
	vt.add("patil");
	vt.add("nini");
	System.out.println(vt);
	System.out.println(vt.elementAt(1));
	System.out.println(vt.get(0));
	System.out.println(vt.indexOf("nini"));
	System.out.println(vt.set(2, "patel"));
	System.out.println(vt);
	System.out.println(vt.capacity());
     System.out.println(vt.size());	
    // System.out.println(vt.);
     Enumeration v1=vt.elements();
     while(v1.hasMoreElements())
     {
    	 System.out.println(v1.nextElement());
     }
     for(int i=0;i<=vt.size()-1;i++)
     {
    	 System.out.println(vt.get(i));
     }
 
	}

}
