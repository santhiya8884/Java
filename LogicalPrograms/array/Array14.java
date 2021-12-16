package arrayPracticePayialagam;

public class Array14{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Odd index  and even index elements copied into another array");
		int array[]= {10,20,30,40,90,14,78};
		int oddArray[]=new int[array.length/2];
		System.out.println(oddArray.length);
		int evenArray[]=new int[(array.length/2)+1];
		System.out.println(evenArray.length);
		System.out.println();
		System.out.println("Odd index elements stored in to another array");
		int j=0;
		for(int i=1;i<array.length;i=i+2) { 
			oddArray[j]=array[i];
			j++;
		}
		for(int i=0;i<oddArray.length;i++) { 
			System.out.println(oddArray[i]);
		}
		System.out.println();
		System.out.println("Evenindex elements stored in to another array");
		int j1=0;
		for(int i=0;i<array.length;i=i+2) { 
			evenArray[j1]=array[i];
			j1++;
		}
		for(int i=0;i<evenArray.length;i++) { 
			System.out.println(evenArray[i]);
		}
	}

}
/* output :
Odd index  and even index elements copied into another array
3
4

Odd index elements stored in to another array
20
40
14

Evenindex elements stored in to another array
10
30
90
78

*/