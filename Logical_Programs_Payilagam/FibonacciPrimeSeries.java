package payailagam_logical_programs;

public class FibonacciPrimeSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibonacciPrimeSeries sara=new FibonacciPrimeSeries();
		System.out.println("FibonacciSeries With inside the First 20-Prime NUmbers only print");
		sara.whileLoop();
		sara.doWhileLoop();
		sara.forLoop();
	}

	public void forLoop() {
		// TODO Auto-generated method stub
		System.out.println("Using For Loop");
		int a=-1,b=1;
		int count=1;
			for(;;) { 
				int number=a+b;
				if(number==0||number==1) { 
					b=a+b;
					a=b-a;
				}
				else { 
				//	int i=2;
					boolean prime_flag=true;
					for(int i=2;i<number;i++){//(i<number) {  //0,11,2
						if(number%i==0) { 
							prime_flag=false;
							break;
						}
						//i++;
					}
					if(prime_flag==true) { 
						System.out.println(count+" "+(number)+" ");
						if(count==20) { 
							break;
					}
						count++;
						
						
					}
					
					b=a+b;
					a=b-a;
					
				}
				
			}
	}

	public void doWhileLoop() {
		// TODO Auto-generated method stub
		System.out.println("Using Do While Loop");
		int a=-1,b=1;
	
		int count=1;
			do { 
				int number=a+b;
				if(number==0||number==1) { 
					b=a+b;
					a=b-a;
				}
				else { 
					int i=2;
					if(number==2) { 
						System.out.println(count+" "+(number)+" ");
						count++;
					}
					boolean prime_flag=true;
					do {  //0,11,2
						if(number%i==0) { 
							prime_flag=false;
							break;
						}
						i++;
					}while(i<number);
					if(prime_flag==true) { 
						System.out.println(count+" "+(number)+" ");
						if(count==20) { 
							break;
					}
						count++;
						
						
					}
					
					b=a+b;
					a=b-a;
					
				}
				
			}while(true);
			System.out.println("\n");
	}

	public void whileLoop() {
		// TODO Auto-generated method stub
		System.out.println("Using  While Loop");
		int a=-1,b=1;
		int fibcount=0;
		int count=1;
			while(true) { 
				int number=a+b;
				if(number==0||number==1) { 
					b=a+b;
					a=b-a;
				}
				else { 
					int i=2;
					boolean prime_flag=true;
					while(i<number) {  //0,11,2
						if(number%i==0) { 
							prime_flag=false;
							break;
						}
						i++;
					}
					if(prime_flag==true) { 
						System.out.println(count+" "+(number)+" ");
						if(count==20) { 
							break;
					}
						count++;
						
						
					}
					
					b=a+b;
					a=b-a;
					
				}
				
			}
			System.out.println("\n");
				
	}

}
/* output :
 FibonacciSeries With inside the First 20-Prime NUmbers only print
Using  While Loop
1 2 
2 3 
3 5 
4 13 
5 89 
6 233 
7 1597 
8 28657 
9 514229 
10 433494437 
11 -1323752223 
12 -811192543 
13 -298632863 
14 -1109825406 
15 -1408458269 
16 -1781832971 
17 -1418756969 
18 -1055680967 
19 764848393 
20 -1709589543 


Using Do While Loop
1 2 
2 3 
3 5 
4 13 
5 89 
6 233 
7 1597 
8 28657 
9 514229 
10 433494437 
11 -1323752223 
12 -811192543 
13 -298632863 
14 -1408458269 
15 -1781832971 
16 -1418756969 
17 -1055680967 
18 764848393 
19 -1709589543 
20 1640636603 


Using For Loop
1 2 
2 3 
3 5 
4 13 
5 89 
6 233 
7 1597 
8 28657 
9 514229 
10 433494437 
11 -1323752223 
12 -811192543 
13 -298632863 
14 -1109825406 
15 -1408458269 
16 -1781832971 
17 -1418756969 
18 -1055680967 
19 764848393 
20 -1709589543 


*/
