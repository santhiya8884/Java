package payailagam_logical_programs;

public class Priting1_4_9_16_100 {

	public static void main(String[] args) {
		Priting1_4_9_16_100 sara=new Priting1_4_9_16_100();
		sara.whileLoop(); 
		sara.doWhileLoop();
		sara.forLoop();
	}
	public void forLoop() {
		// TODO Auto-generated method stub
		System.out.println("***For loop  1 49 16 25 36 ... 100*** ");
		int value;
		for(int i=1;i<=10;i+=1) { 
			value=i*i;
			System.out.print(value+" ");
			}
		System.out.println();
	}

	public void doWhileLoop() {
		// TODO Auto-generated method stub
		System.out.println("***Do While loop  1 49 16 25 36 ... 100*** ");
		int i=1;
		int value;
		do { 
			value=i*i;
			System.out.print(value+" ");
			i+=1;
		}while(i<=10);
		System.out.println("\n");
	}

	public void whileLoop() {
		// TODO Auto-generated method stub
		System.out.println("***While loop   1 49 16 25 36 ... 100*** ");
		int i=1;
		int value;
		//System.out.println(i);
		while(i<=10) { 
			value=i*i;
			System.out.print(value+" ");
			i+=1;
		}
		System.out.println("\n"); 
		}

}
/* output :
***While loop   1 49 16 25 36 ... 100*** 
1 4 9 16 25 36 49 64 81 100 

***Do While loop  1 49 16 25 36 ... 100*** 
1 4 9 16 25 36 49 64 81 100 

***For loop  1 49 16 25 36 ... 100*** 
1 4 9 16 25 36 49 64 81 100 

*/
