package array;

import java.util.Scanner;

public class Array30{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array30 sara=new Array30();
		System.out.println("Unique elements copied  into another array or romoving the duplicate elements in the array:");
		sara.method1();
		
	}
	private void method1() {
		// TODO Auto-generated method stub
		int array[]= {10,20,10,20,50,80,70,60,80};//0,1,2,3,4,.............
		int freq[]=new int[array.length];
		int unique=0;
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
				unique++;
			}
		}
		
				
		  int uniquearray[]=new int[unique]; 
		  int k=0; 
		  for(int i=0;i<freq.length;i++) 
		  {
		  if(freq[i]==1)
		  { 
			  uniquearray[k]=array[i];
			  k++; 
			  }
		  }
		  for(int i=0;i<uniquearray.length;i++)
		  {
			  System.out.print(uniquearray[i]+" ");
		  }
		 
		
		
}
	
}
/* output :
Unique elements copied  into another array :
50 70 60 
*/