package payailagam_logical_programs;

public class Printing_1_8_27_64 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printing_1_8_27_64 sara=new Printing_1_8_27_64();
		sara.whileLoop(); 
		sara.doWhileLoop();
		sara.forLoop();
	}
	public void forLoop() {
		// TODO Auto-generated method stub
		System.out.println("***For loop  1 8 27 64*** ");
		int value;
		for(int i=1;i<=4;i+=1) { 
			value=i*i*i;
			System.out.print(value+" ");
			}
		System.out.println();
	}

	public void doWhileLoop() {
		// TODO Auto-generated method stub
		System.out.println("***Do While loop 1 8 27 64*** ");
		int i=1;
		int value;
		do { 
			value=i*i*i;
			System.out.print(value+" ");
			i+=1;
		}while(i<=4);
		System.out.println("\n");
	}

	public void whileLoop() {
		// TODO Auto-generated method stub
		System.out.println("***While loop  1 8 27 64*** ");
		int i=1;
		int value;
		//System.out.println(i);
		while(i<=4) { 
			value=i*i*i;
			System.out.print(value+" ");
			i+=1;
		}
		System.out.println("\n"); 
		}

}
/* output :
***While loop  1 8 27 64*** 
1 8 27 64 

***Do While loop 1 8 27 64*** 
1 8 27 64 

***For loop  1 8 27 64*** 
1 8 27 64 
*/
