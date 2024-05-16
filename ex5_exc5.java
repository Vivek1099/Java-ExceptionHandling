package Exception_handling;
//we cannot use throws in overrided function
class p12
{
	void call()
	{
		System.out.println("from p12");
	}
}

class p21 extends p12
{
	void call() // throws Exception
	{
		System.out.println("from p21");
	}
}

public class ex5_exc5 {
	public static void main(String args[])
	{
		try {
			Thread.sleep(2000);// sleep is a static function because it is called by class name(Thread).
			System.out.println("after 2 seconds");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
