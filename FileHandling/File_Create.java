package file_pratice;

import java.io.File;
import java.io.IOException;

public class File_Create {
	//create a fileusinf java.io.File 

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("/home/sara/Documents/File/FirstDirectory/");
		boolean resultdir=file.mkdir();
		
		File file1=new File("/home/sara/Documents/File/FirstDirectory/one.txt");
		boolean result=file1.createNewFile();
		System.out.println("create a Dir "+resultdir);
		System.out.println("create a File "+result);
		
		
		
		
	}
	

}
/* output :
create a Dir true
create a File true

*/