package logicalPrograms;

import java.util.Scanner;

public class WhileDoForLoopEx28{

	public static void main(String[] args) {
		// 1 3 5 7 9 
		// TODO Auto-generated method stub
		WhileDoForLoopEx28 sara=new WhileDoForLoopEx28();
		System.out.println(" Given number are Strong  or not ex--- 145.....");
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the number :");
		int number=sc.nextInt();
			sara.whileLoop(number);
		  sara.doLoop(number);
		  sara.forLoop(number);
		 
	}



	private void forLoop(int x) {
		// TODO Auto-generated method stub
		int num=x,temp=num,rem,strong=0;
		for(;num>0;) { 
			 rem=num%10;
			 int fact=1;
			 
				for(;rem>0;) { 
					fact=fact*rem;
					rem--;
				}
				
				strong=strong+fact;
				num=num/10;
		}
		
			if(temp==strong) { 
				System.out.println("Strong number");
			}
			else { 
				System.out.println("NO Strong number");
			}
			
		
			System.out.println();
		
	}

	private void doLoop(int x) {
		// TODO Auto-generated method stub
		int num=x,temp=num,rem,strong=0;
		do{ 
			 rem=num%10;
			 int fact=1;
			 
				do { 
					fact=fact*rem;
					rem--;
				}while(rem>0);
				
				strong=strong+fact;
				num=num/10;
		}while(num>0) ;
		
			if(temp==strong) { 
				System.out.println("Strong number");
			}
			else { 
				System.out.println("NO Strong number");
			}
			
		
		System.out.println();
	}

	private void whileLoop(int x) {
		// TODO Auto-generated method stub
		int num=x,temp=num,rem,strong=0;
		while(num>0) { 
			 rem=num%10;
			 int fact=1;
			 
				while(rem>0) { 
					fact=fact*rem;
					rem--;
				}
				
				strong=strong+fact;
				num=num/10;
		}
		
			if(temp==strong) { 
				System.out.println("Strong number");
			}
			else { 
				System.out.println("NO Strong number");
			}
			
		
		System.out.println();
	}

}
/* output :
 Given number are Strong  or not ex--- 145.....
 Enter the number :
145
Strong number

Strong number

Strong number
*/
