package payailagam_logical_programs;

import java.util.Scanner;

public class First20PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		First20PrimeNumbers sara=new First20PrimeNumbers();
		sara.whileLoop();
		sara.doWhileLoop();
		sara.forLoop();
	}

	public void forLoop() {
		// TODO Auto-generated method stubs
		System.out.println("Using For loop check for the given number prime OR not");
		int number=2;
		
		for(int count=1;count<=20;){ 
				
				boolean prime_flag=true;
				for(int i=2;i<number;i++){ 
					if(number%i==0) { 
						//System.out.println("GIven number "+number+" not prime ");
						prime_flag=false;
						break;
					}
					
				}
				if(prime_flag==true) { 
					//System.out.println("GIven number "+number+"  prime ");
					
					System.out.println(count+" Prime number   "+"-->"+number+" ");
					count++;
				}
				number++;
				
			}
		
	System.out.println("\n");
	}

	public void doWhileLoop() {
		// TODO Auto-generated method stub
		System.out.println("Using Do loop check for the given number prime OR not");
		int number=2;
		int count=1;
		do{ 
				int i=2;
				boolean prime_flag=true;
				while(i<number) { 
					if(number%i==0) { 
						//System.out.println("GIven number "+number+" not prime ");
						prime_flag=false;
						break;
					}
					i++;
				}
				if(prime_flag==true) { 
					//System.out.println("GIven number "+number+"  prime ");
					
					System.out.println(count+" Prime number   "+"-->"+number+" ");
					count++;
				}
				number++;
				
			}while(count<=20);
		
	System.out.println("\n");
	}

	public void whileLoop() {
		// TODO Auto-generated method stub
		
		System.out.println("Using while loop check for the given number prime OR not");
		int number=2;
		int count=1;
			while(count<=20) { 
				int i=2;
				boolean prime_flag=true;
				while(i<number) { 
					if(number%i==0) { 
						//System.out.println("GIven number "+number+" not prime ");
						prime_flag=false;
						break;
					}
					i++;
				}
				if(prime_flag==true) { 
					//System.out.println("GIven number "+number+"  prime ");
					
					System.out.println(count+" Prime number   "+"-->"+number+" ");
					count++;
				}
				number++;
				
			}
		
	System.out.println("\n");
}
	

}
/* output :
sing while loop check for the given number prime OR not
1 Prime number   -->2 
2 Prime number   -->3 
3 Prime number   -->5 
4 Prime number   -->7 
5 Prime number   -->11 
6 Prime number   -->13 
7 Prime number   -->17 
8 Prime number   -->19 
9 Prime number   -->23 
10 Prime number   -->29 
11 Prime number   -->31 
12 Prime number   -->37 
13 Prime number   -->41 
14 Prime number   -->43 
15 Prime number   -->47 
16 Prime number   -->53 
17 Prime number   -->59 
18 Prime number   -->61 
19 Prime number   -->67 
20 Prime number   -->71 


Using Do loop check for the given number prime OR not
1 Prime number   -->2 
2 Prime number   -->3 
3 Prime number   -->5 
4 Prime number   -->7 
5 Prime number   -->11 
6 Prime number   -->13 
7 Prime number   -->17 
8 Prime number   -->19 
9 Prime number   -->23 
10 Prime number   -->29 
11 Prime number   -->31 
12 Prime number   -->37 
13 Prime number   -->41 
14 Prime number   -->43 
15 Prime number   -->47 
16 Prime number   -->53 
17 Prime number   -->59 
18 Prime number   -->61 
19 Prime number   -->67 
20 Prime number   -->71 


Using For loop check for the given number prime OR not
1 Prime number   -->2 
2 Prime number   -->3 
3 Prime number   -->5 
4 Prime number   -->7 
5 Prime number   -->11 
6 Prime number   -->13 
7 Prime number   -->17 
8 Prime number   -->19 
9 Prime number   -->23 
10 Prime number   -->29 
11 Prime number   -->31 
12 Prime number   -->37 
13 Prime number   -->41 
14 Prime number   -->43 
15 Prime number   -->47 
16 Prime number   -->53 
17 Prime number   -->59 
18 Prime number   -->61 
19 Prime number   -->67 
20 Prime number   -->71 

*/