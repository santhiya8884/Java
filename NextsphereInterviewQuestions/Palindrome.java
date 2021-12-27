package nextsphere;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="maths";
		int i=0;
		int j=s.length()-1;
		boolean flag=true;
		while(i<(s.length())/2) {
			if(s.charAt(i)!=s.charAt(j)) { 
				flag=false;
			}
			i++;
			j--;
		}
		if(flag==true) { 
			System.out.println("String palindrome");
		}
		else { 
			System.out.println("not palindrome");
			
		}
		
	}

}
/* output :
 
 not palindrome
*/
