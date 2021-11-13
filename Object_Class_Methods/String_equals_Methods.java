package string_13_11_2021;

public class String_equals_Methods {
String name;
	public String_equals_Methods(String string) {
		// TODO Auto-generated constructor stub
	}

	public String_equals_Methods() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String_equals_Methods sara=new String_equals_Methods();
		sara.equalMethodPractice();
	}

	public void equalMethodPractice() {
		// TODO Auto-generated method stub
		String_equals_Methods s1=new String_equals_Methods("santhiya");
		System.out.println(s1.hashCode());
		System.out.println(s1);
		String_equals_Methods s2=new String_equals_Methods("santhiya");
		System.out.println(s2.hashCode());
		
		System.out.println(s2);
		if(s1==s2) { 
			System.out.println("Two objects are same");
		}
		else { 
			System.out.println("Two objects are not same");
		}
		if(s1.equals(s2)) { 
			System.out.println("Same         yes");//check for the m/m
		}
		else { 
			System.out.println("not same");
		}
		String ss1=new String("santhiya");
		String ss2=new String("santhiya");
		System.out.println(ss1.hashCode());
		System.out.println(ss1);
		System.out.println(ss2.hashCode());
		System.out.println(ss2);
		// ==  ---for the no=6,no1=6----//value
		//equal ---check for the m/m
		//but not directly check == not applicable for the String objects
		// uses the equals method
		if(ss1==ss2) { 
			System.out.println("String two objects are same");
		}
		else { 
			System.out.println("Strings two objects are not same");
		}
		if(ss1.equals(ss2)) { 
			System.out.println("Same");//check for the m/m
		}
		else { 
			System.out.println("not same");
		}
		
		
		
	}
	public boolean equals(Object o) { 
		String_equals_Methods s=(String_equals_Methods) o;
		if(this.hashCode()==s.hashCode()) { 
			return true;
		}
		else { 
			return false;
		}
		
	}

	
	/*
	 * public boolean equals(Object o) { return true; }
	 */
	 
	
	/*
	 * public int hashCode() {
	 * 
	 * //return 555;
	 * 
	 * }
	 */
	public String  toString() { 
		return "BYe";
	}
}
/* output: 
1950409828
BYe
1229416514
BYe
Two objects are not same
not same
2007774813
santhiya
2007774813
santhiya
Strings two objects are not same
Same
*/
