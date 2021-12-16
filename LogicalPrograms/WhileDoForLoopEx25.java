package logicalPrograms;

import java.util.Scanner;

public class WhileDoForLoopEx25{

	public static void main(String[] args) {
		// 1 3 5 7 9 
		// TODO Auto-generated method stub
		WhileDoForLoopEx25 sara=new WhileDoForLoopEx25();
		System.out.println(" Factorial");
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the number :");
		int number=sc.nextInt();
		sara.whileLoop(number);
		sara.doLoop(number);
		sara.forLoop(number);
	}

	private void forLoop(int x) {
		// TODO Auto-generated method stub
		int num=x;
		for(;num>0;) { 
			int n=num;
			int fact=1;
			for(;n>0;) { 
				fact=fact*n;
				n--;
			}
			System.out.println(num+"!="+fact);
			num--;
		}
		
			System.out.println();
		
	}

	private void doLoop(int x) {
		// TODO Auto-generated method stub
		int num=x;
		do { 
			int n=num;
			int fact=1;
			do{ 
				fact=fact*n;
				n--;
			}	while(n>0);
			System.out.println(num+"!="+fact);
			num--;
		}while(num>0);
		System.out.println();
	}

	private void whileLoop(int x) {
		// TODO Auto-generated method stub
		int num=x;
		while(num>0) { 
			int n=num;
			int fact=1;
			while(n>0) { 
				fact=fact*n;
				n--;
			}
			System.out.println(num+"!="+fact);
			num--;
		}
		
		System.out.println();
	}

}
/* output :
 Addition of digit until a single digit
 Enter the number :

12345
6

6

6


*/
