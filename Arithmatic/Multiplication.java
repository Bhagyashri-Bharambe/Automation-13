package Arithmatic;

public class Multiplication
{
	protected static float  Multi(int a,int b)
	{
		int Result=a * b;
		System.out.println("Multiplication of the Integer is:" +Result);
		return (a * b);
	}
	
	public static void main(String[] args)
	{
		Multiplication.Multi(4, 6);
	}
}
