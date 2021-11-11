package file_pratice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_Practice {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//File file=new File("/home/sara/Documents/File/FirstDirectory/one.txt");
		//FileReader reader=new FileReader(file);
		FileReader reader=new FileReader("/home/sara/Documents/File/FirstDirectory/one.txt");
		int value=reader.read();
		//System.out.println(value);
		while(value!=-1) { 
			System.out.print((char)value);
			value=reader.read();
			
		}
		reader.close();

	}

}
//output :
/*
Heavy rain today 
pratice 
 i
100%Exsting content and new conten added... 
 Using string path..
 */
