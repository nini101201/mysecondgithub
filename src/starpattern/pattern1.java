package starpattern;

public class pattern1 {

	public static void main(String[] args) {
		
for(int i=1;i<=4;i++)
{
	for(int j=1;j<=i;j++)
	{
		System.out.print("*");
	}
	System.out.println();
}
   System.out.println("---------------");
   for(int k=1;k<=2;k++)
   {
	   for(int l=1;l<=k;l++)
	   {
		   System.out.print("*");
   }
     System.out.println();
	}
   System.out.println("=====pattern no2=========");
   for(int r=1;r<=4;r++)
   {
	   for(int t=4;t>=r;t--)
	   {
		   System.out.print("*");
	   }
	   System.out.println();
	   }
   System.out.println("=====combination of above two pattern============");
   for(int p=1;p<=4;p++ )
   {
	   for(int q=4;q<=p;q++)
	   {
		   System.out.print("*");
        }
         System.out.println("");
   }
   for(int w=1;w<=4;w++)
   {
	   for(int g=4;g>=w;g--)
	   {
		   System.out.print("*");
	   }
	   System.out.println();
		   
   }
         
   
	}
}
