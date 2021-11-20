package payailagam_logical_programs;

import java.util.Scanner;

public class PrintingTheNumberInReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintingTheNumberInReverseOrder sara=new PrintingTheNumberInReverseOrder();
		System.out.println("Printing the number in reverse order :");
		sara.whileLoop();
		sara.doWhileLoop();
		sara.forLoop();
	}

	public void forLoop() {
		// TODO Auto-generated method stub
		System.out.println("Using Do while loop");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int number=sc.nextInt();
		for(int i=number;i>0;i--) { 
		System.out.println(i);
		
		}
		System.out.println();
	}

	public void doWhileLoop() {
		// TODO Auto-generated method stub
		System.out.println("Using Do while loop");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int number=sc.nextInt();
		do { 
		System.out.println(number);
		number--;
		}while(number>0);
		System.out.println();
	}

	public void whileLoop() {
		// TODO Auto-generated method stub
		System.out.println("Using while loop");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int number=sc.nextInt();
		while(number>0) { 
		System.out.println(number);
		number--;
		}
		System.out.println();
	}

}
/* output :
 Printing the number in reverse order :
Using while loop
Enter the number:
3
3
2
1

Using Do while loop
Enter the number:
5
5
4
3
2
1

Using Do while loop
Enter the number:
4
4
3
2
1
*/
