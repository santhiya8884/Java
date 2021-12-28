package recursion;

public class MulOfNnumber {
	static int mul=1;
	static int mul1=1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result=add(1);
		System.out.println(result);
		int result1=add1(5);
		System.out.println(result1);
	}
	
	private static int add1(int k) {
		// TODO Auto-generated method stub
		if(k>0) { 
			mul1=mul1*k;
			//System.out.println(sum);
			k--;
			add1(k);
			
		}
		return mul1;
	}

	private static int add(int i) {
		// TODO Auto-generated method stub
		if(i<=5) { 
			mul=mul*i;
			//System.out.println(sum);
			i++;
			add(i);
			
		}
		return mul;
		
	}
}
/* output :
120
120

*/