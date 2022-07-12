package extraprogram;

import java.util.Arrays;

public class singlearray {

	public static void main(String[] args) {
	int a[]=new int[5];
	a[0]=4;
	a[1]=5;
	a[2]=78;
	a[3]=7;
	a[4]=4;
	Arrays.sort(a);
	for(int i=0;i<=a.length-1;i++)
	{
		System.out.println(a[i]);
	}
	char b[]= {'a','b','c'};
	for(int i=b.length-1;i>=2;i--) {
		System.out.println(b[i]);
	}

	}

}
