package payailagam_logical_programs;

public class Printing246810 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printing246810 sara=new Printing246810();
		sara.whileLoop(); 
		  sara.doWhileLoop();
		  sara.forLoop();
	}

	public void forLoop() {
		// TODO Auto-generated method stub
		System.out.println("***For loop  2 4 6 8 10*** ");
		for(int i=2;i<=10;i+=2) { 
				System.out.print(i+" ");
			}
		System.out.println();
	}

	public void doWhileLoop() {
		// TODO Auto-generated method stub
		System.out.println("***Do While loop 2 4 6 8 10*** ");
		int i=2;
		do { 
			System.out.print(i+" ");
			i+=2;
		}while(i<=10);
		System.out.println("\n");
	}

	public void whileLoop() {
		// TODO Auto-generated method stub
		System.out.println("***While loop  2 4 6 8 10*** ");
		int i=2;
		while(i<=10) { 
			System.out.print(i+" ");
			i+=2;
		}
		System.out.println("\n");
	}

}
/* output :
 ***While loop  2 4 6 8 10*** 
2 4 6 8 10 

***Do While loop 2 4 6 8 10*** 
2 4 6 8 10 

***For loop  2 4 6 8 10*** 
2 4 6 8 10 
*/
