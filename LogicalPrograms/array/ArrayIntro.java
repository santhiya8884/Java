package arrayPracticePayialagam;

public class ArrayIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]=new int[10];
		int array2[]=new int[0];
		int array1[]= {10,20};
		int array3[][]=new int[2][10];
		/*
		 * array2[0]=2; System.out.println(array2[0]);
		 */
		System.out.println(array.length);
		System.out.println(array2.length);
		System.out.println(array1.length);
		System.out.println(array3.length);
		int array4[]=new int[-1];
		System.out.println(array4.length);
		
	}

}
/* output :
10
0
2
2
Exception in thread "main" java.lang.NegativeArraySizeException: -1
	at arrayPracticePayialagam.ArrayIntro.main(ArrayIntro.java:16)
	*/
