package nextsphere;

import java.util.Scanner;

public class PowerUsingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the BAse");
		int base=sc.nextInt();
		System.out.println("Enter the Exponent");
		int exp=sc.nextInt();
		int result=powUsingRecursion(base,exp);
		System.out.println(result);
	}

	private static int powUsingRecursion(int base, int exp) {
		// TODO Auto-generated method stub
		if(exp!=0) { 
			return (base*powUsingRecursion(base,exp-1));
		}
		else { 
			return 1;
		}
	}

}
/* output :
 
 Enter the BAse
5
Enter the Exponent
3
125

*/
