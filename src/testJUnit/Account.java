package testJUnit;

public  class Account {
	
	private long  accountNo;
	private double balance;
	
	public long  getAccountNo()
	{
		return this.accountNo;
	}
	
	public void setAccountNo(long  amount)
	{
		long num=amount;
		int c=0;
		while (num !=0)
		{	c++;
			num/=10;				
		}
		
		if (c == 14 &&((int)(amount/(Math.pow(10, 13))) == 1 || (int) (amount/(Math.pow(10, 13))) == 2
				|| (int) (amount/(Math.pow(10, 13))) == 3))	
		this.accountNo=amount;
		
		else
			System.out.println(amount +" : incorrect Acoount No !!");
	}
	public double getBalance()
	{
		return this.balance;
	}
	public void setBalance(double amount)
	{
		if (amount >=0  )
		 this.balance=amount;
		
		else if (amount < 0 && this instanceof CheckingAccount)
			this.balance=amount;
		
		else
			System.out.println(amount +" : balance must be higher or equal zero !!");
		

	}
	
	
	
	
	
	
}
