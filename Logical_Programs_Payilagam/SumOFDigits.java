package payailagam_logical_programs;

import java.util.Scanner;

public class SumOFDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOFDigits sara=new SumOFDigits();
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
		int sum=0;
		for(number=sc.nextInt();number>0;) { 
			int num=number%10;
			sum=sum+num;
			number=number/10;
		}
		System.out.println("Sum of Digits "+sum);
		System.out.println();
	}

	public void doWhilLoop() {
		// TODO Auto-generated method stub
		System.out.println("DO While Loop");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		int sum=0;
		do { 
			int num=number%10;
			sum=sum+num;
			number=number/10;
		}while(number>0);
		System.out.println("Sum of Digits "+sum);
		System.out.println();
	}

	public void whileLoop() {
		// TODO Auto-generated method stub
		System.out.println("While Loop");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		int sum=0;
		while(number>0) { 
			int num=number%10;
			sum=sum+num;
			number=number/10;
		}
		System.out.println("Sum of Digits "+sum);
		System.out.println();
		
	}

}
/* output :
While Loop
Enter the number
45
Sum of Digits 9

DO While Loop
Enter the number
678
Sum of Digits 21

For Loop
Enter the number
123
Sum of Digits 6

*/
