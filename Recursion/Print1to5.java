package recursion;

public class Print1to5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display(1);
	}

	private static void display(int i) {
		// TODO Auto-generated method stub
		if(i<=5) { 
			System.out.println(i);
			i++;
			display(i);
		}
		
		
	}

}
/* output :
 1
2
3
4
5

*/
