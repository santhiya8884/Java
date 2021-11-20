package payailagam_logical_programs;

import java.util.Scanner;

public class GivenNumberPrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GivenNumberPrimeOrNot sara=new GivenNumberPrimeOrNot();
		sara.whileLoop();
		sara.doWhileLoop();
		sara.forLoop();
	}

	public void forLoop() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Using Forloop hcheck for the given number prime OR not");
		System.out.println("Enter the number :");
		int number=sc.nextInt();
		if(number==0||number==1) { 
			System.out.println("GIven number "+number+" not prime ");
		}
		else { 
			//int i=2;
			boolean prime_flag=true;
			for(int i=2;i<number;i++) { 
				if(number%i==0) { 
					//System.out.println("GIven number "+number+" not prime ");
					prime_flag=false;
					break;
				}
				
			}
			if(prime_flag==true) { 
				System.out.println("GIven number "+number+"  prime ");
			}
			else { 
				System.out.println("GIven number "+number+"  not prime ");
			}
		}
		System.out.println("\n");
	}

	public void doWhileLoop() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Using Do While loop hcheck for the given number prime OR not");
		System.out.println("Enter the number :");
		int number=sc.nextInt();
		if(number==0||number==1) { 
			System.out.println("GIven number "+number+" not prime ");
		}
		else { 
			int i=2;
			boolean prime_flag=true;
			do { 
				if(number%i==0) { 
					//System.out.println("GIven number "+number+" not prime ");
					prime_flag=false;
					break;
				}
				i++;
			}while(i<number);
			if(prime_flag==true) { 
				System.out.println("GIven number "+number+"  prime ");
			}
			else { 
				System.out.println("GIven number "+number+"  not prime ");
			}
		}
		System.out.println("\n");
	}

	public void whileLoop() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Using while loop hcheck for the given number prime OR not");
		System.out.println("Enter the number :");
		int number=sc.nextInt();
		if(number==0||number==1) { 
			System.out.println("GIven number "+number+" not prime ");
		}
		else { 
			int i=2;
			boolean prime_flag=true;
			while(i<number) { 
				if(number%i==0) { 
					//System.out.println("GIven number "+number+" not prime ");
					prime_flag=false;
					break;
				}
				i++;
			}
			if(prime_flag==true) { 
				System.out.println("GIven number "+number+"  prime ");
			}
			else { 
				System.out.println("GIven number "+number+"  not prime ");
			}
		}System.out.println("\n");
	}
	

}
/* output :
 
 
 Using while loop hcheck for the given number prime OR not
Enter the number :
23
GIven number 23  prime 


Using Do While loop hcheck for the given number prime OR not
Enter the number :
8
GIven number 8  not prime 


Using Forloop hcheck for the given number prime OR not
Enter the number :
77
GIven number 77  not prime 

*/
