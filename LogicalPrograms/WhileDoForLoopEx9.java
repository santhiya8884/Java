package logicalPrograms;

public class WhileDoForLoopEx9 {

	public static void main(String[] args) {
		// 1 3 5 7 9 
		// TODO Auto-generated method stub
		WhileDoForLoopEx9 sara=new WhileDoForLoopEx9();
		System.out.println("Multiples os 3 or  5 First 20 numbers ");
		sara.whileLoop();
		sara.doLoop();
		sara.forLoop();
	}

	private void forLoop() {
		// TODO Auto-generated method stub
		
		for(int no=1;no<=20;no++){ 
			
			if(no%3==0||no%5==0) { 
				System.out.print(no+" ");	
				}
		
		}
		
		System.out.println();
		
	}

	private void doLoop() {
		// TODO Auto-generated method stub
		int no=1;
		do { 
			if(no%3==0||no%5==0) { 
				System.out.print(no+" ");	
				}		
			no++;
		}while(no<=20);
	
		System.out.println();
	}

	private void whileLoop() {
		// TODO Auto-generated method stub
		int no=1;
		while(no<=20) { 
			if(no%3==0||no%5==0) { 
			System.out.print(no+" ");	
			}
			no++;
		}
	
		System.out.println();
	}

}
/* output :
 
Multiples os 3 or  5 First 20 numbers 
3 5 6 9 10 12 15 18 20 
3 5 6 9 10 12 15 18 20 
3 5 6 9 10 12 15 18 20 

*/
