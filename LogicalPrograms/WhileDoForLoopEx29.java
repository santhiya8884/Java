package logicalPrograms;

import java.util.Scanner;

public class WhileDoForLoopEx29{

	public static void main(String[] args) {
		// 1 3 5 7 9 
		// TODO Auto-generated method stub
		WhileDoForLoopEx29 sara=new WhileDoForLoopEx29();
		System.out.println(" Given number are Neon  or not ex--- 9.....");
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the number :");
		int number=sc.nextInt();
			sara.whileLoop(number);
		  sara.doLoop(number);
		  sara.forLoop(number);
		 
	}



	private void forLoop(int x) {
		// TODO Auto-generated method stub
		int num=x,temp=num,rem,neon=0;
		int prod=num*num;
		for(;prod>0;) { 
			rem=prod%10;
			neon=neon+rem;
			prod=prod/10;
		}
		
		  if(temp==neon)
		  { 
			  System.out.println("Neon number"); 
			  }
		  else
		  {
			  
		  System.out.println("NO Neon number"); 
		  }
		
			System.out.println();
		
	}

	private void doLoop(int x) {
		// TODO Auto-generated method stub
		int num=x,temp=num,rem,neon=0;
		int prod=num*num;
	do{ 
			rem=prod%10;
			neon=neon+rem;
			prod=prod/10;
		}
	while(prod>0) ;
		  if(temp==neon)
		  { 
			  System.out.println("Neon number"); 
			  }
		  else
		  {
			  
		  System.out.println("NO Neon number"); 
		  }
		System.out.println();
	}

	private void whileLoop(int x) {
		// TODO Auto-generated method stub
		int num=x,temp=num,rem,neon=0;
		int prod=num*num;
		while(prod>0) { 
			rem=prod%10;
			neon=neon+rem;
			prod=prod/10;
		}
		
		  if(temp==neon)
		  { 
			  System.out.println("Neon number"); 
			  }
		  else
		  {
			  
		  System.out.println("NO Neon number"); 
		  }
		 System.out.println();
	}

}
/* output :
 Given number are Neon  or not ex--- 9.....
 Enter the number :
9
Neon number

Neon number

Neon number
*/
