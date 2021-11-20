package payailagam_logical_programs;

public class FibonacciSeriesWithout3rdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibonacciSeriesWithout3rdVariable sara=new FibonacciSeriesWithout3rdVariable();
		System.out.println("Fibonacci Series Without 3rd Variable");
		System.out.println();
		sara.whileLoop();
		sara.doWhileLoop();
		sara.forLoop();
	
	}

	public void forLoop() {
		// TODO Auto-generated method stub
		System.out.println("Fibonacci Series using For LOop");
		int a=-1,b=1;
		
		//int count=2;
		for(int count=0;count<10;count++){ 
			
			System.out.print((a+b)+" ");
			b=a+b;
			a=b-a;
			//count++;
		}
		System.out.println("\n");
	}

	public void doWhileLoop() {
		// TODO Auto-generated method stub
		System.out.println("Fibonacci Series using Do While LOop");
		int a=-1,b=1;
		int count=0;
		do{ 
			System.out.print((a+b)+" ");
			b=a+b;
			a=b-a;
			
			
			count++;
		}while(count<10);
		System.out.println("\n");
	}

	public void whileLoop() {
		// TODO Auto-generated method stub
		System.out.println("Fibonacci Series using While LOop");
		int a=-1,b=1;
		int count=0;
		while(count<10) { 
			//int c=a+b;
			System.out.print((a+b)+" ");
			b=a+b;
			a=b-a;
			count++;
		}
		System.out.println("\n");
		
	}

	
}

/* output :
Fibonacci Series Without 3rd Variable

Fibonacci Series using While LOop
0 1 1 2 3 5 8 13 21 34 

Fibonacci Series using Do While LOop
0 1 1 2 3 5 8 13 21 34 

Fibonacci Series using For LOop
0 1 1 2 3 5 8 13 21 34 
*/