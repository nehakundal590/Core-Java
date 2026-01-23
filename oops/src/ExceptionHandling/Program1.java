
package ExceptionHandling;

public class Program1{

	public static void main(String[] args) {
		int arr [] = new int[5];
		
		try {
			System.out.println(arr[5]/0);
		}
		catch(ArrayIndexOutOfBoundsException a1) {
			System.out.println(a1);
		}
		catch (ArithmeticException a2) {
			System.out.println(a2);
		}
		
		catch(Exception e1) {
			System.out.println(e1);
		}

	}

}


/* We cannot write first top of the class 
Exception
ArithmeticException
ArrayIndexOutOfBoundsException 
or 
we can write first sub class then top of the class 
ArrayIndexOutOfBoundsException
ArithmeticException
Exception
*/
