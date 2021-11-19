package payailagam_logical_programs;

public class Printing12345 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printing12345 sara=new Printing12345();
			sara.whileLoop(); 
		  sara.doWhileLoop();
		  sara.forLoop();
		 
	}

	public void forLoop() {
		// TODO Auto-generated method stub
		System.out.println("***For loop 1 2 3 4 5*** ");
		for(int i=1;i<=5;i++) { 
				System.out.print(i+" ");
			}
		System.out.println();
	}

	private void doWhileLoop() {
		// TODO Auto-generated method stub
		System.out.println("***Do While loop 1 2 3 4 5*** ");
		int i=1;
		do { 
			System.out.print(i+" ");
			i++;
		}while(i<=5);
		System.out.println("\n");
	}

	private void whileLoop() {
		// TODO Auto-generated method stub
		System.out.println("***While loop 1 2 3 4 5*** ");
		int i=1;
		while(i<=5) { 
			System.out.print(i+" ");
			i++;
		}
		System.out.println("\n");
	}

}/* output :
***While loop 1 2 3 4 5*** 
1 2 3 4 5 

***Do While loop 1 2 3 4 5*** 
1 2 3 4 5 

***For loop 1 2 3 4 5*** 
1 2 3 4 5 
*/

