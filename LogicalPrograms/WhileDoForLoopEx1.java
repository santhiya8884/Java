package logicalPrograms;

public class WhileDoForLoopEx1 {

	public static void main(String[] args) {
		// 1 11 121 
		// TODO Auto-generated method stub
		WhileDoForLoopEx1 sara=new WhileDoForLoopEx1();
		sara.whileLoop();
		sara.doLoop();
		sara.forLoop();
	}

	private void forLoop() {
		// TODO Auto-generated method stub
		for(int no=1;no<=121;no=no*11){ 
			System.out.print(no+" ");
		}
		
	}

	private void doLoop() {
		// TODO Auto-generated method stub
		int no=1;
		do { 
			System.out.print(no+" ");
			no=no*11;
		}while(no<=121);
		System.out.println();
	}

	private void whileLoop() {
		// TODO Auto-generated method stub
		int no=1;
		while(no<=121) { 
			System.out.print(no+" ");
			no=no*11;
		}
		System.out.println();
	}

}
