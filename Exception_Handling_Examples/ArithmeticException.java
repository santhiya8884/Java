package exception_practice;

import java.util.Scanner;

public class ArithmeticException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the 2 number");
		int number1=sc.nextInt();
		int number2=sc.nextInt();
		int output=number1/number2;
		System.out.println("Output is :"+output);
	}

}
/* output :
enter the 2 number
5
0
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at exception_practice.ArithmeticException.main(ArithmeticException.java:13)
*/