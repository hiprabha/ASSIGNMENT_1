class employee 
{

    static int count;
    static int c = 0;

    employee() 
    {

        count++;
    }

    void display() 
    {
        c++;
        System.out.println("This function called : " + c + " times");
    }

}
class Main
{
    public static void main(String args[])
    {
    	System.out.println("CHANDRA PRABHA SINGH_F_2018291");
    	System.out.println(" ");
        employee ob1 = new employee();

        employee ob2 = new employee();
        employee ob3 = new employee();
        employee ob4 = new employee();
        employee ob5 = new employee();

        System.out.println("Total Number of Objects: " + employee.count);
        ob1.display();
        ob2.display();
        ob3.display();

    }
}