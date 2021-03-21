package testJUnit;

public class SavingAccount extends Account {
	
	private double yearlyProfit;
	
	
	public double computeYearlyProfit()
	{
		return  this.getBalance() * yearlyProfit;
	}
	public void adjustBalanceAfterProfit()
	{
		double b = this.getBalance() +this.computeYearlyProfit();
		this.setBalance(b);
	}
	public double getYearlyProfit()
	{		
		return this.yearlyProfit;
	}
	
	public void setYearlyProfit(double y)
	{
		if (y >=0.02 && y<=0.08)
			this.yearlyProfit = y;
		else
		
			System.out.println(y+" : yearly profit value must range from 0.02 to 0.08 !!");
	} 
	
	public void withdraw(double amount)
	{
		double b = this.getBalance() - amount;
		if (b >= 0)
		this.setBalance(b);
	}
	public void deposit(double amount)
	{
		double b = this.getBalance() + amount;
		this.setBalance(b);		
	}

}
