package extraprogram;

public class sortingnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp;
     int[] k= {4,6,8,9,1};
     for(int i=0;i<=k.length-1;i++)
     {
    	 for(int j=i+1;j<=k.length-1;j++)
    	 {
    		 if(k[i]>k[j])
    		 {
    		 temp=k[i];
    		 k[i]=k[j];
    		 k[j]=temp;
    		 
    	 }}
     }
     for(int i=0;i<=k.length-1;i++)
     {
    	 System.out.println(k[i]);
     }
	}

}
