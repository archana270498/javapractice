import java.util.*;
class BinaryToHexa1 {
	public static void main(String args[]) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the number");
	  int binary=sc.nextInt();
	  binarytohexa(binary);
	}
	public static int binarytohexa(int binary) {
	  int dec=0;
	  int power=0;
	  int rem=0;
	  while(binary>0) {
	  	//System.out.println("Power : " +power);
	   dec +=(binary%10)*Math.pow(2,power++);
	   binary=binary/10;
	  // System.out.println("Binary : " +binary);

	  }
	  System.out.println("Decimal : " +dec);
      while(dec>0) {
	  rem=dec%16;
	  dec=dec/16;
	  System.out.println("Hexa digit : " +dec+rem);
	   dec=0;
	   
	  }
	  
	  return 0;
	}
}
