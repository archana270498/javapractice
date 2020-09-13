import java.util.Scanner;
class GreatestThree
{
	
	public static void main(String args[])
	{

	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the First Number(A)");
	  int a=sc.nextInt();
	  System.out.println("Enter the Second Number(B)");
	  int b=sc.nextInt();
	  System.out.println("Enter the Third Number(C)");
      int c=sc.nextInt();
      int result= greatestThree(a,b,c);
      if(result == 0){
      	System.out.println("No largest number is there ");
      }else
      	System.out.println("The largest number is: "+result);

	}

	public static int greatestThree(int a,int b, int c)
	{
		if(a>=b && a>=c)
			return a;
		else if(a <= b && b>=c)
			return b;
		else if (a<=c && b<=c) 
			return c ;
		else
			return 0;
	} 
}