package utility_classes;

public class ThrowKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowKeyword sara=new ThrowKeyword();
		ThrowKeyword ram=null ;
		try { 
		sara.test();
	}
		//predefined catch
		catch(NullPointerException npe) { 
			System.out.println("Bye");	
		}
	}

	public void test() {
		// TODO Auto-generated method stub
		//user define explictly
		try { 
		throw new NullPointerException();
		}
		catch(NullPointerException npe){ 
			System.out.println("Hai");
			throw npe;
		} 
	
		
	}

}
/* output :
 * Hai
Bye
*/
