package logicalPrograms;

import java.util.Scanner;

public class WhileDoForLoopEx32 {

	public static void main(String[] args) {
		// 1 3 5 7 9 
		// TODO Auto-generated method stub
		WhileDoForLoopEx32 sara=new WhileDoForLoopEx32();
		System.out.println("Smallest divisor of the given number");
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the number :");
		int n=sc.nextInt();
		sara.whileLoop(n);
		sara.doLoop(n);
		sara.forLoop(n);
	}

	private void forLoop(int x) {
		// TODO Auto-generated method stub
		int n=x,i=2;
		boolean flag=false;
		for(;i<n/2;) { 
			if(n%i==0)
			{ 
				flag=true;
				break;
			}
			i++;
		}
		
		if(flag==true) { 
			System.out.println(i);
		}
		else { 
			System.out.println(1);
		}
		System.out.println();
		
	}

	private void doLoop(int x) {
		// TODO Auto-generated method stub
		int n=x,i=2;
		boolean flag=false;
		do{ 
			if(n%i==0)
			{ 
				flag=true;
				break;
			}
			i++;
		}while(i<n/2) ;
		
		if(flag==true) { 
			System.out.println(i);
		}
		else { 
			System.out.println(1);
		}
		System.out.println();
	}

	private void whileLoop(int x) {
		// TODO Auto-generated method stub
		int n=x,i=2;
		boolean flag=false;
		while(i<n/2) { 
			if(n%i==0)
			{ 
				flag=true;
				break;
			}
			i++;
		}
		
		if(flag==true) { 
			System.out.println(i);
		}
		else { 
			System.out.println(1);
		}
		System.out.println();
	}

}
/* output :
Smallest divisor of the given number
 Enter the number :
7
1

1

1



*/
