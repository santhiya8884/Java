package arrayPracticePayialagam;

public class Array14{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Odd index elements copied into another array");
		int array[]= {10,20,30,40,90,4};
		int oddArray[]=new int[array.length/2];
		int j=0;
		for(int i=1;i<array.length;i=i+2) { 
			oddArray[j]=array[i];
			j++;
		}
		for(int i=0;i<oddArray.length;i++) { 
			System.out.println(oddArray[i]);
		}
	}

}
/* output :
20 40 4 
*/