package logicalPrograms;

import java.util.Scanner;

public class WhileDoForLoopEx27{

	public static void main(String[] args) {
		// 1 3 5 7 9 
		// TODO Auto-generated method stub
		WhileDoForLoopEx27 sara=new WhileDoForLoopEx27();
		System.out.println(" Given number are Armstrong  or not ex--- 0, 1, 370,371,153,407,1634,.....");
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the number :");
		int number=sc.nextInt();
			sara.whileLoop(number);
		  sara.doLoop(number);
		  sara.forLoop(number);
		  sara.whileLoop1(number);
	}

	private void whileLoop1(int x) {
		// TODO Auto-generated method stub
		int num=x,temp=num,rem,arm=0;
		int count=0;
		while(num>0) { 
			//rem=num%10;
			//arm=arm+(rem*rem*rem);
			num=num/10;
			count++;
		}
		num=temp;
		//System.out.println(count);
		while(num>0) { 
			rem=num%10;
			arm=arm+(int)(Math.pow(rem, count));
			//System.out.println(arm);
			num=num/10;
			
		}
		if(temp==arm) { 
			System.out.println("Armstrong number");
		}
		else { 
			System.out.println("NO Armstrong number");
		}
	}

	private void forLoop(int x) {
		// TODO Auto-generated method stub
		int num=x,temp=num,rem,arm=0;
		
		for(;num>0;) { 
			rem=num%10;
			arm=arm+(rem*rem*rem);
			num=num/10;
		}
		if(temp==arm) { 
			System.out.println("Armstrong number");
		}
		else { 
			System.out.println("NO Armstrong number");
		}
			System.out.println();
		
	}

	private void doLoop(int x) {
		// TODO Auto-generated method stub
		int num=x,temp=num,rem,arm=0;
		
		do { 
			rem=num%10;
			arm=arm+(rem*rem*rem);
			num=num/10;
		}while(num>0);
		if(temp==arm) { 
			System.out.println("Armstrong number");
		}
		else { 
			System.out.println("NO Armstrong number");
		}
		
		System.out.println();
	}

	private void whileLoop(int x) {
		// TODO Auto-generated method stub
		int num=x,temp=num,rem,arm=0;
		
			while(num>0) { 
				rem=num%10;
				arm=arm+(rem*rem*rem);
				num=num/10;
			}
			if(temp==arm) { 
				System.out.println("Armstrong number");
			}
			else { 
				System.out.println("NO Armstrong number");
			}
			
		
		System.out.println();
	}

}
/* output :
 Given number are Armstrong  or not ex--- 0, 1, 370,371,153,407,1634,.....
 Enter the number :
1634
NO Armstrong number

NO Armstrong number

NO Armstrong number

Armstrong number



*/
