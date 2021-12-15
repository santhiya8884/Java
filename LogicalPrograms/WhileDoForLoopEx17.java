package logicalPrograms;

import java.util.Scanner;

public class WhileDoForLoopEx17 {

	public static void main(String[] args) {
		// 1 3 5 7 9 
		// TODO Auto-generated method stub
		WhileDoForLoopEx17 sara=new WhileDoForLoopEx17();
		System.out.println("Fibnoacci Series");
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the number :");
		int number=sc.nextInt();
		sara.whileLoop(number);
		sara.doLoop(number);
		sara.forLoop(number);
	}

	private void forLoop(int x) {
		// TODO Auto-generated method stub
		int no=x,a=-1,b=1,c,i=0;
		for(;i<no;) { 
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
			i++;
		}
		
		System.out.println();
		
	}

	private void doLoop(int x) {
		// TODO Auto-generated method stub
		int no=x,a=-1,b=1,c,i=0;
		do{ 
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
			i++;
		}
		while(i<no) ;
		System.out.println();
	}

	private void whileLoop(int x) {
		// TODO Auto-generated method stub
		int no=x,a=-1,b=1,c,i=0;
		while(i<no) { 
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
			i++;
		}
		
	
		System.out.println();
	}

}
/* output :
Fibnoacci Series
 Enter the number :
10
0 1 1 2 3 5 8 13 21 34 
0 1 1 2 3 5 8 13 21 34 
0 1 1 2 3 5 8 13 21 34 
*/
