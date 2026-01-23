package ExceptionHandling;

public class Example {


	public static void main(String[] args) {
		// Division by Zero
		try {
			int a = 20 / 0;
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException Causes : " + e);
		} finally {
			System.out.println("FinallyExceuted ----\n");
		}
		// ArrayIndexOutOfBounds
		try {
			int[] arr = { 1, 2, 3 };
			System.out.println(arr[5]); // Wrong index
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: Index is out of range. " + e);
		}
		// Null Pointer Exception
		try {
			String s = null;
			System.out.println(s.length());
		} catch (NullPointerException e) {
			System.out.println("Error: Cannot access methods on a null object." + e);
		}
		// Number Formet Exception
		try {
			String num = "rahul"; // not a nuumber
			int n = Integer.parseInt(num);
			System.out.println(n);
		} catch (NumberFormatException e) {
			System.out.println("Error: Invalid number formet." + e);
		}
	}
}

