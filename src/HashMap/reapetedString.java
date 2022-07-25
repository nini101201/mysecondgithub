package HashMap;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class reapetedString {

	public static void main(String[] args) {
		String A="pqrepqre";
		HashMap<Character,Integer>mp=new HashMap<>();
		for(int i=0;i<=A.length()-1;i++)
		{    char keyvalue=A.charAt(i);
			if(mp.containsKey(keyvalue))
			{
				mp.put(keyvalue, mp.get(keyvalue)+1);
			}
			else
			{
				mp.put(keyvalue, 1);
			}
		}
		for(Entry<Character, Integer> k:mp.entrySet())
		{
			System.out.println(k);
		}
		
}}
