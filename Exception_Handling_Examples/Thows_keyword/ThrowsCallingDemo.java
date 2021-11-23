package utility_classes;

public class ThrowsCallingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try { 
			ThrowsDemo.divide(10, 0);
		}
		catch(ArithmeticException ae) { 
			System.out.println("Please check the inputs");
		}
	}
	

}
/* output :

Exception in thread "main" java.lang.ArithmeticException: / by zero
at utility_classes.ThrowsDemo.divide(ThrowsDemo.java:12)
at utility_classes.ThrowsCallingDemo.main(ThrowsCallingDemo.java:8)
*/
/* output :
Please check the inputs

*/