package logicalPrograms;

public class WhileDoForLoopEx2 {

	public static void main(String[] args) {
		// 1 4 9 16
		// TODO Auto-generated method stub
		WhileDoForLoopEx2 sara=new WhileDoForLoopEx2();
		sara.whileLoop();
		sara.doLoop();
		sara.forLoop();
	}

	private void forLoop() {
		// TODO Auto-generated method stub
		for(int no=1;no<=4;no=no+1){ 
			
			System.out.print(no*no+" ");
		
		}
		
	}

	private void doLoop() {
		// TODO Auto-generated method stub
		int no=1;
		do { 
			
			System.out.print(no*no+" ");
			no+=1;
			
		}while(no<=4);
		System.out.println();
	}

	private void whileLoop() {
		// TODO Auto-generated method stub
		int no=1;
		while(no<=4) { 
			
			System.out.print(no*no+" ");
			no+=1;
		}
		System.out.println();
	}

}
