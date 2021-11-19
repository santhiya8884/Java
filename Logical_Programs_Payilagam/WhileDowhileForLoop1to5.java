package payailagam_logical_programs;

public class WhileDowhileForLoop1to5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1 2 3 4 5
		WhileDowhileForLoop1to5 sara=new WhileDowhileForLoop1to5();
		
		  sara.whileLoop(); 
		  sara.doWhileLoop();
		  sara.forLoop();
		 
		
	}

	public void forLoop() {
		// TODO Auto-generated method stub
		System.out.println("***For loop 1 1 1 1 1*** ");
		for(int i=1;i<=5;i++) { 
				System.out.print(1+" ");
			}
		System.out.println();
			
		
	}

	public void doWhileLoop() {
		// TODO Auto-generated method stub
		System.out.println("***Do While loop 1 1 1 1 1*** ");
		int i=1;
		do { 
			System.out.print(1+" ");
			i++;
		}while(i<=5);
		System.out.println("\n");
	}

	public void whileLoop() {
		// TODO Auto-generated method stub
		System.out.println("***While loop 1 1 1 1 1*** ");
	
		int i=1;
		while(i<=5) { 
			System.out.print(1+" ");
			i++;
		}
		System.out.println("\n");
		
	}

}
/* output :
 ***While loop 1 1 1 1 1*** 
1 1 1 1 1 

***Do While loop 1 1 1 1 1*** 
1 1 1 1 1 

***For loop 1 1 1 1 1*** 
1 1 1 1 1 

1*/ 