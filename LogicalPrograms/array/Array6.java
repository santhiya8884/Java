package arrayPracticePayialagam;

public class Array6{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {10,20,30,40,50};
		for(int i=0;i<array.length;i++) { 
			System.out.print(array[i]+" ");
		}
		int temp=array[0];
		int i;
		for(i=0;i<array.length-1;i++) { 
			array[i]=array[i+1];
		}
		array[i]=temp;
		System.out.println();
		for(int k=0;k<array.length;k++) { 
			System.out.print(array[k]+" ");
		}
		System.out.println();
		
		
	}

}
/* output :
10 20 30 40 50 
20 30 40 50 10 


*/