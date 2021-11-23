package payailagam_logical_programs;

public class Loop12471116 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loop12471116 sara=new Loop12471116();
		sara.whileLoop();
		sara.doWhilLoop();
		sara.forLoop();
	}

	public void forLoop() {
		// TODO Auto-generated method stub
		System.out.println("For Loop");
		int i=1;
		
	for(int j=0;j<=5;){
			
			System.out.print(i+" ");
			j++;
			i=i+j;
			
			
		}
		System.out.println("\n");

		
	}

	public void doWhilLoop() {
		// TODO Auto-generated method stub
		System.out.println("Do While Loop");
		int i=1;
		int j=0;
	do	{
			
			System.out.print(i+" ");
			j++;
			i=i+j;
			
			
		}while(j<=5) ;
		System.out.println("\n");
	}

	public void whileLoop() {
		// TODO Auto-generated method stub
		//1 2 4 7 11 16
		System.out.println("While Loop");
		int i=1;
		int j=0;
		while(j<=5) {
			
			System.out.print(i+" ");
			j++;
			i=i+j;
			
			
		}
		System.out.println("\n");
		
	}

}
/* output :
 While Loop
1 2 4 7 11 16 

Do While Loop
1 2 4 7 11 16 

For Loop
1 2 4 7 11 

*/
