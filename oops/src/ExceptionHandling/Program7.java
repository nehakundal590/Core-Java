package ExceptionHandling;

public class Program7 {



	public static void main(String[] args) {
		int arr [] = new int[5];
		
		
		try {
			System.out.println(arr [4]);
			try {
				System.out.println(10/0);
			}
			catch(ArithmeticException e1) {
				System.out.println(e1);
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}

}


// O output because 0 is default value

