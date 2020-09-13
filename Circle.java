import java.util.Scanner;
class Circle {
	public static void main(String args[]) {
	 	Scanner in = new Scanner(System.in);
	 	System.out.println("Enter the Radius of Circle :");
	 	double radius = in.nextDouble();
	 	double area = calcuateAreaOfCircle(radius);
	 	double perimeter = calcuatePerimeterOfCircle(radius);
	 	System.out.println("Area is :" + area + " perimeter is :" + perimeter);


	}

	public static double calcuateAreaOfCircle(double  radius){
		double area = Math.PI * radius * radius;
		return area;
	}

	public static double calcuatePerimeterOfCircle(double  radius){
		double perimeter = 2* Math.PI * radius;
		return perimeter;
	}
}