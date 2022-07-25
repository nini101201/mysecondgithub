package HashMap;

import java.util.HashMap;
import java.util.Map.Entry;

public class hasshmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         HashMap<Integer,String>pair=new HashMap<>();
         pair.put(1, "car");
         pair.put(2, "bike");
         pair.put(3, "cycle");
         pair.put(4, "helicopter");
         System.out.println("the hashMap is  "+pair);
         System.out.println(pair.get(1));
         System.out.println("keyset " +pair.keySet());
         System.out.println("value" +pair.values());
         System.out.println("entrySet" +pair.entrySet());
         pair.replace(2, "BIKE");
         pair.replace(5,"helicopter");
         System.out.println("update " +pair);
         pair.remove(2);
         System.out.println("update " +pair);
         System.out.println(pair.remove(2,"BIKE"));
         System.out.println(pair.remove(3,"cycle"));
         System.out.println("update " +pair);
         //iterate through key
         for(Integer i:pair.keySet())
         {
        	 System.out.println(i);
         }
         //iterate through value
         for(String k:pair.values())
         {
        	 System.out.println(k);
         }
         
         //iterate through entryset
         for(Entry<Integer, String> e:pair.entrySet())
         {
        	 System.out.println(e);
         }
         pair.put(6,"hjjj");
         System.out.println("update " +pair);
         HashMap<Integer,String>pair1=new HashMap<>();
         pair.put(1, "car1");
         pair.put(22, "bike");
         pair.put(33, "cycle");
         pair.put(44, "helicopter");
         pair.putAll(pair1);
         System.out.println("merge "+pair1);
         System.out.println(pair.containsKey(9));
         System.out.println(pair.size());
         pair.replaceAll((key,value)->value.toUpperCase());
         System.out.println(pair);
         pair.replaceAll((key,value)->value.toUpperCase());
         System.out.println(pair);
         String k="javaseleniu";
         System.out.println(k.length());
         System.out.println(k.indexOf('u'));
         int a[]= {1,2,3,4};
         System.out.println(a.length);
         
         
         
         
         
         
	}

}
