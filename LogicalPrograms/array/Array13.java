package arrayPracticePayialagam;

public class Array13{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {10,-20,30,-40,90,-4};
		
		int count=0;
		for(int i=0;i<array.length;i++) { 
			if(array[i]<0) { 
				count++;
			}
		}
		int array1[]=new int[count];
		int j=0;
		for(int i=0;i<array.length;i++) { 
			if(array[i]<0) { 
				array1[j]=array[i];
				j++;
			}
			
		}
		for(int i=0;i<array1.length;i++) { 
			System.out.print(array1[i]+" ");
		}
	}

}
/* output :
-20 -40 -4 
*/