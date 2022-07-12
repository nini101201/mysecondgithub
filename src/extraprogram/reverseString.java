package extraprogram;

import java.util.Scanner;

public class reverseString {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter sring");
//String k=s.nextLine();
//System.out.println("k="+k);
String k="madam";
String rev="";
for(int i=k.length()-1;i>=0;i--)
{
	rev=rev+k.charAt(i);

	}
System.out.println(rev);
if(k.equals(rev))
{
	System.out.println("String is palindrom");
}
else
{
	System.out.println("string is not palindrom");
}

}
}
