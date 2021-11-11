package file_pratice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputStream_Practice {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("/home/sara/Pictures/Desktop/d1.jpeg");
		InputStream input=new FileInputStream(file);
		OutputStream output=new FileOutputStream("/home/sara/Documents/File/FirstDirectory/d1.jpeg");
		int value=input.read();
		while(value!=-1) { 
			output.write(value);
			value=input.read();
		}
		output.flush();
		output.close();
	}

}
