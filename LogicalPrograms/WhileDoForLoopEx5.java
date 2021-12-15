package logicalPrograms;

public class WhileDoForLoopEx5 {

	public static void main(String[] args) {
		// 1 3 5 7 9 
		// TODO Auto-generated method stub
		WhileDoForLoopEx5 sara=new WhileDoForLoopEx5();
		sara.whileLoop();
		sara.doLoop();
		sara.forLoop();
	}

	private void forLoop() {
		// TODO Auto-generated method stub
		for(int no=1;no<=10;no++){ 
			
			if(no%2!=0) { 
				System.out.print(no+" ");
			}
		
		}
		
	}

	private void doLoop() {
		// TODO Auto-generated method stub
		int no=1;
		do { 
			
			if(no%2!=0) { 
				System.out.print(no+" ");
			}
			no++;
			
		}while(no<=10);
		System.out.println();
	}

	private void whileLoop() {
		// TODO Auto-generated method stub
		int no=1;
		while(no<=10) { 
			
			if(no%2!=0) { 
				System.out.print(no+" ");
			}
			no++;
		}
		System.out.println();
	}

}
