package logicalPrograms;

import java.util.Scanner;

public class WhileDoForLoopEx24 {

	public static void main(String[] args) {
		// 1 3 5 7 9 
		// TODO Auto-generated method stub
		WhileDoForLoopEx24 sara=new WhileDoForLoopEx24();
		System.out.println(" Addition of digit until a single digit");
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the number :");
		int number=sc.nextInt();
		sara.whileLoop(number);
		sara.doLoop(number);
		sara.forLoop(number);
	}

	private void forLoop(int x) {
		// TODO Auto-generated method stub
		int num=x,rem,digit=num;
		
		for(;digit>9;) { 
			num=digit;
			digit=0;
			for(;num>0;) { 
				rem=num%10;
				digit=digit+rem;
				num=num/10;
				
			}
		}
		
		
		System.out.println(digit);
	
		System.out.println();
		
	}

	private void doLoop(int x) {
		// TODO Auto-generated method stub
		int num=x,rem,digit=num;
		
	do	{ 
			num=digit;
			digit=0;
		do	 { 
				rem=num%10;
				digit=digit+rem;
				num=num/10;
				
			}while(num>0);
		}while(digit>9) ;
		
		
		System.out.println(digit);
		System.out.println();
	}

	private void whileLoop(int x) {
		// TODO Auto-generated method stub
		int num=x,rem,digit=num;
		
		while(digit>9) { 
			num=digit;
			digit=0;
			while(num>0) { 
				rem=num%10;
				digit=digit+rem;
				num=num/10;
				
			}
		}
		
		
		System.out.println(digit);
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
