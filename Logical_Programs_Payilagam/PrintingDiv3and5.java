package payailagam_logical_programs;

import java.util.Scanner;

public class PrintingDiv3and5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintingDiv3and5 sara=new PrintingDiv3and5();
		sara.whileLoop(); 
		sara.doWhileLoop();
		sara.forLoop();
	}
	public void forLoop() {
		// TODO Auto-generated method stub
		System.out.println("***For loop   First 10---number Div 3 & 5 or Maltiple of 3 & 5*** ");
		int number=1;
		int count=0;
		System.out.println("Enter the range for the 3 and 5 multiples :");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<=n;i+=1) { 
			if((number%3==0)&&(number%5==0)) {
				System.out.print(number+" ");
				if(count==10) { 
					break;
				}
				count++;
				}
			number+=1;
			}
		System.out.println();
	}

	public void doWhileLoop() {
		// TODO Auto-generated method stub
		System.out.println("***Do While loop  First 10---number Div 3 & 5 or Maltiple of 3 & 5*** ");
		int number=1;
		int count=0;
		do { 
			if((number%3==0)&&(number%5==0)) {
				count++;
				System.out.print(number+" ");
				
			}
			
			number+=1;
		
		
		}while(count<10);
		System.out.println("\n");
	}

	public void whileLoop() {
		// TODO Auto-generated method stub
		System.out.println("***While loop  First 10---number  Div 3 & 5 or Multiple of 3 & 5*** ");
		int number=1;
	
		//System.out.println(i);
		int count=0;
		while(count<10) { 
			if((number%3==0)&&(number%5==0)) {
				count++;
				System.out.print(number+" ");
				
			}
			
			number+=1;
		}
		System.out.println("\n"); 
		}

}
/* output :
***While loop  First 10---number  Div 3 & 5 or Multiple of 3 & 5*** 
15 30 45 60 75 90 105 120 135 150 

***Do While loop  First 10---number Div 3 & 5 or Maltiple of 3 & 5*** 
15 30 45 60 75 90 105 120 135 150 

***For loop   First 10---number Div 3 & 5 or Maltiple of 3 & 5*** 
Enter the range for the 3 and 5 multiples :
150
15 30 45 60 75 90 105 120 135 150 
*/
