package payailagam_logical_programs;

import java.util.Scanner;

public class Addition_Given_Of_N_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition_Given_Of_N_Number sara=new Addition_Given_Of_N_Number();
		sara.whileLoop(); 
		sara.doWhileLoop();
		sara.forLoop();
	}
	public void forLoop() {
		// TODO Auto-generated method stub
		System.out.println("***---For loop  Addtion of NNUmbers  ---*** ");
		System.out.println("How many numbers to be added ");
		Scanner sc=new Scanner(System.in);
		int number_length=sc.nextInt();
		int sum=0;
		for(int i=0;i<number_length;i++) { 
			System.out.println("enter the number");
			int number=sc.nextInt();
				sum=sum+number;
			}
			System.out.print(sum);
			System.out.println("\n"); 
	}

	public void doWhileLoop() {
		// TODO Auto-generated method stub
		System.out.println("***---Do loop  Addtion of NNUmbers  ---*** ");
		System.out.println("How many numbers to be added ");
		Scanner sc=new Scanner(System.in);
		int number_length=sc.nextInt();
		int sum=0,i=1;
		do { 
			System.out.println("enter the number");
			int number=sc.nextInt();
				sum=sum+number;
			i++;
			}while(i<=number_length);
			System.out.print(sum);
			System.out.println("\n"); 
	}

	public void whileLoop() {
		// TODO Auto-generated method stub
		System.out.println("***---While loop  Addtion of NNUmbers  ---*** ");
		System.out.println("How many numbers to be added ");
		Scanner sc=new Scanner(System.in);
		int number_length=sc.nextInt();
		int sum=0,i=1;
		while(i<=number_length) { 
			System.out.println("enter the number");
			int number=sc.nextInt();
				sum=sum+number;
			i++;
			}
			System.out.print(sum);
			System.out.println("\n"); 
		}

}
/* output:
***---While loop  Addtion of NNUmbers  ---*** 
How many numbers to be added 
2
enter the number
1
enter the number
3
4

***---Do loop  Addtion of NNUmbers  ---*** 
How many numbers to be added 
3
enter the number
1
enter the number
4
enter the number
5
10

***---For loop  Addtion of NNUmbers  ---*** 
How many numbers to be added 
2
enter the number
1
enter the number
7
8
*/

