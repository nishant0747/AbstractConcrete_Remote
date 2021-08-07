package abstract_concrete_class;

//incomplete or abstract class
abstract public class sample1 //abstract class can implement interface
{
	
	public static void main(String[] args) //abstract class can have main method
	{
		int a =4;
		
		sample1.m1();
		
	}
	int a;
	public static void m1() 
	{
		System.out.println("method m1 is completed in abstract class");
		
	} //complete method
	
	//incomplete methods
	
	abstract protected void m2();
	
	abstract public void m2(int x);
	
    abstract public void m5(int a);
    
    public void m6() 
    {
    	int w=90;
    	System.out.println(w);
		
	}
	 

	abstract public void m3();
	
	sample1()
	{
		a = 8;
	}
	public void m4() 
	{
		
		System.out.println(a);
		
	}
	
	abstract public void e(String t);
	

	

	
	


}
