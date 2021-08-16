package iofiles;
import java.io.*;

public class FileReaderWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter fw=new FileWriter("D:\\Java Programs\\helloworld\\bin\\iofiles\\File7.txt");
			fw.write("File 7\nTrying FileWriter\n");
			char[] c= {'V','i','d','h',105};
			fw.write(c);
			fw.flush();
			fw.close();
			FileReader fr=new FileReader("D:\\Java Programs\\helloworld\\bin\\iofiles\\File7.txt");
			int i;
			while((i=fr.read())!=-1) {
				System.out.print((char)i);
			}
			fr.close();
		} catch(Exception e) {
			System.out.println(e);
		}
	}

}
