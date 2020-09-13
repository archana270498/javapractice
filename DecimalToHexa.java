import java.util.*;
class DecimalToHexa {
public static void main(String args[]){
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number");
	int decimal=sc.nextInt();
	decimaltohexa(decimal);
}
public static int decimaltohexa(int decimal) {
	int rem=0;
	if(decimal/16!=1){
		decimaltohexa(decimal/16);
		System.out.print(decimal%16);
		return 0;
	}
	else{
		
		System.out.print("Hexa Digit : ");
		System.out.print(decimal%16);
		return 0;
	}
		
	}
}
