package logicalPrograms;

public class WhileDoForLoopEx10 {

	public static void main(String[] args) {
		// 1 3 5 7 9 
		// TODO Auto-generated method stub
		WhileDoForLoopEx10 sara=new WhileDoForLoopEx10();
	
		sara.whileLoop();
		sara.doLoop();
		sara.forLoop();
	}

	private void forLoop() {
		// TODO Auto-generated method stub
		int j=10;
		for(int i=1;i<j;i++) { 
			
			System.out.print(i*j+" ");	
			
			j--;
		}
		System.out.println();
		
	}

	private void doLoop() {
		// TODO Auto-generated method stub
		int i=1,j=10;
		do { 
			
			System.out.print(i*j+" ");	
			i++;
			j--;
		}while(i<j);
	
		System.out.println();
	}

	private void whileLoop() {
		// TODO Auto-generated method stub
		int i=1,j=10;
		while(i<j) { 
			
			System.out.print(i*j+" ");	
			i++;
			j--;
		}
	
		System.out.println();
	}

}
/* output :
 
10 18 24 28 30 
10 18 24 28 30 
10 18 24 28 30 

*/
