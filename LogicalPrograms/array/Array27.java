package array;

import java.util.Scanner;

public class Array27{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array27 sara=new Array27();
		System.out.println("How many duplicate present  in the  array :");
		sara.method1();
		
	}
	private void method1() {
		// TODO Auto-generated method stub
		int array[]= {10,20,10,20,50};//0,1,2,3,4,.............
		int freq[]=new int[array.length];
		int duplicateCount=0;
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
				duplicateCount++;
			}
		}
		System.out.println(duplicateCount);
		
		
}
	
}
/* output :
How many duplicate present  in the  array :
2

*/