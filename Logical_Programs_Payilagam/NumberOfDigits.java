package payailagam_logical_programs;

import java.util.Scanner;

public class NumberOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberOfDigits sara=new NumberOfDigits();
		sara.whileLoop();
		sara.doWhilLoop();
		sara.forLoop();
	}

	public void forLoop() {
		// TODO Auto-generated method stub
		System.out.println("For Loop");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number;
		int count=0;
		for(number=sc.nextInt();number>0;) { 
			int num=number%10;
			count++;
			number=number/10;
		}
		System.out.println("count "+count);
		System.out.println();
	}

	public void doWhilLoop() {
		// TODO Auto-generated method stub
		System.out.println("DO While Loop");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		int count=0;
		do { 
			int num=number%10;
			count++;
			number=number/10;
		}while(number>0);
		System.out.println("count "+count);
		System.out.println();
	}

	public void whileLoop() {
		// TODO Auto-generated method stub
		System.out.println("While Loop");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		int count=0;
		while(number>0) { 
			int num=number%10;
			count++;
			number=number/10;
		}
		System.out.println("count "+count);
		System.out.println();
		
	}

}
/* output :
 While Loop
Enter the number
34
count 2

DO While Loop
Enter the number
678
count 3

For Loop
Enter the number
12344
count 5

*/
