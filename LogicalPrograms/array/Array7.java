package arrayPracticePayialagam;

public class Array7{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {10,20,30,40,50};
		int key=50;
		int i;
		for(i=0;i<array.length;i++) { 
			if(key==array[i]) {
				break;	
			}
		}
		
		System.out.println("Element present in the location "+i);
		
		
	}

}
/* output :
Element present in the location 4
*/