package extraprogram;

import java.util.Scanner;

public class palindromusingScanner {
public static void main(String[] args) {
		String str, rev = "";
	      Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a string:");
	      str = sc.nextLine();
	  int length = str.length();
	      System.out.println(length);
	  for ( int i = length - 1; i >= 0; i-- )
	      {
	         rev = rev + str.charAt(i);
	      }
	  if (str.equals(rev))
	      {
	         System.out.println(str+" is a palindrome");
	      }
	      else
	      {
	         System.out.println(str+" is not a palindrome");
	}}

}
