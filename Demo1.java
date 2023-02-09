package Trace;

public class Demo {
	static void disp3() {
		int i = 10/2;
	}
	static void disp2()
	{
		disp3();
	}
	static void disp1()
	{
		disp2();
	}
	public static void main(String[] args) {
		System.out.println("STARTS.....");
		try
		{
			disp1();
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println("HANDLLEDDD.....");
		}
		System.out.println("ENDSSS.....");
		
	}

}
