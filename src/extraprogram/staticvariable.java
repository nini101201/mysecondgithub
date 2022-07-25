package extraprogram;

public class staticvariable {
	public int counter=0;
	public static int staticCounter=0;
	public void variable1()
	{
		counter++;
		staticCounter++;
		System.out.println("counter "+counter);
				System.out.println("ststic "+staticCounter);
		
	}

	public static void main(String[] args) {
		
		staticvariable t=new staticvariable();
		staticvariable t1=new staticvariable();
		
		
		t.variable1();
		//System.out.println("counter "+counter);
		//System.out.println("ststic "+staticCounter);
		
		t1.variable1();
		//System.out.println("ststic "+staticCounter);

	}

}
