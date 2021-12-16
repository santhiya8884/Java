package logicalPrograms;

import java.util.Scanner;

public class WhileDoForLoopEx22 {

	public static void main(String[] args) {
		// 1 3 5 7 9 
		// TODO Auto-generated method stub
		WhileDoForLoopEx22 sara=new WhileDoForLoopEx22();
		System.out.println("Decimal to Binary Conversion");
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the Decimal number :");
		int number=sc.nextInt();
		sara.whileLoop(number);
		sara.doLoop(number);
		sara.forLoop(number);
	}

	private void forLoop(int x) {
		// TODO Auto-generated method stub
		int num=x,rem;
		String bin="";
		for(;num>0;) { 
			rem=num%2;
			bin=rem+bin;
			num=num/2;
		}
		System.out.println(bin);
		System.out.println();
		
	}

	private void doLoop(int x) {
		// TODO Auto-generated method stub
		int num=x,rem;
		String bin="";
		do { 
			rem=num%2;
			bin=rem+bin;
			num=num/2;
		}while(num>0);
		System.out.println(bin);
		System.out.println();
	}

	private void whileLoop(int x) {
		// TODO Auto-generated method stub
		int num=x,rem;
		String bin="";
		while(num>0) { 
			rem=num%2;
			bin=rem+bin;
			num=num/2;
		}
		System.out.println(bin);
		System.out.println();
	}

}
/* output :
Decimal to Binary Conversion
 Enter the Decimal number :
20
10100

10100

10100


*/
