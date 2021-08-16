package iofiles;
import java.io.*;

public class FileCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File f1=new File("D:\\Java Programs\\helloworld\\bin\\iofiles\\File8.txt");
			if(f1.createNewFile()) {
				System.out.println("New file is created");
			}
			else {
				System.out.println("File already exists");
			}
			System.out.println("Path: "+f1.getAbsolutePath());
			File file1=f1.getCanonicalFile();
			System.out.println(file1);
			System.out.println(file1.exists());
			File dir=new File("D:\\Java Programs\\helloworld\\bin\\iofiles");
			String filenames[]=dir.list();
			for(String fname:filenames) {
				System.out.println(fname);
			}
		} catch(Exception e) {
			System.out.println(e);
		}
	}

}
