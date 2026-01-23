package ExceptionHandling;

public class Program2 {

public static void main(String[] args) {
		
		int arr[] = new int [5];
		
		try {
			System.out.println(arr[5]/0);
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException a1) {
			System.out.println(a1);
		}
	}

}
