package Arithmatic;

public class Addition
{
	 double  Add(int a,int b)
	{
		int Result=a+b;
		System.out.println("Addition of two no is:" +Result);
		return Result;
	}
	
	public static void main(String[] args)
	{
		Addition a1=new Addition();
		a1.Add(3,5);
	}
}
