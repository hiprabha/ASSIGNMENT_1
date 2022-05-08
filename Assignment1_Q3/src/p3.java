import java.util.*;
public class p3 {
    public static void main(String a[]) 
    {testclass tc=new testclass();
     Scanner sc=new Scanner(System.in);   
     System.out.println("CHANDRA PRABHA SINGH_F_2018291");
 	 System.out.println(" ");
     
     System.out.print("Enter the integer value: ");
     int p=sc.nextInt();
     tc.display(p);   
    }
}
interface in1
{
    void display(int p);
}
class testclass implements in1
{   
    public void display(int p)
    {System.out.print("The integer value is "+p);
    }
}