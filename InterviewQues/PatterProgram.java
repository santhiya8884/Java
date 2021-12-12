
public class PatterProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	3 3 3
		 2 2
		  1
	*/
		int n=3;
		for(int i=0;i<3;i++) { 
			for(int k=0;k<i;k++) { 
				System.out.print(" ");
			}
			for(int j=3;j>i;j--) { 
				System.out.print(n+" ");
			}
			n--;
			System.out.println();
		}
		System.out.println("\n");
		int n1=1;
		for(int i=0;i<3;i++) { 
			for(int k=0;k<i;k++) { 
				System.out.print(" ");
			}
			for(int j=3;j>i;j--) { 
				System.out.print(n1+" ");
			}
			n1++;
			System.out.println();
		}
		System.out.println("\n");
		
	
		System.out.println("Without using 4th variable :\n");
		for(int i=1;i<=3;i++) { 
			for(int k=1;k<i;k++) { 
				System.out.print(" ");
			}
			for(int j=3;j>=i;j--) { 
				System.out.print(i+" ");
			}
			
			System.out.println();
		}
		System.out.println("\n");
		
		for(int i=1;i<=3;i++) { 
			for(int k=1;k<i;k++) { 
				System.out.print(" ");
			}
			for(int j=3;j>=i;j--) { 
				System.out.print(i+" ");
			}
			
			System.out.println();
		}
		System.out.println("\n");
	}

	
}

/* output :

3 3 3 
2 2 
 1 


1 1 1 
2 2 
 3 


Without using 4th variable :

1 1 1 
2 2 
 3 


1 1 1 
2 2 
 3 


*/