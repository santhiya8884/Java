package recursion;

public class ReverseOfNumber {
	static int num,rev,rem;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result=reverse(12345);
		System.out.println(result);
	}
	private static int reverse(int i) {
		// TODO Auto-generated method stub
		int num=i;
		rem=num%10;
		rev=(rev*10)+rem;
		num=num/10;
		if(num>0) { 
			reverse(num);
		}
		return rev;
	}

}
/* output :
54321
*/