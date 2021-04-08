package ro.cts.homework2.refactoring;

public class Account {
	public double loanValue;
	public double rate;	
	public int daysActive;
	public int accountType;
	public static final int	STANDARD=0,BUDGET=1,PREMIUM=2,SUPER_PREMIUM=3;
	public static final int daysInOneYear = 365;
	public static final double brokerFee = .0125;
	
	
	public double getLoan() {
		return this.loanValue;
	}
	
	public double getRate() {
		return this.rate;
	}
	
	//must have method - the lead has requested it in all classes
	public double getMonthlyRate() {
		return this.loanValue*rate;
	}
	
	public void setLoan(double loanValue) throws Exception {
		if(loanValue<0)
		{
			throw new InvalidValueLoanException();
		}
			this.loanValue = loanValue;
	}
	
	public String to_string() {
		return "Loan: " + this.loanValue+ "; rate: " + this.rate+ "; days active:" + daysActive+"; Type: " + accountType + ";";
	}
	
	public void print() {
		int vb = 10;
		System.out.println(" This is an account");
	}

	
	public static double calculateTotalFee(Account[] accounts) {
	double totalFee=0.0;
	Account account;
	if(accounts == null)
		throw new NullPointerException();
	for	(int i=0;i<accounts.length;i++)	{
		account=accounts[i];
		if(account.accountType== Account.PREMIUM||account.accountType==Account.SUPER_PREMIUM) {
		totalFee+=brokerFee*	(	//	1.25%	broker's	fee
				account.loanValue*Math.pow(account.rate,(account.daysActive/daysInOneYear)) - account.loanValue);	//	interest-principal
	}
	}
	return	totalFee;
	}
	
	
	public Account(double loanValue, double rate, int accountType) throws InvalidValueLoanException  {
		if(loanValue<0)
		{
			throw new InvalidValueLoanException();
		}		
		this.loanValue = loanValue;
		this.rate = rate;
		this.accountType = accountType;
	}
	
	
}