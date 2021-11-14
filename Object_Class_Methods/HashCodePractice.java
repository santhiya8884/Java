package coll_14_11_2021;

import javax.print.attribute.HashAttributeSet;

public class HashCodePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashCodePractice s1=new HashCodePractice();
		HashCodePractice s2=new HashCodePractice();
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1.equals(s2));
		/*
		 * if(s1==s2) { System.out.println("same"); } else {
		 * System.out.println("not same"); }
		 */
	}
	public boolean equals(Object o) { 
		int hc1=this.hashCode();
		HashCodePractice s2=(HashCodePractice)o;
		int hc2=s2.hashCode();
		if(hc1==hc2) { 
			return true;
		}
		
		else { 
			return false;
		}
	}
	
	/* public int hashCode() { return 1; } */
	 

}
/* output :
 1878246837
929338653
false
*/
