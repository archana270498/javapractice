import java.util.*;
class BinaryToHexa {
	public static void main(String args[]) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the number");
	   int binary=sc.nextInt();
	   int i=0;
		int x=0;
		while(binary!=0){
			if(binary%10==1){
				x+=Math.pow(2,i);
			}
			i++;
			binary=binary/10;
		}
		binarytohexa(x);
	}
	public static int binarytohexa(int x) {
		if(x/16>1){
			binarytohexa(x/16);
			if(x%16>9){
				int n=9;
				int y=96;
				while(n!=x%16){
					y++;
					n++;
				}
				System.out.print((char)y);
				return 0;
			}
			else{
				System.out.print(x%16);
				return 0;
			}
		}
		else{
			if(x>9){
				int n=9;
				int y=96;
				while(n!=x){
					y++;
					n++;
				}
				System.out.print((char)y);
				return 0;
			}
			else{
				System.out.print(x/16);
				return 0;
			}
		}
	}
}