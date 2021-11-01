package Arithmatic;

public class Combine
{
	static void  Add(int a,int b)
	{
		int Result=a+b;
		System.out.println("Addition:" +Result);
	}
	
	private static boolean  Sub(int a,int b)
	{
		int Result=a-b;
		System.out.println("Subtraction of the Integer is:" +Result);
		return true;
	}
	protected static float  Multi(int a,int b)
	{
		int Result=a * b;
		System.out.println("Multiplication of the Integer is:" +Result);
		return (a * b);
	}
	
	protected static float  Div(float a,float b)
	{
		float Result=a * b;
		System.out.println("Division of the Integer is:" +Result);
		return (a / b);
	}
	

	public static void main(String[] args)
	{
		Combine.Add(4, 6);
		Combine.Sub(4, 6);
		Combine.Multi(4, 6);
		Combine.Div(45.3f, 69.5f);
	}

}
