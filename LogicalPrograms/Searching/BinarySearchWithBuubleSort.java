package payialagam;

import java.util.Scanner;

public class BinarySearchWithBuubleSort{
 static Object sara;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {90,30,50,10,70,30};
		
		BinarySearchWithBuubleSort sara=new BinarySearchWithBuubleSort();
		
		sara.binary(array);
	}

	private void binary(int[] array) {
		// TODO Auto-generated method stub
		BinarySearchWithBuubleSort sara=new BinarySearchWithBuubleSort();
		sara.bubble(array);
		for(int i=0;i<array.length;i++) { 
			System.out.print(array[i]+" ");
		}
		System.out.println();
		int start=0,end=array.length-1;
		int mid;
		//System.out.println("Linear Search");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the key element : ");
		int key=sc.nextInt();
		boolean flag=false;
		while(start<=end) {
			mid=(start+end)/2;
			if(key==array[mid]) {
				//int loc=mid;
				System.out.println("loc "+(mid));
				break;
			}
			else if(key<array[mid]) {
				end=mid-1;
			}
			else if(key>array[mid]) {
				start=mid+1;
			}

		}
		if(start>end) {
			System.out.println("The element not present in the array");
		
	}}

	private void bubble(int array[]) {
		// TODO Auto-generated method stub
		System.out.println("Bubbe Sort - Ascending order");
		//System.out.println("Sort using find Second MAx");
		for(int i=0;i<array.length;i++) { 
			System.out.print(array[i]+" ");
		}
		System.out.println();
		int temp;
		int j=1;
		while(j<array.length-1) {
			int i=0;
		for(;i<array.length-j;i++) { 
			if(array[i]>array[i+1]) { 
				temp=array[i];
				array[i]=array[i+1];
				array[i+1]=temp;
			}
		}
		j++;
		}
		//System.out.println("After Sorting");
		for(int i=0;i<array.length;i++) { 
			System.out.print(array[i]+" ");
		}
	}

}
/* output
Bubbe Sort - Ascending order
90 30 50 10 70 30 
10 30 30 50 70 90 10 30 30 50 70 90 
enter the key element : 
90
loc 5
*/