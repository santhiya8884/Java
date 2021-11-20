package payailagam_logical_programs;

import java.util.Scanner;

public class PalindromeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PalindromeOrNot sara=new PalindromeOrNot();
		System.out.println("Given NUmber palindrome or not :");
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
		int temp=number;
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
		if(temp==rev)
		{ 
			System.out.println("Given number  is palindrom");
		}		
		else { 
			System.out.println("Given number  is  not palindrom");
		}
		System.out.println();
		
	}

	public void doWhileLoop() {
		// TODO Auto-generated method stub
		System.out.println("Do while loop: ");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int number=sc.nextInt();
		int temp=number;
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
		if(temp==rev)
		{ 
			System.out.println("Given number  is palindrom");
		}		
		else { 
			System.out.println("Given number  is  not palindrom");
		}
	
		System.out.println();
	}

	public void whileLoop() {
		// TODO Auto-generated method stub
		System.out.println("while loop: ");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int number=sc.nextInt();
		int temp=number;
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
		if(temp==rev)
		{ 
			System.out.println("Given number  is palindrom");
		}		
		else { 
			System.out.println("Given number  is  not palindrom");
		}
		System.out.println();
		
	}

}
/* output :
 
Given NUmber palindrome or not :
while loop: 
Enter the number:
123
Given number  is  not palindrom

Do while loop: 
Enter the number:
545
Given number  is palindrom

Do while loop: 
Enter the number:
678
Given number  is  not palindrom

*/
