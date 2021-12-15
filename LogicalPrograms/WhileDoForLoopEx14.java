package logicalPrograms;

import java.util.Scanner;

public class WhileDoForLoopEx14 {

	public static void main(String[] args) {
		// 1 3 5 7 9 
		// TODO Auto-generated method stub
		WhileDoForLoopEx14 sara=new WhileDoForLoopEx14();
		System.out.println("Given number palindrome number or not");
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the number :");
		int number=sc.nextInt();
		sara.whileLoop(number);
		sara.doLoop(number);
		sara.forLoop(number);
	}

	private void forLoop(int x) {
		// TODO Auto-generated method stub
		int no=x,temp=no,rem,rev=0;
		for(;no>0;) { 
			rem=no%10;
			rev=(rev*10)+rem;
			no=no/10;
			}
		//System.out.println("Reverse number is "+rev);

		  if(temp==rev)
		  { 
			  System.out.println("Palindrome number");
			  } 
		  else
		  {
		  System.out.println("Not Palindrome number");
		  }
		System.out.println();
		
	}

	private void doLoop(int x) {
		// TODO Auto-generated method stub
		int no=x,temp=no,rem,rev=0;
	do { 
			rem=no%10;
			rev=(rev*10)+rem;
			no=no/10;
			}	while(no>0);
		//System.out.println("Reverse number is "+rev);

		  if(temp==rev)
		  { 
			  System.out.println("Palindrome number");
			  } 
		  else
		  {
		  System.out.println("Not Palindrome number");
		  }
		System.out.println();
	}

	private void whileLoop(int x) {
		// TODO Auto-generated method stub
		int no=x,temp=no,rem,rev=0;
		while(no>0) { 
			rem=no%10;
			rev=(rev*10)+rem;
			no=no/10;
			}
	//	System.out.println("Reverse number is "+rev);
		
		
		  if(temp==rev)
		  { 
			  System.out.println("Palindrome number");
			  } 
		  else
		  {
		  System.out.println("Not Palindrome number");
		  }
		 
		System.out.println();
	}

}
/* output :
Given number palindrome number or not
 Enter the number :
121
Palindrome number

Palindrome number

Palindrome number



*/
