package nextsphere;

import java.util.Scanner;

public class ExactDigitFromNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		System.out.println("Exact digit from a given number");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter which number digit position u want ");
		int num=sc.nextInt();
		int n=1257098;
		int temp=n;
		int count=0;
		while(n>0) { 
			n=n/10;
			count++;
		}
		//System.out.println(count);
		while(temp>0) { 
			int rem=temp%10;
			
			if(rem==num) { 
				System.out.println(rem+" Digit "+count);
			}
			count--;
			temp=temp/10;
			
		}
	}

}
/* output :
 
 Exact digit from a given number
Enter which number digit position u want 
7
7 Digit 4

*/
