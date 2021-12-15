package logicalPrograms;

import java.util.Scanner;

public class WhileDoForLoopEx20 {

	public static void main(String[] args) {
		// 1 3 5 7 9 
		// TODO Auto-generated method stub
		WhileDoForLoopEx20 sara=new WhileDoForLoopEx20();
		System.out.println( "Perfect Square root of the given number");
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the number :");
		int number=sc.nextInt();
		sara.whileLoop(number);
		sara.doLoop(number);
		sara.forLoop(number);
	}

	private void forLoop(int x) {
		// TODO Auto-generated method stub
		int no=x,i=2;
		boolean flag=false;
		for(;i<no/2;i++) { 
			if(no/i==i) { 
				flag=true;
				System.out.println("Square root of the given number :"+i);	
				break;
				}
				
				i++;
			}
			if(flag==false) { 
				System.out.println(Math.sqrt(no));
			}
		
		System.out.println();
		
	}

	private void doLoop(int x) {
		// TODO Auto-generated method stub
		int no=x,i=2;
		boolean flag=false;
		do { 
			if(no/i==i) { 
				flag=true;
			System.out.println("Square root of the given number :"+i);	
				
				break;
				}
				
				i++;
			}while(i<no/2);
			if(flag==false) { 
				System.out.println(Math.sqrt(no));
			}
		System.out.println();
	}

	private void whileLoop(int x) {
		// TODO Auto-generated method stub
		int no=x,i=2;
		boolean flag=false;
		while(i<no/2) { 
			if(no/i==i) { 
				System.out.println(no/i);
				flag=true;
			System.out.println("Square root of the given number :"+i);	
			break;
			}
			
			i++;
		}
		if(flag==false) { 
			System.out.println(Math.sqrt(no));
		}
		
	
		System.out.println();
	}

}
/* output :
Perfect Square root of the given number
 Enter the number :
5
2.23606797749979

Square root of the given number :2

2.23606797749979
*/
