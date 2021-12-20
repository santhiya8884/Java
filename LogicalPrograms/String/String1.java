package string;

import java.util.Scanner;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="sara sara ram";
		char[] ch=new char[s.length()];
		for(int i=0;i<s.length();i++) {
			 ch[i]=s.charAt(i);
		}
		for(int i=0;i<ch.length;i++) {
			 System.out.print(ch[i]+"  ");
		}
		System.out.println();
		int[] freq=new int[ch.length];
		for(int i=0;i<freq.length;i++) { 
			System.out.print(freq[i]+"  ");
		}
		System.out.println();
		int count=0;
		int j=0;
		while(j<ch.length) {
			count=1;
			for(int i=j+1;i<ch.length;i++) {
				 if(ch[j]==ch[i]) { 
					 count++;
					
						freq[i]=-1; 
					
				 }
			}
			if(freq[j]!=-1) {
				freq[j]=count;
			}
			j++;
		}
		for(int i=0;i<freq.length;i++) { 
			System.out.print(freq[i]+" |");
		}
		System.out.println();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the char ");
		char c=sc.next().charAt(0);
		for(int i=0;i<ch.length;i++) { 
			if(ch[i]==c) { 
				if(freq[i]!=-1) {
					System.out.println(freq[i]);;
				}
			}
		}
		if(ch.length<ch.length+1) { 
			System.out.println("the char not present ");
		}
		
	}

}
/* output :
 
 s  a  r  a     s  a  r  a     r  a  m  
0  0  0  0  0  0  0  0  0  0  0  0  0  
2 |5 |3 |-1 |2 |-1 |-1 |-1 |-1 |-1 |-1 |-1 |1 |
Enter the char 
j
the char not present 

*/
