package recursion;

public class FibonacciSeries {
	static int  f=-1,s=1,count=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result=fib(f,s,count);
		
	}
	private static int fib(int f, int s, int count) {
		// TODO Auto-generated method stub
		
		if(count>0) { 
			s=s+f;
			System.out.println(s);
			f=s-f;
			count--;
			return fib( f,  s, count)  ;
		}
		else { 
			return s;
		}
		
		
		
		
	}

}
/* output :
 0
1
1
2
3
5
8
13
21
34

*/
