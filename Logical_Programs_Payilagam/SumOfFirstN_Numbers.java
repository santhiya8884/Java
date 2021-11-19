package payailagam_logical_programs;

import java.util.Scanner;

public class SumOfFirstN_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfFirstN_Numbers sara=new SumOfFirstN_Numbers();
		sara.whileLoop(); 
		sara.doWhileLoop();
		sara.forLoop();
	}
	public void forLoop() {
		// TODO Auto-generated method stub
		System.out.println("***---While loop  Sum Of N Numbers ---*** ");
		System.out.println(" Enter the number range");
		Scanner sc=new Scanner(System.in);
		int number_length=sc.nextInt();
		int sum=0;
		for(int i=1;i<=number_length;i++){ 
			sum=sum+i;
			
			}
			System.out.print(sum);
			System.out.println("\n"); 
	}

	public void doWhileLoop() {
		// TODO Auto-generated method stub
		System.out.println("***---While loop  Sum Of N Numbers ---*** ");
		System.out.println(" Enter the number range");
		Scanner sc=new Scanner(System.in);
		int number_length=sc.nextInt();
		int sum=0,i=1;
		do { 
			sum=sum+i;
			i++;
			}while(i<=number_length);
			System.out.print(sum);
			System.out.println("\n"); 
	}

	public void whileLoop() {
		// TODO Auto-generated method stub
		System.out.println("***---While loop  Sum Of N Numbers ---*** ");
		System.out.println(" Enter the number range");
		Scanner sc=new Scanner(System.in);
		int number_length=sc.nextInt();
		int sum=0,i=1;
		while(i<=number_length) { 
			sum=sum+i;
			i++;
			}
			System.out.print(sum);
			System.out.println("\n"); 
		}

}
/* output:
***---While loop  Sum Of N Numbers ---*** 
 Enter the number range
3
6

***---While loop  Sum Of N Numbers ---*** 
 Enter the number range
2
3

***---While loop  Sum Of N Numbers ---*** 
 Enter the number range
4
10

*/


