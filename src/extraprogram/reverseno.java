package extraprogram;

import java.util.Scanner;

public class reverseno {

	public static void main(String[] args) {
		int no,rev=0,remainder;
		System.out.println("Enter the number");
		Scanner t=new Scanner(System.in);
		no=t.nextInt();
		int k=no;
		while(no!=0)
		{
			
			remainder=no%10;
			rev=rev*10+remainder;
			no=no/10;
		}
		System.out.println(rev);
        if(k==rev)
        {
        	System.out.println("no is pali");
        }
        else
        {
        	System.out.println("no is not pali");
        }
		

	}

}
