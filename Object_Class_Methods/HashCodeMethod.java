package string_13_11_2021;

public class HashCodeMethod {

	public HashCodeMethod(String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashCodeMethod s1=new HashCodeMethod("sara");
		HashCodeMethod s2=new HashCodeMethod("Z");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.equals(s2));;
		
		  String sss1="sar"; 
		  String sss2="sar";
		// System.out.println("Same"+(sss1==sss2));   //////==m/m   t      ====   
		String ss1=new String("sara");
		String ss2=new String("sara");                      //f
		//	System.out.println("Same"+(ss1==ss2));
		System.out.println(ss1.equals(ss2));       //////
		System.out.println(sss1.equals(sss2));
		
		System.out.println(ss1.hashCode());
		System.out.println(ss2.hashCode());
		System.out.println(sss1.hashCode());
		System.out.println(sss2.hashCode());
		String sathish=new String("Indian");
		String santhiya="Indian";
		System.out.println("fin"+sathish.equals(santhiya));
		System.out.println("final"+(sathish==santhiya));
		System.out.println("v1"+sathish.hashCode());
		System.out.println("v2"+santhiya.hashCode());
		
	}
	public String toString() {
		return "hai"; 
		}
	 public int hashCode(Object o) {
		 return 1;
	 }
	 public  boolean equals(Object s2) {
		HashCodeMethod s1=(HashCodeMethod)(s2);
		return false; 
		}
	 
	

}
/* output :
 1950409828
1229416514
hai
hai
false
true
true
3522813
3522813
113636
113636
fintrue
finalfalse
v1-2100368841
v2-2100368841
*/
