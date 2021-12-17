package logicalPrograms;

import java.util.Scanner;

public class WhileDoForLoopEx30 {

	public static void main(String[] args) {
		// 1 3 5 7 9 
		// TODO Auto-generated method stub
		WhileDoForLoopEx30 sara=new WhileDoForLoopEx30();
		System.out.println("Given number spy or not 132, 1124");
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the number :");
		int number=sc.nextInt();
		sara.whileLoop(number);
		sara.doLoop(number);
		sara.forLoop(number);
	}

	private void forLoop(int x) {
		// TODO Auto-generated method stub
		int no=x,rem,digitsum=0,prod=1,temp=no;
		for(;no>0;) { 
			rem=no%10;
			digitsum=digitsum+rem;
			no=no/10;
			}
		no=temp;
		for(;no>0;) { 
			rem=no%10;
			prod=prod*rem;
			no=no/10;
			}
		
	
		
		
		  if(digitsum==prod) {
			  System.out.println("Spy number");
			  }
		  else 
		  {
		  System.out.println("Not Spy number");
		  }
		System.out.println();
		
	}

	private void doLoop(int x) {
		// TODO Auto-generated method stub
		int no=x,rem,digitsum=0,prod=1,temp=no;
		do { 
			rem=no%10;
			digitsum=digitsum+rem;
			no=no/10;
			}while(no>0);
		no=temp;
	do{ 
			rem=no%10;
			prod=prod*rem;
			no=no/10;
			}	while(no>0) ;
		
		
		
		
		  if(digitsum==prod) {
			  System.out.println("Spy number");
			  }
		  else 
		  {
		  System.out.println("Not Spy number");
		  }
		System.out.println();
	}

	private void whileLoop(int x) {
		// TODO Auto-generated method stub
		int no=x,rem,digitsum=0,prod=1,temp=no;
		while(no>0) { 
			rem=no%10;
			digitsum=digitsum+rem;
			no=no/10;
			}
		no=temp;
		while(no>0) { 
			rem=no%10;
			prod=prod*rem;
			no=no/10;
			}
		
		
		
		  if(digitsum==prod) {
			  System.out.println("Spy number");
			  }
		  else 
		  {
		  System.out.println("Not Spy number");
		  }
		 
		System.out.println();
	}

}
/* output :
Given number spy or not 132, 1124
 Enter the number :
132
Spy number

Spy number

Spy number
*/
