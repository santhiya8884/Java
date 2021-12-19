package searching;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {90,30,50,10,70,30};
		System.out.println("Bubbe Sort");
		System.out.println("BEfore Sorting");
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
		System.out.println("After Sorting");
		for(int i=0;i<array.length;i++) { 
			System.out.print(array[i]+" ");
		}
	}

}
/* output
Bubbe Sort
BEfore Sorting
90 30 50 10 70 30 
After Sorting
10 30 30 50 70 90 
*/