package logicalPrograms;

public class WhileDoForLoopEx4 {

	public static void main(String[] args) {
		// 1 2 3 4 5
		// TODO Auto-generated method stub
		WhileDoForLoopEx4 sara=new WhileDoForLoopEx4();
		sara.whileLoop();
		sara.doLoop();
		sara.forLoop();
	}

	private void forLoop() {
		// TODO Auto-generated method stub
		for(int no=1;no<=5;no=no+1){ 
			
			System.out.print(no+" ");
		
		}
		
	}

	private void doLoop() {
		// TODO Auto-generated method stub
		int no=1;
		do { 
			
			System.out.print(no+" ");
			no+=1;
			
		}while(no<=5);
		System.out.println();
	}

	private void whileLoop() {
		// TODO Auto-generated method stub
		int no=1;
		while(no<=5) { 
			
			System.out.print(no+" ");
			no+=1;
		}
		System.out.println();
	}

}
