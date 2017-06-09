import static org.junit.Assert.*;

import org.junit.Test;

public class TotalButtonTest
{
	TotalButton total = new TotalButton();
	@Test
	public void test() 
	{
		
		assertEquals(7,total.getTotal());
		
	}
	
}
