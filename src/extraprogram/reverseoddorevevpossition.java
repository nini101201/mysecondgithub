package extraprogram;

public class reverseoddorevevpossition {

	public static void main(String[] args) {
		String s="I love my India";
		String a[]= s.split(" ");
		for(int i=0;i<=a.length-1;i++)
		{
			if(i%2==0)
			{
				String c = a[i];
				a[i]=revstr[c];
				
			}
		}
	}
		public static String revstr(String k)
		
		{String n="";
			  for(int i=k.length()-1;i>=0;i--)
			  {
				  n=n+k. charAt(i);
				 
			  }
			return n;
			  
		}

	
}


