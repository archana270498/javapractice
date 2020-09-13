import java.util.*;
class DecimalToOctal {
public static void main(String args[]){
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number");
	int decimal=sc.nextInt();
	decimaltooctal(decimal);
}
public static int decimaltooctal(int decimal) {
	int rem=0;
	if(decimal/8>0){
		decimaltooctal(decimal/8);
		System.out.print(decimal%8);
		return 0;
	}
	else{
		
		System.out.print("Octal Digit : ");
		System.out.print(decimal);
		return 0;
	}
		
	}
}
