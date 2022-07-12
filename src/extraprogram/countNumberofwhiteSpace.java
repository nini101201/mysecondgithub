package extraprogram;

public class countNumberofwhiteSpace {

	public static void main(String[] args) {
		String a="Pu     ne";
		int count=0;
		
		for(int i=0;i<=a.length()-1;i++)
		{
			char mychar=a.charAt(i);
			if(mychar==' ')
			{
				count++;
			}
			
			
		}
		System.out.println("number of space"+ count);
		

	}

}
