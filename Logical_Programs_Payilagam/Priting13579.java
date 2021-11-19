package payailagam_logical_programs;

public class Priting13579 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Priting13579 sara=new Priting13579();
		sara.whileLoop(); 
		  sara.doWhileLoop();
		  sara.forLoop();
	}
	public void forLoop() {
		// TODO Auto-generated method stub
		System.out.println("***For loop  1 3 5 7 9*** ");
		for(int i=1;i<=9;i+=2) { 
				System.out.print(i+" ");
			}
		System.out.println();
	}

	public void doWhileLoop() {
		// TODO Auto-generated method stub
		System.out.println("***Do While loop 1 3 5 7 9*** ");
		int i=1;
		do { 
			System.out.print(i+" ");
			i+=2;
		}while(i<=9);
		System.out.println("\n");
	}

	public void whileLoop() {
		// TODO Auto-generated method stub
		System.out.println("***While loop  1 3 5 7 9*** ");
		int i=1;
		while(i<=9) { 
			System.out.print(i+" ");
			i+=2;
		}
		System.out.println("\n"); 
		}

}
/* output :
***While loop  1 3 5 7 9*** 
1 3 5 7 9 

***Do While loop 1 3 5 7 9*** 
1 3 5 7 9 

***For loop  1 3 5 7 9*** 
1 3 5 7 9 
*/