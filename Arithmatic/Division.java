package Arithmatic;

public class Division 
{
	protected static float  Div(float a,float b)
	{
		float Result=a * b;
		System.out.println("Division of the Integer is:" +Result);
		return (a / b);
	}
	
	public static void main(String[] args)
	{
		Division.Div(45.3f, 69.5f);
	}
}
