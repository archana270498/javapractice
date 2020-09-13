import java.util.*;
class BinaryToOctal {
	public static void main(String args[]) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the number");
	  int binary=sc.nextInt();
	 int octal= binarytooctal(binary);
	  
	}
	public static int binarytooctal(int binary) {
	  int decimal=0;
	  int octal=0;
	  int power=0;
	  int rem=0;
	  while(binary>0) {
	    decimal += (binary % 10) * Math.pow(2,power++);
	    binary=binary/10;
      }
      System.out.println("Decimal :" +decimal);
	 
	  while(decimal>0) {
	  rem=decimal%8;
	  decimal=decimal/8;
	  System.out.println("Octal digit : " +decimal+rem);
	   decimal=0;
	   
	  }
	  return 0;
	}
}