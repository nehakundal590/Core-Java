package ExceptionHandling;

public class Program6 {


	public static void main(String[] args) {
		try
		{
			int data = 25 / 0;
			System.out.println(data);
		} 
		catch (ArithmeticException e)
		{
			System.out.println("Denominator should not be zero");
		} 
		finally 
		{
			System.out.println("Finally Block is always Executed");
			System.out.println("Rest of the code");
		}
	}
}

