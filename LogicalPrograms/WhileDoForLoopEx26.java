package logicalPrograms;

import java.util.Scanner;

public class WhileDoForLoopEx26{

	public static void main(String[] args) {
		// 1 3 5 7 9 
		// TODO Auto-generated method stub
		WhileDoForLoopEx26 sara=new WhileDoForLoopEx26();
		System.out.println(" Given number are perfect or not ex--- 6,28 496");
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the number :");
		int number=sc.nextInt();
		sara.whileLoop(number);
		sara.doLoop(number);
		sara.forLoop(number);
	}

	private void forLoop(int x) {
		// TODO Auto-generated method stub
		int num=x,temp=num,i=1,perfect=0;
		
		for(;i<=num/2;) { 
			if(num%i==0) { 
				perfect=perfect+i;
			}
			i++;
		}
		if(temp==perfect) { 
			System.out.println("Perfect");
		}
		else { 
			System.out.println("NO perfect");
		}
			System.out.println();
		
	}

	private void doLoop(int x) {
		// TODO Auto-generated method stub
		int num=x,temp=num,i=1,perfect=0;
		
		do { 
			if(num%i==0) { 
				perfect=perfect+i;
			}
			i++;
		}while(i<=num/2);
		if(temp==perfect) { 
			System.out.println("Perfect");
		}
		else { 
			System.out.println("NO perfect");
		}
		
		System.out.println();
	}

	private void whileLoop(int x) {
		// TODO Auto-generated method stub
		int num=x,temp=num,i=1,perfect=0;
		
			while(i<=num/2) { 
				if(num%i==0) { 
					perfect=perfect+i;
				}
				i++;
			}
			if(temp==perfect) { 
				System.out.println("Perfect");
			}
			else { 
				System.out.println("NO perfect");
			}
			
		
		System.out.println();
	}

}
/* output :
 Given number are perfect or not ex--- 6,28 496
 Enter the number :
6
Perfect

Perfect

Perfect


*/
