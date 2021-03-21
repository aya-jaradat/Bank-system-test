package testJUnit;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import org.junit.After;


public class checkingAccountTest {
	
	CheckingAccount c1 = new CheckingAccount();
	CheckingAccount c2 = new CheckingAccount();
	CheckingAccount c3 = new CheckingAccount();

	
	@After
	   public void after() {
	    c1=c2=c3=null;
	   }	
	
	
	
	@Test
	public void testWithdraw()
	{
		double w;
		
		c1.setOverDraftAmount(200);
		c1.setBalance(1000);
		
		c1.withdraw(1200);
		w= c1.getBalance();
		assertEquals(-200,w,0.0);		
		
		
		c2.setOverDraftAmount(200);
		c2.setBalance(1000);
		
		c2.withdraw(1201);
		w= c2.getBalance();
		assertEquals(1000,w,0.0);		
		
	
	}
	
	@Test
	public void testDeposit()
	{
		double d;
		
		c1.setOverDraftAmount(200);
		c1.setBalance(100);
		
		c1.deposit(200);
		d= c1.getBalance();
		assertEquals(300,d,0.0);
		
		
		c2.setOverDraftAmount(200);
		c2.setBalance(-100);
		
		c2.deposit(100);
		d= c2.getBalance();
		assertEquals(0,d,0.0);	
		
		
	}
	

}
