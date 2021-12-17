package logicalPrograms;

import java.util.Scanner;

public class WhileDoForLoopEx33 {

	public static void main(String[] args) {
		// 1 3 5 7 9 
		// TODO Auto-generated method stub
		WhileDoForLoopEx33 sara=new WhileDoForLoopEx33();
		System.out.println("Fibonacci series among the prime numbers");
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the number :");
		int n=sc.nextInt();
		sara.whileLoop(n);
		sara.doLoop(n);
		sara.forLoop(n);
	}

	private void forLoop(int x) {
		// TODO Auto-generated method stub
		
		int count=0;
		int n,a=-1,b=1,c;
		for(;;) {
				 c=a+b;
				  if(c>2) { 
					  int i=2;
					  n=c;
					  boolean flag=true;
					 for(;i<n;) 
					  {
				  
				  if(n%i==0) 
				  {
					  flag=false; 
					  break;
					  }
				  i++;
				  } 
					  if(flag==true)
					  { 
						  count++;
						
						  if(count>x) { 
							  
							  break; 
						  }
						  System.out.println(n);
						 }
			  }
				  a=b;
					b=c; 
		 }
		 System.out.println();
	}

	private void whileLoop(int x) {
		// TODO Auto-generated method stub

		int count=0;
		int n,a=-1,b=1,c;
		 while(true) {
				 c=a+b;
				  if(c>2) { 
					  int i=2;
					  n=c;
					  boolean flag=true;
					  while(i<n) 
					  {
				  
				  if(n%i==0) 
				  {
					  flag=false; 
					  break;
					  }
				  i++;
				  } 
					  if(flag==true)
					  { 
						  count++;
						
						  if(count>x) { 
							  
							  break; 
						  }
						  System.out.println(n);
						 }
			  }
				  a=b;
					b=c; 
		 }
		 System.out.println();
			  
}

	private void doLoop(int x) {
		// TODO Auto-generated method stub
		int count=0;
		int n,a=-1,b=1,c;
		 do {
				 c=a+b;
				  if(c>2) { 
					  int i=2;
					  n=c;
					  boolean flag=true;
					 
				do	  {
				  
				  if(n%i==0) 
				  {
					  flag=false; 
					  break;
					  }
				  i++;
				  }  while(i<n) ;
					  if(flag==true)
					  { 
						  count++;
						
						  if(count>x) { 
							  
							  break; 
						  }
						  System.out.println(n);
						 }
			  }
				  a=b;
					b=c; 
		 }while(true);
		 System.out.println();
			
	}	
	
		
}	
		

/* output :
Fibonacci series among the prime numbers
 Enter the number :
5
3
5
13
89
233

3
5
13
89
233

3
5
13
89
233


*/
