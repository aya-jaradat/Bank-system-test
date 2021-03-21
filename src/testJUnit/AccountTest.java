package testJUnit;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.After;

public class AccountTest {
		
		Account a1=new Account();
		Account a2=new Account();
		Account a3=new Account();
			
		CheckingAccount ca=new CheckingAccount();
		SavingAccount sa =new SavingAccount();
	   
	
	@After
	   public void after() {
	     a1=a2=a3=null;
	     ca=null;
	     sa=null;
	   }
	
	
	@Test
	public void testAccountNo()
	{
		long n;
		a1.setAccountNo(12345678998764L);// length=14
		n=a1.getAccountNo();
		assertEquals(12345678998764L,n);
		
		a2.setAccountNo(-10111125968743L);// length=14 and start with -1
		n=a2.getAccountNo();
		assertEquals(0,n);
		
		a3.setAccountNo(31234567891112L);// length=14
		n=a3.getAccountNo();
		assertEquals(31234567891112L,n);
		
		ca.setAccountNo(42345678998764L);// length=14
		n=ca.getAccountNo();
		assertEquals(0,n);
		
		sa.setAccountNo(2111);// length=4
		n=sa.getAccountNo();
		assertEquals(0,n);	
		
	}
	
	
	@Test
	public void testBalance()
	{
		double b;
		a1.setBalance(0);
		b=a1.getBalance();
		assertEquals(0,b,0.0);
		
		a2.setBalance(-100);
		b=a2.getBalance();
		assertEquals(0,b,0.0);		
		
		////////////////////////////////
		
		ca.setBalance(-100);
		b=ca.getBalance();
		assertEquals(-100,b,0.0);
		
		ca.setBalance(100);
		b=ca.getBalance();
		assertEquals(100,b,0.0);
		
		////////////////////////////////////
		
		sa.setBalance(-100);
		b=sa.getBalance();
		assertEquals(0,b,0.0);
		
		sa.setBalance(0);
		b=sa.getBalance();
		assertEquals(0,b,0.0);
		
	}
	

}
