package logicalPrograms;

import java.util.Scanner;

public class WhileDoForLoopEx31 {

	public static void main(String[] args) {
		// 1 3 5 7 9 
		// TODO Auto-generated method stub
		WhileDoForLoopEx31 sara=new WhileDoForLoopEx31();
		System.out.println("Fibonacci Series");
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the number :");
		int n=sc.nextInt();
		sara.whileLoop(n);
		sara.doLoop(n);
		sara.forLoop(n);
	}

	private void forLoop(int x) {
		// TODO Auto-generated method stub
		int a=-1,b=1,c;
		for(;;) { 
			c=a+b;
			if(c>x) { 
				break;
			}
			System.out.println(c);
			a=b;
			b=c;
		}
		System.out.println();
		
	}

	private void doLoop(int x) {
		// TODO Auto-generated method stub
		int a=-1,b=1,c;
		do { 
			c=a+b;
			if(c>x) { 
				break;
			}
			System.out.println(c);
			a=b;
			b=c;
		}while(true);
		System.out.println();
	}

	private void whileLoop(int x) {
		// TODO Auto-generated method stub
		int a=-1,b=1,c;
		while(true) { 
			c=a+b;
			if(c>x) { 
				break;
			}
			System.out.println(c);
			a=b;
			b=c;
		}
		System.out.println();
	}

}
/* output :
Fibonacci Series
 Enter the number :
4
0
1
1
2
3

0
1
1
2
3

0
1
1
2
3

*/
