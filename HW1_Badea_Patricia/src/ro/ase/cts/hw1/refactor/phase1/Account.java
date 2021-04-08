package ro.ase.cts.hw1.refactor.phase1;


public class Account {
	public double loanValue;
	public double rate;	
	public int daysActive;
	public int accountType;
	public static final int	STANDARD=0, BUDGET=1, PREMIUM=2, SUPER_PREMIUM=3;
	public static final double brokerFee = .0125f;
	public static int daysInOneYear = 365;
	
	public double getLoanValue() {
		return this.loanValue;
	}
	
	public double getRateValue() {
		return this.rate;
	}
	
	//must have method - the lead has requested it in all classes
	public double getMonthlyRate() {
		return this.loanValue*this.rate;
	}
	
	public void setLoanValue(double loanValue) throws Exception {
		if(loanValue<0)
		{
			throw new Exception();
		}
		else
		{
			this.loanValue = loanValue;
		}
	}
	
	public String toString() {
		return "Loan: " + this.loanValue + "; rate: " + this.rate + "; days active:" + daysActive + "; Type: " + accountType + ";";
	}
	
	public void printAccountTypeNotification(Account currentAccount) {
		//int vb = 10; ?????????  cred ca account type ? 
		System.out.println("This is a " + currentAccount.accountType + " account");
	}

	
	public static double getFeeWithBrokerValue(Account currentAccount, float brokerFeeValue, double previousFee )
	{
		return previousFee + brokerFeeValue *	(	//	1.25%	broker's	fee
				currentAccount.loanValue*Math.pow(currentAccount.rate,(currentAccount.daysActive/daysInOneYear)) - currentAccount.loanValue);
	}
	
	public static double calculateTotalFee(Account[] accounts, AccountType accountType)
	{
	double totalFee=0.0;
	Account	account;
	int temp = 365;
	for	(int i=0;i<accounts.length;i++)	{
	account=accounts[i];
		
	switch(account.accountType)
	{
	case STANDARD:
	{	
			totalFee = 0.0;
			break;
	}
   case BUDGET:
   {
	totalFee = 0.0;
	break;
   }

   case PREMIUM:
   {
	totalFee= getFeeWithBrokerValue(account, accountType.getBrokerFeeValue(), totalFee);
	break;
   }

   case SUPER_PREMIUM:
   {
	totalFee= getFeeWithBrokerValue(account, accountType.getBrokerFeeValue(), totalFee);
	break;
   }
default:
{
	throw new UnsupportedOperationException("Type not managed");
	}
	
	
	}
	}
	return	totalFee;
	

	}
	
	public Account(double loanValue, double rate, int accountType) throws Exception {
		if(loanValue<0)
		{
			throw new Exception();
		}
		else
		{
			this.loanValue = loanValue;
		}
		this.rate = rate;
		this.accountType = accountType;
	}
	
	
}