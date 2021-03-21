package testJUnit;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import org.junit.After;

public class CustomerTest {
	
	Customer c1 = new Customer();
	Customer c2 = new Customer();
	Customer c3 = new Customer();
	Customer c4 = new Customer();
	
	@After
	   public void after() {
	     c1=c2=c3=c4=null;
	   }
	
	@Test
	public void testName()
	{
		String s;
	c1.setName("Aya Jaradat");
	s = c1.getName();
	assertEquals("Aya Jaradat",s);	
	
	
	c2.setName("Aya17");
	s = c2.getName();
	assertEquals(null,s);
	
	
	c3.setName("Aya@Jaradat");
	s = c3.getName();
	assertEquals(null,s);	
	
	c4.setName("aya");
	s = c4.getName();
	assertEquals("aya",s);
	
	
	}
	
	@Test
	public void tesAge()
	{
		int a;
		c1.setAge(18);
		a= c1.getAge();
		assertEquals(18,a);
		
		c2.setAge(17);
		a=c2.getAge();		
		assertEquals(0,a);
		
				
		c3.setAge(30);
		a=c3.getAge();		
		assertEquals(30,a);
	}
	
	@Test
	public void tesPhone()
	{
		String s1;
		c1.setPhone("0711239988"); //length=10
		s1 = c1.getPhone();
		assertEquals("0711239988",s1);
		
		c2.setPhone("0123"); //length=4
		 s1 = c2.getPhone();
		assertEquals(null,s1);
		
		c3.setPhone("5711239988"); //length =10 but did not start with zero
		 s1 = c3.getPhone();
		assertEquals(null,s1);
		
	}

}
