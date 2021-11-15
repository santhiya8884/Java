package map_pratice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class KaniMap_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * String s="Name:Naveen,City:Chennai,Country:India"; //Map<String, String>
		 * properties = ( (Object)
		 * Splitter.on(",")).withKeyValueSeparator(":").split(s);
		 * 
		 * //Map m=new Map(); String[] s1=s.split(","); HashMap m1=new HashMap();
		 * LinkedHashMap mp=new LinkedHashMap(); int i=0; while( i<s1.length) { String
		 * v1=s1[i].toString(); System.out.println(v1); int k=0; String[]
		 * v2=v1.split(":"); String v3=v2[k]; System.out.println(v3); for(int
		 * j=0;j<v2.length;j++) { mp.put(v1, v2); //System.out.println(mp); } i++; }
		 * System.out.println(mp); Set entry=mp.entrySet(); Iterator
		 * it=entry.iterator(); boolean b=it.hasNext(); while(b==true) { Object
		 * o=it.next(); System.out.println(o); b=it.hasNext(); }
		 */
		
		//System.out.println("santhiya hgy".trim());
		
		
		String student="Name:Naveen,City:Chennai,Country:India";
		Map LinkedhashMap=new LinkedHashMap();
		
		String parts[]=student.split(",");
		//System.out.println(parts);
		/*
		 * for(String s:parts) { System.out.println(s); }
		 */
		for(String  s:parts) { 
			//System.out.println(s);
			//System.out.println(s.split(":"));
			String stuData[]=s.split(":");
			//System.out.println(stuData);
			for(int i=0;i<stuData.length;i++) { 
				String stuRollNo=stuData[0];
				String stuName=stuData[1];
				LinkedhashMap.put(stuRollNo, stuName);
			}
		}
		System.out.println(LinkedhashMap);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	/*sss*/
	/*
	 * public String toString(Object o) { o. return v1+""+v2;
	 * 
	 * }
	 */

}
/* output :
 {Name=Naveen, City=Chennai, Country=India}
 */
