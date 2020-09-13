import java.util.Scanner;
class Factorial{
	public static void main(String args[])
	{
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number");
      int number=sc.nextInt();
      int result=Factorial(number);
      System.out.println("Factorial of "+number+" is: " +result);

	}

	public static int Factorial(int n)
	{
	  int fact=1;
	  for(int i=1; i<=n; i++)
	  {
	  	fact=fact*i;
	  }
	  return fact;
	}
}
