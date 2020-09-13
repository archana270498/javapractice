import java.util.Scanner;
class Swap
{
	public static void main(String args[])
	{

	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the First number (A)");
   	  int a=sc.nextInt();
	  System.out.println("Enter the  Second number (B)");
	  int b=sc.nextInt();
	  swapNumber(a,b);
	}

	public static void swapNumber(int a, int b)
	{
        a=a+b;
        b=a-b;
        a=a-b;
	System.out.println("A :" + a);
	System.out.println("B :"+ b);

	}

	
}