import java.util.Scanner;
class Fibonacci {
  public static void main (String args[])
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the number :"); //10
	  int number = sc.nextInt();
	  generateFibonacci(number);
    }
  public static void generateFibonacci(int number)  //0 1 1 2 3 5 8 13 21 34 55 89
  {
    int first = 0;
    int second = 1;
    int temp ;
    System.out.print("Fibonacci Series :" + first + " " + second + " ");
    for (int i=0; i<number ; i++) {
    	temp = first + second;
    	first = second;
    	second = temp;
    	System.out.print(temp + " ");
    }
 
  }
}