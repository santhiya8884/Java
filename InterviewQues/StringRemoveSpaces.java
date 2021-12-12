
public class StringRemoveSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringRemoveSpaces sara=new StringRemoveSpaces();
		//sara.spaces();
		sara.spaces1();
		
	}

	private void spaces1() {
		// TODO Auto-generated method stub
		String str = "       this is    a   string  containing numerous  whitespaces*   ";
		char[] ch=new char[str.length()];
		int  lastChar=0;
		for(int i=0;i<str.length();i++) { 
			if(str.charAt(i)!=' ')
				lastChar=i;
				ch[i]=str.charAt(i);
				
		}
		System.out.println(lastChar);
		for(int i=0;i<str.length();i++) { 
			
			if(ch[i]!=' ') { 
				ch[i]=str.charAt(i);
				
				System.out.print(ch[i]);
				//System.out.println(ch[i]);
				
				if((ch[i+1]==' ')&&((i+1)<lastChar) ){ 
					System.out.print(ch[i+1]);
				}
			}
		}
		
	}

	public void spaces() {
		// TODO Auto-generated method stub
		String str = "    this is    a   string  containing numerous  whitespaces   ";
		//"this is a string containing numerous whitespaces";
		String[] s=str.split("\s");
		int count=0;
		for(String i:s) { 
			count++;
			System.out.println(i);
		}
		System.out.println(count);
	}

}
/* output: 
 
 62
this is a string containing numerous whitespaces*

*/
