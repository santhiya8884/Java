package arrayPracticePayialagam;

public class Array10{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array10 sara=new Array10();
		System.out.println("Right shift 2 positions :");
		sara.method1();
		sara.method2();
		
	}
	private void method2() {
		// TODO Auto-generated method stub
		int array[]= {10,20,30,40,50};
		
		for(int i=0;i<array.length;i++) { 
			System.out.print(array[i]+" ");
		}
		System.out.println("\n");
		for(int j=0;j<2;j++) { 
			int temp1=array[array.length-1];
			int i;
			for(i=array.length-1;i>0;i--) { 
				array[i]=array[i-1];
			}
			array[i]=temp1;
		}
		System.out.println();
		for(int k=0;k<array.length;k++) { 
			System.out.print(array[k]+" ");
		}

		System.out.println();
	}
	private void method1() { 
		int array[]= {10,20,30,40,50};
		for(int i=0;i<array.length;i++) { 
			System.out.print(array[i]+" ");
		}
		int temp1=array[array.length-1];
		int temp2=array[array.length-2];
		int j=array.length-3;
		int i;
		for(i=array.length-1;i>1;i--) { 
			array[i]=array[j];
			j--;
		}
		array[i]=temp1;
		array[i-1]=temp2;
		System.out.println();
		for(int k=0;k<array.length;k++) { 
			System.out.print(array[k]+" ");
		}
		System.out.println("\n");
	}

}
/* output :
Right shift 2 positions :
10 20 30 40 50 
40 50 10 20 30 

10 20 30 40 50 


40 50 10 20 30 



*/