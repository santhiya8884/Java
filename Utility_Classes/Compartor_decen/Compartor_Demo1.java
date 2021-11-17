package utility_classes;

import java.util.Comparator;

public class Compartor_Demo1 implements Comparator {

	String brand;
	
	@Override
	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		NamewiseDecending s1=(NamewiseDecending)arg0;
		NamewiseDecending s2=(NamewiseDecending)arg1;
		int result=s1.brand.compareTo(s2.brand);
		if(result>0) { 
			return -5;
		}
		else if(result<0){ 
			return 5;
		}
		else { 
			return 0;
		}
	}

}
