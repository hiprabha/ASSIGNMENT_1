import java.util.Scanner;

public class Q6 
{

	public static void main(String[] args) 
	{
		System.out.println("CHANDRA PRABHA SINGH_F_2018291");
    	System.out.println(" ");
		
		int a,b;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		int result=a>b?sum(a,b):sub(a,b);
		System.out.println("result - "+result);
	}
	static int sum(int a,int b) {return a+b;}
	static int sub(int a,int b) {
		return a-b<0?0:a-b;
	}
}
