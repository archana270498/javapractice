import java.util.Scanner;
class DigitSum
{
	
	public static void main(String args[])
	{
       
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number");
       int number=sc.nextInt();
       DigitSum ds = new DigitSum();
       int result= ds.digitSum(number);
       System.out.println("Digit of Sum is: " +result);	
	}

	public int digitSum(int n)  //1234
	{
       int sum=0;        
       int rem ;
       while(n>0)
       {
         rem=n%10;  //4 //3 //2 /1
         n=n/10;    //123 //12 /1 /0
         sum += rem; //0+4 = 4+3+2+1 = 10
       }
       return sum;

	}
}//Class body Close