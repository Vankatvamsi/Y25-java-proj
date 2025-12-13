package com.vamsi;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class Teacher1 implements Serializable
{
	private static final long serialVersionUID = 1L;
	int tid;
	String tname;
	double tsal;
	public Teacher1(int tid, String tname, double tsal)
	{
		super();
		this.tid = tid;
		this.tname = tname;
		this.tsal = tsal;
	}
	void display()
	{
		System.out.println(this.tid+"\t"+this.tname+"\t"+this.tsal);
	}
}
public class ObjectSerializationImpl 
{
	public static void main(String[] args) 
	{
		Teacher1 t2 = new Teacher1(1596, "Balayya", 10000.89);
		//object serialization
		try
		{
			FileOutputStream fos=new FileOutputStream("minu.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(t2);
			fos.close();
			oos.close();
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("object serialization completed (object stored into file)");
		}
		//object deserialization
		System.out.println("Read an object from file:");
		try
		{
			FileInputStream fis=new FileInputStream("minu.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			Teacher1 anu1=(Teacher1)ois.readObject();
			anu1.display();
			fis.close();
			ois.close();
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("object deserialization completed (object readed into file)");
		}
	}
}