package extraprogram;

public class multidimentionalAray {

	public static void main(String[] args) {
	float d[][]=new float[3][2];
	d[0][0]=3.5f;
	d[0][1]=5.7f;
	d[1][0]=8.8f;
	d[1][1]=4.4f;
	d[2][0]=7.7f;
	d[2][1]=9.9f;

	for(int i=0;i<=2;i++)
	{
		for(int j=0;j<=1;j++)
		{
			
		System.out.print(d[i][j] +" ");
	}
     System.out.println();
	}
System.out.println("integet array");
int a[][]=new int[2][3];
     a[0][0]=56;
     a[0][1]=67;
     a[0][2]=78;
     a[1][0]=88;
     a[1][1]=66;
     a[1][2]=44;
     for(int i=0;i<=1;i++)
     {
    	 for(int j=0;j<=2;j++)
    	 {
    		 System.out.print(a[i][j]+" ");
    	 }
    	 System.out.println();
     }
     System.out.println("string array");
     String k[][]= {{"Mrunali","Pranali","nini"},{"Mehul","Rudra","Dev"}};
     for(int i=0;i<=1;i++)
     {
    	 for(int j=0;j<=2;j++)
    	 {
    		 System.out.print(k[i][j]+" ");
    		 
    	 }
    	 System.out.println();
    		 
    		 
    		 
    	 }
     }

}
