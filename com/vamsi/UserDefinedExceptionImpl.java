package com.vamsi;

public class UserDefinedExceptionImpl extends Exception
{
	private static final long serialVersionUID = 1L;
	UserDefinedExceptionImpl()
	{
		
	}
	UserDefinedExceptionImpl(String ex)
	{
		super(ex);
	}
	public static void main(String[] args) 
	{
		String name[]= {"anu","balu","ramya","balayya"};
		int accno[]= {1234,5678,9852,1467};
		int balance[]= {100000,200000,300000,5000};
		try
		{
			for(int i=0;i<4;i++)
			{
				System.out.println(name[i]+"\t"+accno[i]+"\t"+balance[i]);
				if(balance[i]<=10000)
				{
					UserDefinedExceptionImpl obj=new UserDefinedExceptionImpl("balance amount is less than min account balance so your account number will ber suspended.");
					throw obj;
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("user defined exception implimented successfully");
		}

	}

}
