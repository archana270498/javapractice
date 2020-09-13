import java.util.*;
class BinaryToDecimal {
	public static void main(String var[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int binary = sc.nextInt();
		int decimal = binaryToDecimal(binary);
		System.out.println("Binary :" + binary + " -> Decimal No:" + decimal);
	}

	public static int binaryToDecimal(int binary) { //1110
		int decimal = 0;//0+2+4+8 =14
		int power = 0;//0,1,2,3
		while(binary > 0) {
			System.out.println("Power  :" +power);
			decimal += (binary%10) * Math.pow(2,power++); 

			System.out.println("Decimal Value : " + decimal);
			binary = binary/10; //111
			System.out.println("Binary Digit  : :" +binary);

		}
		return decimal;
	}

}




// 1110 -> 1*2^3+1*2^2+1*2^1+0*2^0 = 14