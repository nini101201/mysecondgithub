package extraprogram;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		//4!=4*3*2*1
		int b=1;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		
		int a=sc.nextInt();
		for(int i=a;i>=1;i--)
		{
			b=i*b;
		}
		System.out.println("factorial of " +a +"is " +b);

	}

}
