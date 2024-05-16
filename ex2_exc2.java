package Exception_handling;
//two ways to handle exception 1>try catch finally 2> throws exception
public class ex2_exc2
{
	public static void main(String args[])
	{
		try
		{
		//System.out.println(90/0);
		int data[]= {12};
		System.out.println(data[2]); 
		}
		catch(Exception h)
		{
			System.out.println("from catch "+h);
		}
		finally
		{
			System.out.println("always runs");
		}
	}
}
