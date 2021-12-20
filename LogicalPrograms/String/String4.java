package string;

import java.util.Scanner;

public class String4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="santhiya 12345321";
		
		
		char[] ch=new char[s.length()];
		for(int i=0;i<s.length();i++) {
			 ch[i]=s.charAt(i);
		}
		for(int i=0;i<ch.length;i++) { 
			System.out.print(ch[i]+"  ");
		}
		System.out.println();
		int count=0;
		int freq[]=new int[ch.length];
		for(int i=0;i<ch.length;i++) { 
			count=1;
			for(int j=i+1;j<ch.length;j++) { 
				if(ch[i]==ch[j]) { 
					count++;
					freq[j]=-1;
				}
			}
			if(freq[i]!=-1) { 
				freq[i]=count;
			}
		}
		for(int i=0;i<freq.length;i++) { 
			System.out.print(freq[i]+" |");
		}
		System.out.println();
		for(int i=0;i<ch.length;i++) { 
			if(freq[i]>0) { 
				System.out.println(ch[i]+" present at "+freq[i]+" times");
			}
		}
		
		
	}

}
/* output :
s  a  n  t  h  i  y  a     1  2  3  4  5  3  2  1  
1 |2 |1 |1 |1 |1 |1 |-1 |1 |2 |2 |2 |1 |1 |-1 |-1 |-1 |
s present at 1 times
a present at 2 times
n present at 1 times
t present at 1 times
h present at 1 times
i present at 1 times
y present at 1 times
  present at 1 times
1 present at 2 times
2 present at 2 times
3 present at 2 times
4 present at 1 times
5 present at 1 times


*/
