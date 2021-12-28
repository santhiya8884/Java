package recursion;

public class XpowerOfN {
	static int x=5,n=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result=power(x,n);
		System.out.println(result);
	}
	private static int power(int x, int n) {
		// TODO Auto-generated method stub
		
		if(n==0) { 
			return 1;
		}
		else if(n==1) { 
			return x;
		}
		else { 
			
				int y=power(x,n/2);
				y=y*y;
				if(n%2==0) { 
					return y;
				}
				else { 
					return x*y;
				}
		}
		
	}

}
/* output :
  1
 */
