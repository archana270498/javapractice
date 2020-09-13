class Example{
	public static void main(String args[])
	{
	System.out.println("Hello World");
	String result=add(5,6); 
	System.out.println(result);
	}
	public static String add(int a,int b)
	{
		System.out.println(a+b);
		return a+" "+b;
	}
}