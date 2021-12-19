package array;

import java.util.Scanner;

public class Array29{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array29 sara=new Array29();
		System.out.println("How many  no duplicate present  in the  array :");
		sara.method1();
		
	}
	private void method1() {
		// TODO Auto-generated method stub
		int array1[]= {10,20,10,20,50};//0,1,2,3,4,.............
		int array2[]= {60,70,80,90,50};
		
		if(array1.length==array2.length) { 
			int sumArray[]=new int[array1.length];
			for(int i=0;i<array1.length;i++) { 
				sumArray[i]=array1[i]+array2[i];
			}
			for(int i=0;i<sumArray.length;i++) { 
				System.out.println(sumArray[i]);
			}
		}
		else { 
			System.out.println("the two arrays must be same");
		}
		
		
}
	
}
/* output :
How many  no duplicate present  in the  array :
70
90
90
110
100

*/