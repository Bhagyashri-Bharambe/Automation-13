package Arithmatic;

public class Subtraction
{
	private static boolean  Sub(double a,double b)
	{
		double Result=a-b;
		System.out.println("Subtraction of the Integer is:" +Result);
		return true;
	}
	
	public static void main(String[] args)
	{
		Subtraction.Sub(4, 6);
	}
}
