package week5.day1;

import org.testng.annotations.Test;

public class Priority {
	

	@Test(priority=2, invocationCount=3)
	public void edit()
	{
		System.out.println("editing...");
	}
	
	@Test(priority=1,enabled=false)
	public void create()
	{
		System.out.println("creating...");
	}
	
	
	@Test(priority=3)
	public void delete()
	{
		System.out.println("deleting...");
	}

}
