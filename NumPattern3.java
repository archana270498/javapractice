import java.util.*;
class NumPattern3 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number :");
		int number = in.nextInt();
	  int count=0;
	  for(int i=1; i<=number; i++) {
	   for(int j=1; j<=i; j++) {
	      count=count+1;
	      System.out.print(count+ " ");
	   }
	   System.out.println();
	  }
	}
}