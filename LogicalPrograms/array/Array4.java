package arrayPracticePayialagam;

public class Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {10,20,30,40,50};
		int temp,j=array.length-1;
		for(int i=0;i<array.length;i++) { 
			System.out.print(array[i]+" ");
		}System.out.println();
		for(int i=0;i<=j;i++) { 
			temp=array[i];
			array[i]=array[j];
			array[j]=temp;
			i++;
			j--;
		}
		for(int i=0;i<array.length;i++) { 
			System.out.print(array[i]+" ");
		}
	}

}
/* output :
10 20 30 40 50 
50 20 40 30 10 
*/