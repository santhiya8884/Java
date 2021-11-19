package payailagam_logical_programs;

import java.util.Scanner;

public class SwaopWith3Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the a and b values");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Before swapping a="+a+" and b="+b+" values");
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping a="+a+" and b="+b+" value");
	}

}/* output :
 enter the a and b values
10 20
Before swapping a=10 and b=20 values
After swapping a=20 and b=10 value
*/
