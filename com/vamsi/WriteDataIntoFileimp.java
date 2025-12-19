package com.vamsi;


import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class WriteDataIntoFileimp
{
	public static void main(String[] args)throws Exception 
	{
		DataInputStream dis=new DataInputStream(System.in);
		System.out.println("Enter Data from kb to write into file");
		char ch;
		//write data into file
		try
		{
			FileOutputStream fos=new FileOutputStream("minu.txt",true);
			BufferedOutputStream bos=new BufferedOutputStream(fos);
			
			while((ch=(char)dis.read())!='@')
	        {
			fos.write(ch);			
			}
			//fos.close();
			//bos.close();
		}
		catch (Exception e) 
		{
			// TODO: handle exception
		}
		finally 
		{
			System.out.println(" file created with content");
			
		}
		dis.close();
		//read data from file
		System.out.println("File content is:");
		try
		{
			FileInputStream fis=new FileInputStream("minu.txt");
			int ch1;
			while((ch1=fis.read())!=-1)
                {
			        System.out.print((char)ch1);
                }
			System.out.println();
			fis.close();			
		}
		catch (Exception e) 
		{
			// TODO: handle exception
		}
		finally 
		{
			
			System.out.println("File Reading Completed");
		}		

	}

}