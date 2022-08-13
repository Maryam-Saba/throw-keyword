import java.io.*;
public class Exception3
{
	void validateAge(int age) throws ArithmeticException, ioException;

{
	if(age<18)
	{
		throw ArithmeticException("Not Eligible");
	}
	else
	{
		throw new ioException("Eligible");
	}
}
	public static void main(String args[])
	{
		Exception3 obj= new Exception3();
		
try
{
obj.validateAge(20);
}	
 catch(Exception3 ex)
		{
			System.out.println(ex);
		}
}
}

