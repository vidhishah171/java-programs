package iofiles;
import java.io.*;

public class DataIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fout=new FileOutputStream("D:\\Java Programs\\helloworld\\bin\\iofiles\\File6.txt");
			DataOutputStream dout=new DataOutputStream(fout);
			//dout.writeChars("File 6\n");
			dout.writeInt(65);
			//System.out.println(dout.size());
			//dout.writeChars("\n");
			dout.writeByte(97);
			dout.writeChars("Trying DataOutputStream\n");
			dout.writeChar(66);
			dout.close();
			fout.close();
			DataInputStream din=new DataInputStream(new FileInputStream("D:\\Java Programs\\helloworld\\bin\\iofiles\\File6.txt"));
//			int totalBytes=din.available();
			System.out.println(din.available());
			System.out.println(din.readInt());
			System.out.println(din.available());
			System.out.println(din.readByte());
			System.out.println(din.available());
			byte[] byt=new byte[din.available()];
			din.readFully(byt);
//			char i;
//			while((i=din.readChar())!=-1) {
//				System.out.print(i);
//			}
			for(byte bt:byt) {
				if((int)bt!=0)
					System.out.print((char)bt);
			}
			din.close();
		} catch(Exception e) {
			System.out.println(e);
		}
	}

}
