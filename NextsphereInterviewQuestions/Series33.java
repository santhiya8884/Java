package nextsphere;

public class Series33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1/2+2/5+3/10+4/17+...+n
		double i=1;
		double j=1;
		double k=1;
		double result=0;
		int n=5;
		while(i<=n) {
			j=j+k;
			result=result+(i/(j));
			//System.out.println(result);
			System.out.format("%.1f", result);
			System.out.println();
			i=i+1;
			k=k+2;
			
		}
		
		/*
		 * j=j+k; result=result+(i/(j)); System.out.println(result); i=i+1; k=k+2;
		 */
	}

}
/* output :
 
 0.5
0.9
1.2
1.4
1.6

*/
