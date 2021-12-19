package searching;

public class SortSecondMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {90,30,50,10,70,30};
		//System.out.println("Bubbe Sort");
		System.out.println("Sort using find Second MAx");
		for(int i=0;i<array.length;i++) { 
			//System.out.print(array[i]+" ");
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
		}System.out.println();
		System.out.println("Second max :"+array[array.length-2]);
	}

}
/* output
Sort using find Second MAx

10 30 30 50 70 90 
Second max :70

*/