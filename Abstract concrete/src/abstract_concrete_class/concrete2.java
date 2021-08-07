package abstract_concrete_class;

public class concrete2 extends concrete
{
	 public void m2()
	 {
		 System.out.println("Latest m2");
	 }
	public void m3() 
	{
		System.out.println("method m3 in abstract class is running");
		
	}
	
	public void m5(int a)
	{
	   System.out.println(a);
	}
	
	public void m2(int x)
	{
		System.out.println(x);
	}
	
	public void e(String t)
	{
		System.out.println(t);
	}
}
