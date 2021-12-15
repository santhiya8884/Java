package logicalPrograms;

import java.util.Scanner;

public class WhileDoForLoopEx16 {

	public static void main(String[] args) {
		// 1 3 5 7 9 
		// TODO Auto-generated method stub
		WhileDoForLoopEx16 sara=new WhileDoForLoopEx16();
		System.out.println("Number of digit");
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the number :");
		int number=sc.nextInt();
		sara.whileLoop(number);
		sara.doLoop(number);
		sara.forLoop(number);
	}

	private void forLoop(int x) {
		// TODO Auto-generated method stub
		int no=x,count=0;
		for(;no>0;){ 
			no=no/10; 
			count++;
		}
		System.out.println("Number of digit"+count );
		System.out.println();
		
	}

	private void doLoop(int x) {
		// TODO Auto-generated method stub
		int no=x,count=0;
		do { 
			no=no/10; 
			count++;
		}while(no>0);
		System.out.println("Number of digit "+count );
	
		System.out.println();
	}

	private void whileLoop(int x) {
		// TODO Auto-generated method stub
		int no=x,count=0;
		while(no>0) { 
			no=no/10; 
			count++;
			
		}
		System.out.println("Number of digit "+count );
	
		System.out.println();
	}

}
/* output :
Number of digit
 Enter the number :
345
Number of digit 3

Number of digit 3

Number of digit3

*/
