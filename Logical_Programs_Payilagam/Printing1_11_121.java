package payailagam_logical_programs;

public class Printing1_11_121 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printing1_11_121 sara=new Printing1_11_121();
		sara.whileLoop(); 
		sara.doWhileLoop();
		sara.forLoop();
	}
	public void forLoop() {
		// TODO Auto-generated method stub
		System.out.println("***For loop  1 11 121*** ");
		int value=1;
		for(int i=1;i<=3;i+=1) { 
			System.out.print(value+" ");
			value=value*11;
				
			}
		System.out.println();
	}

	public void doWhileLoop() {
		// TODO Auto-generated method stub
		System.out.println("***Do While loop 1  11 121*** ");
		int i=1;
		int value=1;
		do { 
			System.out.print(value+" ");
			value=value*11;
			i+=1;
		}while(i<=3);
		System.out.println("\n");
	}

	public void whileLoop() {
		// TODO Auto-generated method stub
		System.out.println("***While loop  1 11 121*** ");
		int i=1;
		int value=1;
		//System.out.println(i);
		while(i<=3) { 
			System.out.print(value+" ");
			value=value*11;
			i+=1;
		}
		System.out.println("\n"); 
		}

}
/* output :
 ***While loop  1 11 121*** 
1 11 121 

***Do While loop 1  11 121*** 
1 11 121 

***For loop  1 11 121*** 
1 11 121 
*/
