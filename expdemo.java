import java.util.Scanner;
class expdemo		// Exception hadling program
{
	void func1()
	{
		try 
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array no.");
		int a[]=new int[5];
		for(int i=0;i<5;i++)
		{
		a[i]=sc.nextInt();
		}
		System.out.println("----------array elements---------");
		for(int i=0;i<=5;i++)
		{
			System.out.println(a[i]);
		}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e); //e.getMessage();
		}
		finally
		{
			System.out.println("Finally block working"); 	
		}
	}
	void func2()
	{
		System.out.println("Second function is working");
	}
	public static void main(String args[])
	{	
		expdemo ex=new expdemo();
		ex.func1();
		ex.func2();
	}
}