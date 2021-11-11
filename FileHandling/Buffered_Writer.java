package file_pratice;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Buffered_Writer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("/home/sara/Documents/File/FirstDirectory/two.txt");
		file.createNewFile();
		FileWriter writer=new FileWriter(file,true);
		BufferedWriter bufwriter=new BufferedWriter(writer);
		bufwriter.write("Welcome to file handling.. \n ");
		bufwriter.write("Existing content readed..");
		bufwriter.close();
	}

}
