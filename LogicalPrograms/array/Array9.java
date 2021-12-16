package arrayPracticePayialagam;

public class Array9{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array9 sara=new Array9();
		System.out.println("Left shift 2 positions :");
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
			int temp1=array[0];
			int i;
			for(i=0;i<array.length-1;i++) { 
				array[i]=array[i+1];
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
		int temp1=array[0];
		int temp2=array[1];
		int j=2;
		int i;
		for(i=0;i<array.length-2;i++) { 
			array[i]=array[j];
			j++;
		}
		array[i]=temp1;
		array[i+1]=temp2;
		System.out.println();
		for(int k=0;k<array.length;k++) { 
			System.out.print(array[k]+" ");
		}
		System.out.println("\n");
	}

}
/* output :
Left shift 2 positions :
10 20 30 40 50 
30 40 50 10 20 

10 20 30 40 50 


30 40 50 10 20 



*/