package payailagam_logical_programs;

import java.util.Scanner;

public class Print1223344556 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Print1223344556 sara=new Print1223344556();
		sara.whileLoop(); 
		sara.doWhileLoop();
		sara.forLoop();
	}
	public void forLoop() {
		// TODO Auto-generated method stub
		System.out.println("***---For loop  1*2 2*3 3*4 4*5 5*6 ---***  ");
		for(int i=1;i<6;i++) { 
			System.out.print(i+"*"+(i+1)+" ");
			}
		
	System.out.println("\n");
	}

	public void doWhileLoop() {
		// TODO Auto-generated method stub
		System.out.println("***---Do loop  1*2 2*3 3*4 4*5 5*6 ---*** ");
		int i=1;
		do { 
			System.out.print(i+"*"+(i+1)+" ");
			i++;
		}while(i<6);
		System.out.println("\n");
	}

	public void whileLoop() {
		// TODO Auto-generated method stub
		System.out.println("***---While loop  1*2 2*3 3*4 4*5 5*6 ---*** ");
		int i=1;
		while(i<6) { 
				System.out.print(i+"*"+(i+1)+" ");
			i++;	
			}
			System.out.println("\n"); 
		}

}
/* output:
 
***---While loop  1*2 2*3 3*4 4*5 5*6 ---*** 
1*2 2*3 3*4 4*5 5*6 

***---Do loop  1*2 2*3 3*4 4*5 5*6 ---*** 
1*2 2*3 3*4 4*5 5*6 

***---For loop  1*2 2*3 3*4 4*5 5*6 ---***  
1*2 2*3 3*4 4*5 5*6 


*/
