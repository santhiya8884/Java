package nextsphere;

public class LeapYEarOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year=1700;
		if(year%4==0 && year%400==0 || year%100!=0) { 
			System.out.println("leap");
		}
		else { 
			System.out.println("NOt leap");
		}
	}

}
/* output :
 
 NOt leap


*/
