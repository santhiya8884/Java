package nextsphere;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result=fact(5);
		System.out.println(result);
	}

	private static int fact(int i) {
		// TODO Auto-generated method stub
		if(i==0) { 
			return 1;
		}
		return i*fact(i-1);
	}

}
/*o utput :
 
 
 120
 
 
 */
