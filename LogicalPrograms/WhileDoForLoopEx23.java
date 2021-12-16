package logicalPrograms;

import java.util.Scanner;

public class WhileDoForLoopEx23 {

	public static void main(String[] args) {
		// 1 3 5 7 9 
		// TODO Auto-generated method stub
		WhileDoForLoopEx23 sara=new WhileDoForLoopEx23();
		System.out.println(" Binary to Decimal conversion");
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the Decimal number :");
		int number=sc.nextInt();
		sara.whileLoop(number);
		sara.doLoop(number);
		sara.forLoop(number);
	}

	private void forLoop(int x) {
		// TODO Auto-generated method stub
	int num=x,rem,decimal=0,i=0;
		
		for(;num>0;) { 
			rem=num%10;
			decimal=decimal+(int)(rem*(Math.pow(2, i)));
			num=num/10;
			i++;
		}
		
		System.out.println(decimal);
		System.out.println();
		
	}

	private void doLoop(int x) {
		// TODO Auto-generated method stub
	int num=x,rem,decimal=0,i=0;
		
		do { 
			rem=num%10;
			decimal=decimal+(int)(rem*(Math.pow(2, i)));
			num=num/10;
			i++;
		}while(num>0);
		
		System.out.println(decimal);
		System.out.println();
	}

	private void whileLoop(int x) {
		// TODO Auto-generated method stub
		int num=x,rem,decimal=0,i=0;
		
		while(num>0) { 
			rem=num%10;
			decimal=decimal+(int)(rem*(Math.pow(2, i)));
			num=num/10;
			i++;
		}
		
		System.out.println(decimal);
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
