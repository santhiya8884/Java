package payailagam_logical_programs;

import java.util.Scanner;

public class ReverseOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseOfNumber sara=new ReverseOfNumber();
		System.out.println("Reverse of the given NUmber :");
		Scanner sc=new Scanner(System.in);
		sara.whileLoop();
		sara.doWhileLoop();
		sara.forLoop();
	}

	public void forLoop() {
		// TODO Auto-generated method stub
		System.out.println("Do while loop: ");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int number=sc.nextInt();
		//System.out.println(number);
		/*
		 * int rev=0; while(number>0) { int n=number%10; rev=(rev*10)+n;
		 * number=number/10; }
		 */
		int rev=0;
		for(int i=number;i>0;) { 
			rev=(rev*10)+(number%10);
			number=number/10;
			i=number;
		}
		System.out.println("reverse of the given number  is "+rev);
		System.out.println();
		
	}

	public void doWhileLoop() {
		// TODO Auto-generated method stub
		System.out.println("Do while loop: ");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int number=sc.nextInt();
		//System.out.println(number);
		/*
		 * int rev=0; while(number>0) { int n=number%10; rev=(rev*10)+n;
		 * number=number/10; }
		 */
		int rev=0;
		do { 
			rev=(rev*10)+(number%10);
			number=number/10;
		}while(number>0);
		System.out.println("reverse of the given number  is "+rev);
		System.out.println();
	}

	public void whileLoop() {
		// TODO Auto-generated method stub
		System.out.println("while loop: ");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int number=sc.nextInt();
		//System.out.println(number);
		/*
		 * int rev=0; while(number>0) { int n=number%10; rev=(rev*10)+n;
		 * number=number/10; }
		 */
		int rev=0;
		while(number>0) { 
			rev=(rev*10)+(number%10);
			number=number/10;
		}
		System.out.println("reverse of the given number  is "+rev);
		System.out.println();
		
	}

}
/* output :
 
 Reverse of the given NUmber :
while loop: 
Enter the number:
345
reverse of the given number  is 543

Do while loop: 
Enter the number:
234
reverse of the given number  is 432

Do while loop: 
Enter the number:
789
reverse of the given number  is 987

*/
