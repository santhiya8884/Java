package logicalPrograms;

public class WhileDoForLoopEx7 {

	public static void main(String[] args) {
		// 1 3 5 7 9 
		// TODO Auto-generated method stub
		WhileDoForLoopEx7 sara=new WhileDoForLoopEx7();
		sara.whileLoop();
		sara.doLoop();
		sara.forLoop();
	}

	private void forLoop() {
		// TODO Auto-generated method stub
		int sum=0,no=1;
		for(;no<=5;no++){ 
			
			sum=sum+no;
		
		}
		System.out.println("Addition of First "+(no-1)+" numbers "+sum);
		System.out.println();
		
	}

	private void doLoop() {
		// TODO Auto-generated method stub
		int no=1,sum=0;
		do { 
			sum=sum+no;
			no++;
		}while(no<=5);
		System.out.println("Addition of First "+(no-1)+" numbers "+sum);
		System.out.println();
	}

	private void whileLoop() {
		// TODO Auto-generated method stub
		int no=1,sum=0;
		while(no<=5) { 
			sum=sum+no;
			no++;
		}
		System.out.println("Addition of First "+(no-1)+" numbers "+sum);
		System.out.println();
	}

}
/* output :
 
Addition of First 5 numbers 15

Addition of First 5 numbers 15

Addition of First 5 numbers 15


*/
