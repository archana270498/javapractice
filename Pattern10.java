class Pattern10 {
	public static void main(String args[]) {
	  for(int i=1; i<=5; i++) {
	    for(int j=4; j>=i; j--) {
	      System.out.print(" ");
	    }
	    for(int k=1; k<=i; k++) {
	       if(k>=1 && k>i-1) {
	        System.out.print("*");
	       }
	    }
	    System.out.println();
	  }
	}
}