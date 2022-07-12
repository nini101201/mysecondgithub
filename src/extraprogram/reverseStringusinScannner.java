package extraprogram;

import java.util.Scanner;

public class reverseStringusinScannner {

	public static void main(String[] args) {
		String b="";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String a=sc.nextLine();
		for(int i=a.length()-1;i>=0;i--)
		{
			b=b+a.charAt(i);
		}
		System.out.println(b);
				if(b.equals(a))
				{
					System.out.println(a+ "is palindrom");
				}
				else
				{
					System.out.println(a+ "is not palindrom");
				}

	}

}
