package logicalPrograms;

import java.util.Scanner;

public class WhileDoForLoopEx19 {

	public static void main(String[] args) {
		// 1 3 5 7 9 
		// TODO Auto-generated method stub
		WhileDoForLoopEx19 sara=new WhileDoForLoopEx19();
		System.out.println("Fibnoacci Series");
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the number :");
		int number=sc.nextInt();
		sara.whileLoop(number);
		sara.doLoop(number);
		sara.forLoop(number);
	}

	private void forLoop(int x) {
		// TODO Auto-generated method stub
		int no=x,a=-1,b=1,c,count=1;
		for(;;) {
			c=a+b;
			if(count>no) { 
				break;
			}
			System.out.println(count+" "+c+" ");
			
			count++;
			a=b;
			b=c;
			//i++;
		}
		//System.out.println();
		
	}

	private void doLoop(int x) {
		// TODO Auto-generated method stub
		int no=x,a=-1,b=1,c,count=1;
		do{
			c=a+b;
			if(count>no) { 
				break;
			}

			
			System.out.println(count+" "+c+" ");
				count++;
			a=b;
			b=c;
			//i++;
		}while(true) ;
		System.out.println();
		

	}

	private void whileLoop(int x) {
		// TODO Auto-generated method stub
		int no=x,a=-1,b=1,c,count=1;
		while(true) {
			c=a+b;
			if(count>no) { 
				break;
			}
				System.out.println(count+" "+c+" ");
			
				count++;
			a=b;
			b=c;
			//i++;
		}
		
	
		System.out.println();
	}

}
/* output :
Fibnoacci Series
 Enter the number :
50
1 0 
2 1 
3 1 
4 2 
5 3 
6 5 
7 8 
8 13 
9 21 
10 34 
11 55 
12 89 
13 144 
14 233 
15 377 
16 610 
17 987 
18 1597 
19 2584 
20 4181 
21 6765 
22 10946 
23 17711 
24 28657 
25 46368 
26 75025 
27 121393 
28 196418 
29 317811 
30 514229 
31 832040 
32 1346269 
33 2178309 
34 3524578 
35 5702887 
36 9227465 
37 14930352 
38 24157817 
39 39088169 
40 63245986 
41 102334155 
42 165580141 
43 267914296 
44 433494437 
45 701408733 
46 1134903170 
47 1836311903 
48 -1323752223 
49 512559680 
50 -811192543 

1 0 
2 1 
3 1 
4 2 
5 3 
6 5 
7 8 
8 13 
9 21 
10 34 
11 55 
12 89 
13 144 
14 233 
15 377 
16 610 
17 987 
18 1597 
19 2584 
20 4181 
21 6765 
22 10946 
23 17711 
24 28657 
25 46368 
26 75025 
27 121393 
28 196418 
29 317811 
30 514229 
31 832040 
32 1346269 
33 2178309 
34 3524578 
35 5702887 
36 9227465 
37 14930352 
38 24157817 
39 39088169 
40 63245986 
41 102334155 
42 165580141 
43 267914296 
44 433494437 
45 701408733 
46 1134903170 
47 1836311903 
48 -1323752223 
49 512559680 
50 -811192543 

1 0 
2 1 
3 1 
4 2 
5 3 
6 5 
7 8 
8 13 
9 21 
10 34 
11 55 
12 89 
13 144 
14 233 
15 377 
16 610 
17 987 
18 1597 
19 2584 
20 4181 
21 6765 
22 10946 
23 17711 
24 28657 
25 46368 
26 75025 
27 121393 
28 196418 
29 317811 
30 514229 
31 832040 
32 1346269 
33 2178309 
34 3524578 
35 5702887 
36 9227465 
37 14930352 
38 24157817 
39 39088169 
40 63245986 
41 102334155 
42 165580141 
43 267914296 
44 433494437 
45 701408733 
46 1134903170 
47 1836311903 
48 -1323752223 
49 512559680 
50 -811192543 

*/
