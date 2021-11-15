package map_pratice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map2_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map = new HashMap();
		// Adding elements intoa map

		
		  map.put(1,"Santhiya"); 
		  map.put(2, "Ram"); 
		  map.put(5, "Saranya");
		  map.put(1,"saran");
		 

		System.out.println(map);
		Set s = map.keySet();
		System.out.println(s);
		Collection c = map.values();
		System.out.println(c);
		Set entryset = map.entrySet();
		System.out.println(entryset);
		System.out.println(map);
		Iterator i = entryset.iterator(); //i=0;
		// System.out.println(i);
		boolean b = i.hasNext();
		System.out.println(b);
		//one entry  can be print the key value individual
		while(b==true) { 
			Object o=i.next();
			Map.Entry entry=(Map.Entry)o;
			System.out.println(entry.getKey()+"--->"+entry.getValue());
			b=i.hasNext();
		}
	}

}
/* output :
 {1=saran, 2=Ram, 5=Saranya}
[1, 2, 5]
[saran, Ram, Saranya]
[1=saran, 2=Ram, 5=Saranya]
{1=saran, 2=Ram, 5=Saranya}
true
1--->saran
2--->Ram
5--->Saranya
*/