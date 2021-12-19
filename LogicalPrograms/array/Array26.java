package array;

import java.util.Scanner;

public class Array26{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array26 sara=new Array26();
		System.out.println("duplicate elements present in the  array :");
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
			if(freq[i]>1) { 
				System.out.println(array[i]+" "+freq[i]+" times ");
			}
		}
		
		
}
	
}
/* output :
duplicate elements present in the  array :
10 2 times 
20 2 times 

*/