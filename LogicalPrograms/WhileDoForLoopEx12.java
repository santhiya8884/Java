package logicalPrograms;

import java.util.Scanner;

public class WhileDoForLoopEx12 {

	public static void main(String[] args) {
		// 1 3 5 7 9 
		// TODO Auto-generated method stub
		WhileDoForLoopEx12 sara=new WhileDoForLoopEx12();
		System.out.println("Given number prime number or not");
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
		boolean flag=true;
		if(no==1&&no==2) { 
			System.out.println("Prime NUmber");
		}
		else { 
		for(;i<no;){ 
				
				if(no%i==0) { 
					flag=false;
					break;
				}
				
				i++;
			}
		}
		if(flag==true) { 
			System.out.println("Prime number");
		}
		else { 
			System.out.println("Not prime number");
		}
		System.out.println();
		
	}

	private void doLoop(int x) {
		// TODO Auto-generated method stub
		int no=x,i=2;
		boolean flag=true;
		if(no==1&&no==2) { 
			System.out.println("Prime NUmber");
		}
		else { 
		do	{ 
				
				if(no%i==0) { 
					flag=false;
					break;
				}
				
				i++;
			}while(i<no) ;
		}
		if(flag==true) { 
			System.out.println("Prime number");
		}
		else { 
			System.out.println("Not prime number");
		}
	
		System.out.println();
	}

	private void whileLoop(int x) {
		// TODO Auto-generated method stub
		int no=x,i=2;
		boolean flag=true;
		if(no==1&&no==2) { 
			System.out.println("Prime NUmber");
		}
		else { 
			while(i<no) { 
				
				if(no%i==0) { 
					flag=false;
					break;
				}
				
				i++;
			}
		}
		if(flag==true) { 
			System.out.println("Prime number");
		}
		else { 
			System.out.println("Not prime number");
		}
		System.out.println();
	}

}
/* output :
 
Given number prime number or not
 Enter the number :
9
Not prime number

Not prime number

Not prime number




*/
