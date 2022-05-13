
public class AccessProtection 
{

	public static void main(String[] args) 
	{
		System.out.println("CHANDRA PRABHA SINGH_F_2018291");
    	System.out.println(" ");
		
		Temp1 t=new Temp1();
		System.out.println("Public member - "+t.a);
		System.out.println("Default member - "+t.b);
	}
}
class Diff
{
	int a=10;
	public int b=20;
	private int c=30;
	protected int d=40;
	void fun() 
	{
		System.out.println("Private member - "+c);
	}
}
class Temp1 extends Diff
{
	Temp1()
	{
		System.out.println("Protected member - "+d);
		super.fun();
	}


}
