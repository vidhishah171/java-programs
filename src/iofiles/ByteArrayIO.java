package iofiles;
import java.io.*;

public class ByteArrayIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fout1=new FileOutputStream("D:\\Java Programs\\helloworld\\bin\\iofiles\\File4.txt");
			FileOutputStream fout2=new FileOutputStream("D:\\Java Programs\\helloworld\\bin\\iofiles\\File5.txt");
			ByteArrayOutputStream bout=new ByteArrayOutputStream();
			System.out.println("size before:"+bout.size());
			bout.write("\nFile 4 and 5\nTrying ByteArrayOutputStream\n".getBytes());
			bout.writeTo(fout1);
			bout.writeTo(fout2);
			System.out.println("size after:"+bout.size());
			bout.flush();
			bout.close(); //has no effect 
			fout1.close();
			fout2.close();
			System.out.println();
			byte[] b= {65,66,67,68};
			ByteArrayInputStream byt=new ByteArrayInputStream(b);
			ByteArrayInputStream byt1=new ByteArrayInputStream("Hello there".getBytes());			
			int k;
			while((k=byt.read())!=-1) {
				System.out.println(k+"="+(char)k);
			}
			System.out.println();
			while((k=byt1.read())!=-1) {
				System.out.print((char)k);
			}
			byt.close();
			byt1.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
