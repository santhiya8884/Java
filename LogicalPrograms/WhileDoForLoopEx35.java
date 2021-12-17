package logicalPrograms;

import java.util.Scanner;

public class WhileDoForLoopEx35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WhileDoForLoopEx35 sara=new WhileDoForLoopEx35();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String :");
		String s=sc.nextLine();
		sara.whileLoop(s);
		sara.doWhileLoop(s);
		sara.forLoop(s);
		
		
	  }

	private void forLoop(String s) {
		// TODO Auto-generated method stub
		String str=s;
		int j=str.length()-1;
		boolean flag=true;
		for(int i=0;i<str.length()/2;i++) { 
		if(str.charAt(i)!=str.charAt(j)) { 
			flag=false;
		}	
		j--;
		}
		if(flag==true) { 
			System.out.println("palinderome");
		}
		else { 
			System.out.println("not palinderome");
		}
		System.out.println();
	}

	private void whileLoop(String s) {
		// TODO Auto-generated method stub
		String str=s;
		int j=str.length()-1;
		boolean flag=true;
		int i=0;
		while(i<str.length()/2) { 
		if(str.charAt(i)!=str.charAt(j)) { 
			flag=false;
		}	
		i++;
		j--;
		}
		if(flag==true) { 
			System.out.println("palinderome");
		}
		else { 
			System.out.println("not palinderome");
		}
		System.out.println();
	}

	private void doWhileLoop(String s) {
		// TODO Auto-generated method stub
		String str=s;
		int j=str.length()-1;
		boolean flag=true;
		int i=0;
		do { 
		if(str.charAt(i)!=str.charAt(j)) { 
			flag=false;
		}	
		i++;
		j--;
		}while(i<str.length()/2);
		if(flag==true) { 
			System.out.println("palinderome");
		}
		else { 
			System.out.println("not palinderome");
		}
		System.out.println();
	}
	

}
/* output :
 Enter the String :
madam
palinderome

palinderome

palinderome
*/
