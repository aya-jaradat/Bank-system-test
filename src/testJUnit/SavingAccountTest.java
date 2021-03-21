package testJUnit;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import org.junit.After;

public class SavingAccountTest {

	SavingAccount s1= new SavingAccount();
	SavingAccount s2= new SavingAccount();
	SavingAccount s3= new SavingAccount();
	SavingAccount s4= new SavingAccount();
	
	
	
	@After
	   public void after() {
	    s1=s2=s3=s4=null;	
	    
	   }
	
	
	
	@Test	
	public void testSetGetYearlyProfit()
	{
		double y;	
		
		s1.setYearlyProfit(0.02);
		
		y=s1.getYearlyProfit();
		assertEquals(0.02,y,0.0);
		
		///////////////////////////////
		s2.setYearlyProfit(0.08);
		
		y=s2.getYearlyProfit();
		assertEquals(0.08,y,0.0);
		
		/////////////////////////////
		s3.setYearlyProfit(0.01);
		
		y=s3.getYearlyProfit();
		assertEquals(0,y,0.0);
		
		
		/////////////////////////////
		s4.setYearlyProfit(0.09);
		
		y=s4.getYearlyProfit();
		assertEquals(0,y,0.0);	
        
		
	}
	
	@Test
	public void testComputeYearlyProfit()
	{
		double y;
		s1.setBalance(1000);
		s1.setYearlyProfit(0.02);
		y=s1.computeYearlyProfit();
		assertEquals(20,y,0.0);		
			
	}
	
	
	@Test
	public void testAdjustBalanceAfterProfit() 
	{
		double y;
		s1.setBalance(500);
		s1.setYearlyProfit(0.02);		
		s1.adjustBalanceAfterProfit();
		
		y=s1.getBalance();
		assertEquals(510,y,0.0);		
		
	}
	
	
	@Test
	public void testWithdraw() 
	{
		double w;
		s1.setBalance(900);
		s1.withdraw(500);
		w=s1.getBalance();
		assertEquals(400,w,0.0);
		
		s2.setBalance(900);
		s2.withdraw(1000);
		w=s2.getBalance();
		assertEquals(900,w,0.0);
		
		
	}
	@Test
	public void testDeposit() 
	{
		double w;
		s1.setBalance(900);
		s1.deposit(500);
		w=s1.getBalance();
		assertEquals(1400,w,0.0);	
		
		
		
	}

	
}
