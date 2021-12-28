package recursion;

public class FactorialNnumbers {
	static int fact=1;
	static int fact1=1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result=fact(1);
		System.out.println(result);
		int result1=fact1(5);
		System.out.println(result1);
	}
	
	private static int fact1(int k) {
		// TODO Auto-generated method stub
		 
			fact1=fact1*k;
			//System.out.println(sum);
			k--;
			if(k>0) { 
			fact1(k);
			}
		return fact1;
	}

	private static int fact(int i) {
		// TODO Auto-generated method stub
		
			fact=fact*i;
			//System.out.println(sum);
			i++;
			if(i<=5) { 
			fact(i);
			
		}
		return fact;
		
	}
}
/* output :
120
120

*/