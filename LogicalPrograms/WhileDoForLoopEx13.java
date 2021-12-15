package logicalPrograms;

import java.util.Scanner;

public class WhileDoForLoopEx13 {

	public static void main(String[] args) {
		// 1 3 5 7 9 
		// TODO Auto-generated method stub
		WhileDoForLoopEx13 sara=new WhileDoForLoopEx13();
		System.out.println("Reverse of a given number");
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the number :");
		int number=sc.nextInt();
		sara.whileLoop(number);
		sara.doLoop(number);
		sara.forLoop(number);
	}

	private void forLoop(int x) {
		// TODO Auto-generated method stub
		int no=x,rem,rev=0;
		for(;no>0;) { 
			rem=no%10;
			rev=(rev*10)+rem;
			no=no/10;
			}
		System.out.println("Reverse number is "+rev);
		/*
		 * if(flag==true) { System.out.println("Prime number"); } else {
		 * System.out.println("Not prime number"); }
		 */
		System.out.println();
		
	}

	private void doLoop(int x) {
		// TODO Auto-generated method stub
		int no=x,rem,rev=0;
	do { 
			rem=no%10;
			rev=(rev*10)+rem;
			no=no/10;
			}	while(no>0);
		System.out.println("Reverse number is "+rev);
		/*
		 * if(flag==true) { System.out.println("Prime number"); } else {
		 * System.out.println("Not prime number"); }
		 * 
		 * System.out.println();
		 */
		System.out.println();
	}

	private void whileLoop(int x) {
		// TODO Auto-generated method stub
		int no=x,rem,rev=0;
		while(no>0) { 
			rem=no%10;
			rev=(rev*10)+rem;
			no=no/10;
			}
		System.out.println("Reverse number is "+rev);
		
		/*
		 * if(flag==true) { System.out.println("Prime number"); } else {
		 * System.out.println("Not prime number"); }
		 */
		System.out.println();
	}

}
/* output :
Reverse of a given number
 Enter the number :
3452
Reverse number is 2543

Reverse number is 2543

Reverse number is 2543





*/
