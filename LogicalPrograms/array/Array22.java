package arrayPracticePayialagam;

import java.util.Scanner;

public class Array22{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array22 sara=new Array22();
		System.out.println("Adding the element in array :");
		sara.method1();
		
	}
	private void method1() {
		// TODO Auto-generated method stub
		int array[]= {10,20,30,40,50};//0,1,2,3,4,.............
		for(int i=0;i<array.length;i++) { 
			System.out.print(array[i]+" ");
		}
		System.out.println();
		Scanner sc=new Scanner(System.in);
		System.out.println("insert the element");
		int insertElement=sc.nextInt();
		boolean flag=false;
		int copyArray[]=new int[array.length+1];
		int i;
		for(i=0;i<copyArray.length-1;i++)
		{ 
			copyArray[i]=array[i];
		}
		copyArray[i]=insertElement;
		for(i=0;i<copyArray.length;i++)
		{ 
			System.out.print(copyArray[i]+" ");
		}
}
	
}
/* output :
Remove element in array :
10 20 30 40 50 
which number to delete
30
10 20 40 50 

*/