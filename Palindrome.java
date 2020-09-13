import java.util.Scanner;
class Palindrome {
	public static void main(String args[]) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the number");
	 int number=sc.nextInt();
	 boolean result=checkPalindromenumber(number);
	 if(result) {
	  
	  System.out.println("Is Palindrome Number");
	 }
	 else
      System.out.println("Not Palindrome Number");
	}
	public static boolean checkPalindromenumber(int n) {
	 int a,sum=0,temp;
	 temp=n;
	 while(n>0) {
	  a=n%10;
	  sum=(sum*10)+a;
	  n=n/10;
	 }
	 if(temp==sum) {
	  return true;
	 }
	 else
	 return false;
	}

}