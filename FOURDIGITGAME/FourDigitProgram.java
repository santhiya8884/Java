package program_18_11_2021;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class FourDigitProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//int minRange=0,maxRange=9;
		//Random r=new Random();
	
		//int secret[]= {3,2,6,7};
		//int input[]=new int[4];
		//char c[]= {'X','X','X','X'};
		//char o[]= {'C','C','C','C'};
		
		/*
		 * System.out.println(" Enter the arry elements"); for(int
		 * i=0;i<input.length;i++) { input[i]=sc.nextInt(); }
		 */
		/*
		 * for(int i=0;i<input.length;i++) { //System.out.println(input[i]); }
		 */
		int minRange=0,maxRange=9;
		Random r=new Random();
		System.out.println("Ener the input array size");
		int n=sc.nextInt();
		int secret[]= new int[n];
		for(int i=0;i<secret.length;i++) { 
			secret[i]=r.nextInt(maxRange-minRange)+minRange; // storeing random integers in array
		       //System.out.print(arr1[i]+" ");
		}
		int input[]=new int[n];
		char c[]= new char[input.length];//output
		char o[]= new char[input.length];
		for(int i=0;i<o.length;i++) { 
			o[i]='C';
		}
		for(int i=0;i<c.length;i++) { 
			c[i]='X';
		}
		
		while(true) { 
			System.out.println(" Enter the arry elements");
			
			
			for(int i=0;i<input.length;i++) { 
				input[i]=getvalue(i);
			}
			for(int i=0;i<secret.length;i++) { 
				for(int j=0;j<input.length;j++) { 
					if(secret[i]==input[j]&&i==j) {
						 
							c[j]='C';
							break;
					}
						if(secret[i]==input[j]&&i!=j) { 
							if(c[j]!='C') { 
								c[j]='P';
							}
						}
					} 
					
				}
			System.out.print("Entered Guess Sequence is :");//Prints entered sequence
			for(int i=0;i<input.length;i++) {
				
				System.out.print(input[i]+" ");
							
					}
			System.out.println();
			for(int k=0;k<c.length;k++) { 
				System.out.print(c[k]+ " " );
			}
			System.out.println();
			if(Arrays.equals(c,o)) { 
				System.out.println("-----you are win------");
				break;
			}
			
			
		}
		
		
		

	}

	private static int getvalue(int i) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		return x;
	}



	
}
/* output :
 Ener the input array size
4
 Enter the arry elements
1
2
3
4
Entered Guess Sequence is :1 2 3 4 
X P C X 
 Enter the arry elements
2
5
3
6
Entered Guess Sequence is :2 5 3 6 
C P C X 
 Enter the arry elements

2
7
3
9
Entered Guess Sequence is :2 7 3 9 
C C C X 
 Enter the arry elements
2
7
3
8
Entered Guess Sequence is :2 7 3 8 
C C C X 
 Enter the arry elements

2
7
3
4
Entered Guess Sequence is :2 7 3 4 
C C C X 
 Enter the arry elements
2
7
3
5
Entered Guess Sequence is :2 7 3 5 
C C C X 
 Enter the arry elements

2
7
3
1
Entered Guess Sequence is :2 7 3 1 
C C C X 
 Enter the arry elements
2
7
3
2
Entered Guess Sequence is :2 7 3 2 
C C C X 
 Enter the arry elements
2
7
3
3
Entered Guess Sequence is :2 7 3 3 
C C C C 
-----you are win------
*/
 
	


