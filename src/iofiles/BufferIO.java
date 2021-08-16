package iofiles;
import java.io.*;

public class BufferIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedOutputStream bout=new BufferedOutputStream(new FileOutputStream("D:\\Java Programs\\helloworld\\bin\\iofiles\\File2.txt"));
			byte b[]="\nFile2\nTrying BufferedOutputStream".getBytes();
			bout.write(b,0,34);
			System.out.println("Writing Success");
			bout.flush();
			bout.close();
			BufferedInputStream bin=new BufferedInputStream(new FileInputStream("D:\\Java Programs\\helloworld\\bin\\iofiles\\File2.txt"));
			int i=bin.available();
			//bin.mark(20);
			//bin.reset();
			bin.skip(2);
//			i=bin.read();
//			System.out.println((char)i);
			System.out.println(i);
			while((i=bin.read())!=-1)
				System.out.print((char)i);
			bin.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
		

}
