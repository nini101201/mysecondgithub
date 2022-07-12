package extraprogram;

import java.util.Scanner;

public class evenandodd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int a=sc.nextInt();
		if(a%2==0)
		{
			System.out.println("given number is  "+a + "and it is even");
		}
		else
			System.out.println("given number is  "+a + "and it is odd");

	}

}
