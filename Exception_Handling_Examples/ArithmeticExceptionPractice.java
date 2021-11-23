package utility_classes;

import java.util.Scanner;

public class ArithmeticExceptionPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the a value");
		int a=sc.nextInt();
	
	try { 
		int b=10/a;
		try { 
			if(a==1) { 
				a=a/(a-1);
			}
		
		if(a==2) { 
			int c[]= {3,5,2};
			c[5]=10;
		}
		}
		
		catch(ArrayIndexOutOfBoundsException aie) {  
			System.out.println("Array index outof bound Exception");
		}
		
	}
	
	
	catch(ArithmeticException ae) {  
		System.out.println("Arithmetic  Exception");
	}
	 
	 
	finally { 
		System.out.println("Bye");
	}
	}
}
/* 
 * 
 * Enter the a value
0
Exception in thread "main" Bye
java.lang.ArithmeticException: / by zero
	at utility_classes.ArithmeticExceptionPractice.main(ArithmeticExceptionPractice.java:1
	
	*/
