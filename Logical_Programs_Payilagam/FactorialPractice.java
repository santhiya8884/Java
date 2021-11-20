package payailagam_logical_programs;

import java.util.Scanner;

public class FactorialPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactorialPractice sara=new FactorialPractice();
		sara.whileLoop();
		sara.doWhileLoop();
		sara.forLoop();
	}

	public void forLoop() {
		// TODO Auto-generated method stub
		System.out.println("Factorial of the given number using DO while loop");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number :");
		int count=sc.nextInt();
		int temp=count;
		if(count==0) { 
			System.out.println("Factorial of "+temp+" Is "+0);
		}
		else{ 
		//	int count=5;
			for(;count>0;) { 
				int fact=1;
				int number1=count;
				for(;number1>0;){ 
					fact=fact*(number1);
					number1--;
					
				}
				System.out.println(count+"! is "+fact);
				count--;
			}
		}
		System.out.println("\n");
		
	}
	public void doWhileLoop() {
		// TODO Auto-generated method stub
		System.out.println("Factorial of the given number using DO while loop");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number :");
		int count=sc.nextInt();
		int temp=count;
		if(count==0) { 
			System.out.println("Factorial of "+temp+" Is "+0);
		}
		else{ 
		//	int count=5;
			do { 
				int fact=1;
				int number1=count;
				do{ 
					fact=fact*(number1);
					number1--;
					
				}while(number1>0) ;
				System.out.println(count+"! is "+fact);
				count--;
			}while(count>0);
		}
		System.out.println("\n");
		
	}

		
	

	public void whileLoop() {
		// TODO Auto-generated method stub
		System.out.println("Factorial of the given number using while loop");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number :");
		int count=sc.nextInt();
		int temp=count;
		if(count==0) { 
			System.out.println("Factorial of "+temp+" Is "+0);
		}
		else{ 
			//int count=5;
			while(count>0) { 
				int fact=1;
				int number1=count;
				while(number1>0) { 
					fact=fact*(number1);
					number1--;
					
				}
				System.out.println(count+"! is "+fact);
				count--;
			}
		}
		System.out.println("\n");
		
	}

}

/* output :
Factorial of the given number using while loop
enter the number :
5
5! is 120
4! is 24
3! is 6
2! is 2
1! is 1


Factorial of the given number using DO while loop
enter the number :
4
4! is 24
3! is 6
2! is 2
1! is 1


Factorial of the given number using DO while loop
enter the number :
3
3! is 6
2! is 2
1! is 1

*/