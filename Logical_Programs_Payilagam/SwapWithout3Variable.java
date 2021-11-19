package payailagam_logical_programs;

import java.util.Scanner;

public class SwapWithout3Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the a and b values");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Before swapping a="+a+" and b="+b+" values");
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping a="+a+" and b="+b+" value");
	}

}
/* output :
 enter the a and b values
50 6
Before swapping a=50 and b=6 values
After swapping a=6 and b=50 value
*/
