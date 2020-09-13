import java.util.*;
class DecimalToBinary {
public static void main(String args[]){
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number");
	int decimal=sc.nextInt();
	decimaltobinary(decimal);
}
public static int decimaltobinary(int decimal) {
	int rem=0;
	if(decimal/2!=1){
		decimaltobinary(decimal/2);
		if(decimal%2==0){ 
			System.out.print("0");
			return 0;
		}
		else{ 
			System.out.print("1");
			return 0;
		}
	}
	else{
		System.out.print("1");
		System.out.print("0");
		return 0;
	}
		
	}
}
