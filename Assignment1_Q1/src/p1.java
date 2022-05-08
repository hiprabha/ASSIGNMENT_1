import java.util.Scanner;
class student {
    int age;
    float per;
    String n, sec;
    Scanner sc = new Scanner(System.in);
    student() {
        System.out.print("Enter the Age: ");
        age = sc.nextInt();
        System.out.print("Enter the Name: ");
        n = sc.next();
        sec = "A";
        System.out.println("Enter the percentage: ");
        per = sc.nextFloat();
    }
}
public class p1 
{
    public static void main(String args[]) 
    {
    	System.out.println("CHANDRA PRABHA SINGH_F_2018291");
    	System.out.println(" ");
    	
        float avg = 0.0F;
        student S1 = new student();
        student S2 = new student();
        student S3 = new student();
        student S4 = new student();
        student S5 = new student();
        student S6 = new student();
        avg = S1.per + S2.per + S3.per + S4.per + S5.per + S6.per;
        System.out.println("Average percentage of Section-A is " + (avg / 6));
    }
}
