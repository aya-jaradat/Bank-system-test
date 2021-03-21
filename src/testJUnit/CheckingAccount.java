package testJUnit;

public class CheckingAccount extends Account {
	
	private double overDraftAmount ;
	
	
	public void withdraw(double amount)
	{
		double b=this.getBalance() - amount;
		if (b >= (this.overDraftAmount * -1))
			this.setBalance(b);
	}
	
	public void deposit(double amount)
	{
		double b= this.getBalance() + amount;
		this.setBalance(b);
	}
	
	public void setOverDraftAmount(double amount)
	{			
		this.overDraftAmount=amount;		
	}
	
	public double getOverDraftAmount()
	{
		return this.overDraftAmount;
	}

}
