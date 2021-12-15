package logicalPrograms;

import java.util.Scanner;

public class WhileDoForLoopEx18 {

	public static void main(String[] args) {
		// 1 3 5 7 9 
		// TODO Auto-generated method stub
		WhileDoForLoopEx18 sara=new WhileDoForLoopEx18();
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
		int no=x,a=-1,b=1,c;
		for(;;) {
			c=a+b;
			if(c>no) { 
				break;
			}
				System.out.print(c+" ");
			
			
			a=b;
			b=c;
			//i++;
		}
		//System.out.println();
		
	}

	private void doLoop(int x) {
		// TODO Auto-generated method stub
		int no=x,a=-1,b=1,c;
		do{
			c=a+b;
			if(c>no) { 
				break;
			}
				System.out.print(c+" ");
			
			
			a=b;
			b=c;
			//i++;
		}while(true) ;
		System.out.println();
		

	}

	private void whileLoop(int x) {
		// TODO Auto-generated method stub
		int no=x,a=-1,b=1,c;
		while(true) {
			c=a+b;
			if(c>no) { 
				break;
			}
				System.out.print(c+" ");
			
			
			a=b;
			b=c;
			//i++;
		}
		
	
		System.out.println();
	}

}
/* output :
Fibnoacci Series
 Enter the number :
50
0 1 1 2 3 5 8 13 21 34 
0 1 1 2 3 5 8 13 21 34 
0 1 1 2 3 5 8 13 21 34 
*/
