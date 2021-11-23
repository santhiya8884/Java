package payailagam_logical_programs;

import java.util.Scanner;

public class AdditionOfNNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdditionOfNNumber sara=new AdditionOfNNumber();
		sara.whileLoop();
		sara.doWhilLoop();
		sara.forLoop();
	}

	public void forLoop() {
		// TODO Auto-generated method stub
		System.out.println("Using For  while loop");
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the how many numbers add :");
		int totnumber=sc.nextInt();
		
		for(int i=0;i<totnumber;i++) { 
			System.out.println("enter the number");
			sum=sum+(sc.nextInt());
			
		}
		System.out.println("Sum is "+sum);
		System.out.println("\n");
		
	}

	public void doWhilLoop() {
		// TODO Auto-generated method stub
		System.out.println("Using  Do while loop");
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the how many numbers add :");
		int totnumber=sc.nextInt();
		int i=0;
		do { 
			System.out.println("enter the number");
			sum=sum+(sc.nextInt());
			i++;
		}while(i<totnumber);
		System.out.println("Sum is "+sum);
		System.out.println("\n");
	}

	public void whileLoop() {
		// TODO Auto-generated method stub
		System.out.println("Using while loop");
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the how many numbers add :");
		int totnumber=sc.nextInt();
		int i=0;
		while(i<totnumber) { 
			System.out.println("enter the number");
			sum=sum+(sc.nextInt());
			i++;
		}
		System.out.println("Sum is "+sum);
		System.out.println("\n");
	}

}

/* output :
Using while loop
Enter the how many numbers add :
3
enter the number
4
enter the number
5
enter the number
1
Sum is 10


Using  Do while loop
Enter the how many numbers add :
3
enter the number
2
enter the number
1
enter the number
4
Sum is 7


Using For  while loop
Enter the how many numbers add :
4
enter the number
3
enter the number
2
enter the number
1
enter the number
2
Sum is 8
*/