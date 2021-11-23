package payailagam_logical_programs;

public class Loop109876 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loop109876 sara=new Loop109876();
		sara.whileLoop();
		sara.doWhilLoop();
		sara.forLoop();
	}

	public void forLoop() {
		// TODO Auto-generated method stub
		System.out.println("While Loop");
		int n=10;
	
		
		for(int i=1;i<=n;i++) { 
			System.out.print(n*i+" ");
			n--;
			
		}
		System.out.println();
	}

	public void doWhilLoop() {
		// TODO Auto-generated method stub
		System.out.println("Do While Loop");
		int n=10;
		int i=1;
		
		do { 
			System.out.print(n*i+" ");
			n--;
			i++;
		}while(i<=n);
		System.out.println();
	}

	public void whileLoop() {
		// TODO Auto-generated method stub
		System.out.println("While Loop");
		int n=10;
		int i=1;
		
		while(i<=n) { 
			System.out.print(n*i+" ");
			n--;
			i++;
		}
		System.out.println();
		
	}

}
/* output:
	While Loop
	10 18 24 28 30 
	Do While Loop
	10 18 24 28 30 
	While Loop
	10 18 24 28 30 
	*/
