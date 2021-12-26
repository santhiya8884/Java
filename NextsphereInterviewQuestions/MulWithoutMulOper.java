package nextsphere;

public class MulWithoutMulOper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result=mul(600,2);
		System.out.println(result);
	}

	private static int mul(int i, int j) {
		// TODO Auto-generated method stub
		if(j==1) { 
			return i;
		}
		return i+mul(i,j-1);
	}

}
/* output :
1200
*/
