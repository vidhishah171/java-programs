package iofiles;
import java.io.*;
import java.util.*;

public class SeqIS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fin1=new FileInputStream("D:\\Java Programs\\helloworld\\bin\\iofiles\\File1.txt");
			FileInputStream fin2=new FileInputStream("D:\\Java Programs\\helloworld\\bin\\iofiles\\File2.txt");
			SequenceInputStream sin=new SequenceInputStream(fin1,fin2);
			FileOutputStream fout=new FileOutputStream("D:\\Java Programs\\helloworld\\bin\\iofiles\\File3.txt");
			int i;
			while((i=sin.read())!=-1){
				System.out.print((char)i);
				fout.write((char)i);
			}
			System.out.println("heyy");
			fout.close();
			sin.close();
//			fin2.close();
//			fin1.close();
//			FileInputStream fin4=new FileInputStream("D:\\Java Programs\\helloworld\\bin\\iofiles\\File1.txt");
//			FileInputStream fin5=new FileInputStream("D:\\Java Programs\\helloworld\\bin\\iofiles\\File2.txt");
			FileInputStream fin3=new FileInputStream("D:\\Java Programs\\helloworld\\bin\\iofiles\\File3.txt");
			Vector<FileInputStream> v=new Vector<FileInputStream>();
			System.out.println("heyy");
			v.add(fin1);
			System.out.println("hey");
			v.add(fin2);
			v.add(fin3);
			Enumeration<FileInputStream> e=v.elements();
			SequenceInputStream sin1=new SequenceInputStream(e);
			int j=0;
			System.out.println("heyyaa");
			while((j=sin1.read())!=-1){
				System.out.print((char)j);
				System.out.print("a ");
			}
			System.out.println("heyy5aa");

			sin1.close();
			fin2.close();
			fin1.close();
			fin3.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
