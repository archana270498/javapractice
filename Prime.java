import java.util.Scanner;
class Prime{
	public static void main(String args[])
	{
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the number ");
      int number= sc.nextInt();
      boolean result=checkPrimenumber(number);
      if(result){
      	System.out.println("IsPrimenumber");
      }
      else
      {
      	System.out.println("Not Primenumber");
      }
 }

 public static boolean checkPrimenumber(int n)
 {
 	int temp=0;
	for(int i=2; i<=n-1; i++)
	{
		if(n%i==0)
		{
			temp=temp+1;
		}
    }
   if(temp>0)
 {
   return false;
 }
   else
     {
	   return true;
     }
 }

 }
