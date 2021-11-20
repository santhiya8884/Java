package payailagam_logical_programs;

public class Print110293847 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Print110293847 sara=new Print110293847();
		sara.whileLoop();
		sara.doWhileLoop();
		sara.forLoop();
	
	}

	public void forLoop() {
		// TODO Auto-generated method stub
		//int i=1;
		int j=10;
		System.out.println("Using  For  while loop -----1*10 2*9 3*8 4*7 -------");
		for(int i=1;i<=4;i++) { 
			System.out.print(i+"*"+j+" ");
		
			j--;
		}
		System.out.println("\n");
	}

	public void doWhileLoop() {
		// TODO Auto-generated method stub
		int i=1;
		int j=10;
		System.out.println("Using  DO  while loop -----1*10 2*9 3*8 4*7 -------");
		do { 
			System.out.print(i+"*"+j+" ");
			i++;
			j--;
		}while(i<=4);
		System.out.println("\n");
	}

	public void whileLoop() {
		// TODO Auto-generated method stub
		int i=1;
		int j=10;
		System.out.println("Using  while loop -----1*10 2*9 3*8 4*7 -------");
		while(i<=4) { 
			System.out.print(i+"*"+j+" ");
			i++;
			j--;
		}
		System.out.println("\n");
	}

}
/* output :
 Using  while loop -----1*10 2*9 3*8 4*7 -------
1*10 2*9 3*8 4*7 

Using  DO  while loop -----1*10 2*9 3*8 4*7 -------
1*10 2*9 3*8 4*7 

Using  For  while loop -----1*10 2*9 3*8 4*7 -------
1*10 2*9 3*8 4*7 
*/
