package com.vamsi;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyContentMinuToMahesh {

	public static void main(String[] args)throws Exception {
		DataInputStream dis=new DataInputStream(System.in);
	
		//read data from file
				System.out.println("File content is:");
				try
				{

					FileInputStream fis=new FileInputStream("minu.txt");
					FileOutputStream fos=new FileOutputStream("mahesh.txt");
					byte[] buffer=new byte[1024];
					int length;
					//read bytes from the input stream and write to the output stream
					
					while((length=fis.read(buffer))>0) {
						fos.write(buffer, 0, length);
					}
					fos.close();
				}
				
				
				catch (Exception e) 
				{
					// TODO: handle exception
				}
				finally 
				{
					System.out.println(" file created with content");
					
				}
			
	
				
}
}
	
