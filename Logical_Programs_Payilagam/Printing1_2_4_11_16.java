package payailagam_logical_programs;

public class Printing1_2_4_11_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printing1_2_4_11_16 sara=new Printing1_2_4_11_16();
		sara.whileLoop(); 
		sara.doWhileLoop();
		sara.forLoop();
	}
	public void forLoop() {
		// TODO Auto-generated method stub
		System.out.println("***For loop  1 2 4 11 16*** ");
		int value=1;
		for(int i=0;i<=10;i+=1) { 
			value=value+i;
			System.out.print(value+" ");
			if(value==16) { 
				break;
			}
			}
		System.out.println();
	}

	public void doWhileLoop() {
		// TODO Auto-generated method stub
		System.out.println("***Do While loop1 2 4 11 16*** ");
		int i=0;
		int value=1;
		do { 
			value=value+i;
			System.out.print(value+" ");
			i+=1;
		}while(value<16);
		System.out.println("\n");
	}

	public void whileLoop() {
		// TODO Auto-generated method stub
		System.out.println("***While loop   1 2 4 7  11 16*** ");
		int i=0;
		int value=1;
		//System.out.println(i);
		while(value<16) { 
			value=value+i;
			System.out.print(value+" ");
			i+=1;
		}
		System.out.println("\n"); 
		}

}
/* output :
***While loop   1 2 4 7  11 16*** 
1 2 4 7 11 16 

***Do While loop1 2 4 11 16*** 
1 2 4 7 11 16 

***For loop  1 2 4 11 16*** 
1 2 4 7 11 16 


*/
