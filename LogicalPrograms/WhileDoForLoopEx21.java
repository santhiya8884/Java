package logicalPrograms;

import java.util.Scanner;

public class WhileDoForLoopEx21 {

	public static void main(String[] args) {
		// 1 3 5 7 9 
		// TODO Auto-generated method stub
		WhileDoForLoopEx21 sara=new WhileDoForLoopEx21();
		System.out.println("First n prime number");
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the prime number range :");
		int number=sc.nextInt();
		sara.whileLoop(number);
		sara.doLoop(number);
		sara.forLoop(number);
	}

	private void forLoop(int x) {
		// TODO Auto-generated method stub
		int no=3,range=x,i=2;
		boolean flag=true;
		System.out.print(2+" ");
		int count=1;
		while(count<range) { 
			while(i<no) { 
				if(no%2==0) { 
					flag=false;
					break;
				}
				i++;
			}
			if(flag==true) { 
				if(count==range) { 
					break;
				}
				System.out.print(no+" ");
				count++;
			}
			no=no+2;
		}
		System.out.println();
		
	}

	private void doLoop(int x) {
		// TODO Auto-generated method stub
		int no=3,range=x,i=2;
		boolean flag=true;
		System.out.print(2+" ");
		int count=1;
		for(;count<range;) { 
			for(;i<no;) { 
				if(no%2==0) { 
					flag=false;
					break;
				}
				i++;
			}
			if(flag==true) { 
				if(count==range) { 
					break;
				}
				System.out.print(no+" ");
				count++;
			}
			no=no+2;
		}
		System.out.println();
	}

	private void whileLoop(int x) {
		// TODO Auto-generated method stub
		int no=3,range=x,i=2;
		boolean flag=true;
		System.out.print(2+" ");
		int count=1;
	do	 { 
		do	{ 
				if(no%2==0) { 
					flag=false;
					break;
				}
				i++;
			}while(i<no) ;
			if(flag==true) { 
				if(count==range) { 
					break;
				}
				System.out.print(no+" ");
				count++;
			}
			no=no+2;
		}while(count<range);
		
		System.out.println();
	}

}
/* output :
First n prime number
 Enter the prime number range :
20
2 3 5 7 9 11 13 15 17 19 21 23 25 27 29 31 33 35 37 39 
2 3 5 7 9 11 13 15 17 19 21 23 25 27 29 31 33 35 37 39 
2 3 5 7 9 11 13 15 17 19 21 23 25 27 29 31 33 35 37 39 

*/
