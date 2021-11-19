package payailagam_logical_programs;

import java.util.Scanner;

public class ElseIfPraatice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the price :");
		int price=sc.nextInt();
		if(price<35) { 
			System.out.println(" flowers");
		}
		else if(price>35) {
			 System.out.println(" flowers & product ");
		}
		else { 
			System.out.println(" others ");
		}
	}

}
/*output :
 enter the price :
70
 flowers & product 

*/
