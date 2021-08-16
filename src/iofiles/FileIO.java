package iofiles;
import java.io.*;

public class FileIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fout = new FileOutputStream("D:\\Java Programs\\helloworld\\bin\\iofiles\\File1.txt");
			fout.write("\nFile1\n".getBytes());
			fout.write(65);
			String s="\nTrying FileOutputStream";
			byte b[]=s.getBytes();
			fout.write(b);
			fout.close();
			FileInputStream fin=new FileInputStream("D:\\Java Programs\\helloworld\\bin\\iofiles\\File1.txt");
			int i=fin.read();
			System.out.println((char)i);
			while((i=fin.read())!=-1)
				System.out.print((char)i);
			fin.close();
			System.out.println("\nSuccess");
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
