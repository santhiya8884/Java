package logicalPrograms;

public class WhileDoForLoopEx11 {

	public static void main(String[] args) {
		// 1 3 5 7 9 
		// TODO Auto-generated method stub
		WhileDoForLoopEx11 sara=new WhileDoForLoopEx11();
		System.out.println("Print 1 2 4 7 11 16");
		sara.whileLoop();
		sara.doLoop();
		sara.forLoop();
	}

	private void forLoop() {
		// TODO Auto-generated method stub
		int i=1;
		for(int no=1;no<=16;) { 
			
			System.out.print(no+" ");	
			no=no+i;
			i++;
		}
		System.out.println();
		
	}

	private void doLoop() {
		// TODO Auto-generated method stub
		int no=1,i=1;
		do { 
			
			System.out.print(no+" ");	
			no=no+i;
			i++;
		}while(no<=16);
	
		System.out.println();
	}

	private void whileLoop() {
		// TODO Auto-generated method stub
		int no=1,i=1;
		while(no<=16) { 
			
			System.out.print(no+" ");	
			no=no+i;
			i++;
		}
	
		System.out.println();
	}

}
/* output :
 
Print 1 2 4 7 11 16
1 2 4 7 11 16 
1 2 4 7 11 16 
1 2 4 7 11 16 


*/
