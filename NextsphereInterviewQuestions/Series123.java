package nextsphere;

import java.util.Scanner;

public class Series123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("1/1^2+2/2^2/3/3^2+......+n");
		System.out.println("Enter the n value");
		float n=sc.nextFloat();
		float i=1.0f;
		float sum=0.0f;
		while(i<=n) {
			sum=sum+(i/(i*i));
			i++; 
		}
		System.out.println(sum);
		int sum2=(int) sum;
		
		
	/*
	 * sum=sum+(1/1*1); i++; System.out.println(i); System.out.println(sum);
	 * sum=sum+(i/(i*i)); i++; System.out.println(i); System.out.println(sum);
	 * sum=sum+(i/(i*i)); i++; // } System.out.println(i); System.out.println(sum);
	 */		
	}

	
}
/* output :

1/1^2+2/2^2/3/3^2+......+n
Enter the n value
2
1.5



*/
