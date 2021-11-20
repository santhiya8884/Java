package payailagam_logical_programs;

public class Print13579246810 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Print13579246810 sara=new Print13579246810();
		sara.whileLoop();
		sara.doWhileLoop();
		sara.forLoop();
	}

	public void forLoop() {
		// TODO Auto-generated method stub
		int n=1;
		int n1=2;
		
		System.out.println("Using For while loop print 1 3 5 7 9 2 4 6 8 10****** ");
		for(int i=1;i<=5;i++) { 
			System.out.print(n+" ");
			n=n+2;
		}
		
		for(int i=1;i<=5;i++) { 
			System.out.print(n1+" ");
			n1=n1+2;
		}
		System.out.println("\n");
	}

	public void doWhileLoop() {
		// TODO Auto-generated method stub
		int n=1;
		int n1=2;
		int i=1;
		System.out.println("Using Do while loop print 1 3 5 7 9 2 4 6 8 10****** ");
		do { 
			System.out.print(n+" ");
			n=n+2;
			i++;
		}while(i<=5);
		i=1;
		do { 
			System.out.print(n1+" ");
			n1=n1+2;
			i++;
		}while(i<=5);
		System.out.println("\n");
	}

	public void whileLoop() {
		// TODO Auto-generated method stub
		//1 3 5 7 9 2 4 6 8 10
		int n=1;
		int n1=2;
		int i=1;
		System.out.println("Using while loop print 1 3 5 7 9 2 4 6 8 10****** ");
		while(i<=5) { 
			System.out.print(n+" ");
			n=n+2;
			i++;
		}
		i=1;
		while(i<=5) { 
			System.out.print(n1+" ");
			n1=n1+2;
			i++;
		}
		System.out.println("\n");
	}

}
/* output :
 * Using while loop print 1 3 5 7 9 2 4 6 8 10****** 
1 3 5 7 9 2 4 6 8 10 

Using Do while loop print 1 3 5 7 9 2 4 6 8 10****** 
1 3 5 7 9 2 4 6 8 10 

Using For while loop print 1 3 5 7 9 2 4 6 8 10****** 
1 3 5 7 9 2 4 6 8 10 

*/
