package payailagam_logical_programs;

public class Loop26122030 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Loop26122030 sara=new Loop26122030();
				sara.whileLoop();
				sara.doWhilLoop();
				sara.forLoop();
	}

	public void forLoop() {
		// TODO Auto-generated method stub
		System.out.println(" For loop");
		
	
		for(int i=1;i<=5;i++) { 
			System.out.print(i*(i+1)+" ");
			
		}
		System.out.println("\n");
	}

	public void doWhilLoop() {
		// TODO Auto-generated method stub
		//2 6 12 20 30   1*2 2*3  3*4 4*5 5*6
				System.out.println(" Do While loop");
				int number=1;
			
				do { 
					System.out.print(number*(number+1)+" ");
					number++;
				}while(number<=5);
				System.out.println("\n");
	}

	public void whileLoop() {
		// TODO Auto-generated method stub
		//2 6 12 20 30   1*2 2*3  3*4 4*5 5*6
		System.out.println("While loop");
		int number=1;
	
		while(number<=5) { 
			System.out.print(number*(number+1)+" ");
			number++;
		}
		System.out.println("\n");
	}

}
/* output :
 While loop
2 6 12 20 30 

 Do While loop
2 6 12 20 30 

 For loop
2 6 12 20 30 
*/
