package Exception_handling;
//user defined exception is not handled by both methods.
//only java defined exception is handled by these methods.  
public class ex3_exc3 {
	public static void main(String args[])
	{
		try
		{
		//System.out.println(90/0);
		int data[]= {12};
		System.out.println(data[2]); 
		}
		//we can declare multiple exception in catch using "|".
		catch(NullPointerException | ArithmeticException | ArrayIndexOutOfBoundsException h)
		{
			System.out.println("from catch "+h);
		}
		finally
		{
			System.out.println("always runs");
		}
	}
}
