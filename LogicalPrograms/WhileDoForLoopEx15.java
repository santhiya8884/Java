package logicalPrograms;

import java.util.Scanner;

public class WhileDoForLoopEx15 {

	public static void main(String[] args) {
		// 1 3 5 7 9 
		// TODO Auto-generated method stub
		WhileDoForLoopEx15 sara=new WhileDoForLoopEx15();
		System.out.println("Sum of digit");
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the number :");
		int number=sc.nextInt();
		sara.whileLoop(number);
		sara.doLoop(number);
		sara.forLoop(number);
	}

	private void forLoop(int x) {
		// TODO Auto-generated method stub
		int no=x,sum=0,rem;
		for(;no>0;){ 
			rem=no%10;
			sum=sum+rem;
			no=no/10;
		}
		System.out.println("Sum of digit "+sum );
		System.out.println();
		
	}

	private void doLoop(int x) {
		// TODO Auto-generated method stub
		int no=x,sum=0,rem;
		do { 
			rem=no%10;
			sum=sum+rem;
			no=no/10;
		}while(no>0);
		System.out.println("Sum of digit "+sum );
	
		System.out.println();
	}

	private void whileLoop(int x) {
		// TODO Auto-generated method stub
		int no=x,sum=0,rem;
		while(no>0) { 
			rem=no%10;
			sum=sum+rem;
			no=no/10;
		}
		System.out.println("Sum of digit "+sum );
	
		System.out.println();
	}

}
/* output :
 
Sum of digit
 Enter the number :
45
Sum of digit 9

Sum of digit 9

Sum of digit 9


*/
