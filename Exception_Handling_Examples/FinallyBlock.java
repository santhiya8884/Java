package exception_practice;

import java.util.Scanner;

public class FinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinallyBlock sara=new FinallyBlock();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter teh 2 numbers :");
		int number1=sc.nextInt();
		int number2=sc.nextInt();
		
		try{ 
			int output=number1/number2;
			System.out.println(output);
		}
		
//		  catch(Exception e) { 
//			  
//		  }
finally { 
			System.out.println("BYe");
		}
		/*
		 * finally {
		 * 
		 * }
		 */
		
		 
		
	}

}
/* output :
Enter teh 2 numbers :
5
0
BYeException in thread "main" 
java.lang.ArithmeticException: / by zero
	at exception_practice.FinallyBlock.main(FinallyBlock.java:16)
*/