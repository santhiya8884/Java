package payailagam_logical_programs;

import java.util.Scanner;

public class FactorialOfTheGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactorialOfTheGivenNumber sara=new FactorialOfTheGivenNumber();
		sara.whileLoop();
		sara.doWhileLoop();
		sara.forLoop();
	}

	public void forLoop() {
		// TODO Auto-generated method stub
		System.out.println("Factorial of the given number using For loop");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number :");
		int number=sc.nextInt();
		int temp=number;
		if(number==0) { 
			System.out.println("Factorial of "+temp+" Is "+0);
		}
		else{ 
			int fact=1;
			for(int i=number;i>0;i--) { 
				fact=fact*(number);
				number--;
			}
			System.out.println("Factorial of "+temp+" Is "+fact);
		}
		System.out.println("\n");
		
	}
	public void doWhileLoop() {
		// TODO Auto-generated method stub
		System.out.println("Factorial of the given number using Do while loop");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number :");
		int number=sc.nextInt();
		int temp=number;
		if(number==0) { 
			System.out.println("Factorial of "+temp+" Is "+0);
		}
		else{ 
			int fact=1;
			do { 
				fact=fact*(number);
				number--;
			}while(number>0);
			System.out.println("Factorial of "+temp+" Is "+fact);
		}
		System.out.println("\n");
		
	}

	public void whileLoop() {
		// TODO Auto-generated method stub
		System.out.println("Factorial of the given number using while loop");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number :");
		int number=sc.nextInt();
		int temp=number;
		if(number==0) { 
			System.out.println("Factorial of "+temp+" Is "+0);
		}
		else{ 
			int fact=1;
			while(number>0) { 
				fact=fact*(number);
				number--;
			}
			System.out.println("Factorial of "+temp+" Is "+fact);
		}
		System.out.println("\n");
		
	}

}

/* output :
Factorial of the given number using while loop
enter the number :
5
Factorial of 5 Is 120


Factorial of the given number using Do while loop
enter the number :
0
Factorial of 0 Is 0


Factorial of the given number using For loop
enter the number :
3
Factorial of 3 Is 6
*/