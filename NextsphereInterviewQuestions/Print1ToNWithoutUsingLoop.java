package nextsphere;

import java.util.Scanner;

public class Print1ToNWithoutUsingLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the N value");
		int n=sc.nextInt();
		System.out.println("Print 1 to N without using loop");
		System.out.println("1 to 100 without using loop" );
		
		method1(number,n);
	}

	public static  void method1(int number,int n) {
		// TODO Auto-generated method stub
		if(number<=n) {
			System.out.println(number);
			method1(number+1,n);
		} 
		
		
	}

}
/* output :
 
 Enter the N value
100
Print 1 to N without using loop
1 to 100 without using loop
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30
31
32
33
34
35
36
37
38
39
40
41
42
43
44
45
46
47
48
49
50
51
52
53
54
55
56
57
58
59
60
61
62
63
64
65
66
67
68
69
70
71
72
73
74
75
76
77
78
79
80
81
82
83
84
85
86
87
88
89
90
91
92
93
94
95
96
97
98
99
100

*/
