import java.util.Scanner;
class Armstrong {
	public static void main(String args[]){
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the number");
	  int number=sc.nextInt();
	  boolean result=checkArmstrongnumber(number);
     if(result){
       System.out.println("Is Armstrong number");
     }
     else
     System.out.println("Not Armstrong number");
	}
	public static boolean checkArmstrongnumber(int n) {
	int arm=0,a,temp;
	temp=n;
	while(n>0) {
	  a=n%10;
	  n=n/10;
	  arm=arm+(a*a*a);
	}
	if(temp==arm) {
	return true;
	}
	else
	return false;
	}
}