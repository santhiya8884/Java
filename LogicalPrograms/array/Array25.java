package arrayPracticePayialagam;

import java.util.Scanner;

public class Array25{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array25 sara=new Array25();
		System.out.println("No duplicate elements present in the  array :");
		sara.method1();
		
	}
	private void method1() {
		// TODO Auto-generated method stub
		int array[]= {10,20,10,20,50};//0,1,2,3,4,.............
		int freq[]=new int[array.length];
		
		for(int i=0;i<array.length;i++) { 
			int no=array[i];
			int count=1;
			for(int j=i+1;j<array.length;j++) { 
				if(no==array[j]) {
					freq[j]=-5;
					count++;
				}
			}
			if(freq[i]!=-5) { 
				freq[i]=count;
			}
		}
		for(int i=0;i<freq.length;i++) { 
			if(freq[i]==1) { 
				System.out.println(array[i]+" "+freq[i]+" times ");
			}
		}
		
		
}
	
}
/* output :
No duplicate elements present in the  array :
50 1 times 

*/