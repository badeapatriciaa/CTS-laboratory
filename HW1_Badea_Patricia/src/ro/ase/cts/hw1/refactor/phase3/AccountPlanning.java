package ro.ase.cts.hw1.refactor.phase3;



public class AccountPlanning {
	public double loanValue;
	public double rate;	
	public int daysActive;
	public AccountType accountType;

	private static AccountValidatorsInterface validator;
	
	public AccountPlanning(double loanValue, double rate, AccountType accountType) throws Exception {
		validator.validateLoan(loanValue);		
		this.loanValue = loanValue;
		this.rate = rate;
		this.accountType = accountType;
	}
	
	public AccountPlanning(AccountValidatorsInterface validator)
	{
		if(validator==null) {
			throw new NullPointerException();
		}
		this.validator=validator;
	}
	
	public void setLoanValue(double loanValue) throws InvalidLoanException {
		validator.validateLoan(loanValue);	
		this.loanValue = loanValue;
	}
	
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
	
	
	public String toString() {
		return "Loan: " + this.loanValue + "; rate: " + this.rate + "; days active:" + daysActive + "; Type: " + accountType + ";";
	}
	
	public void printAccountTypeNotification() {
		System.out.println("This is a " + this.accountType + " account");
	}
	
	public static double getFeeWithBrokerValue(AccountPlanning currentAccount, float brokerFeeValue, double previousFee) {
		return previousFee + brokerFeeValue *	(
				currentAccount.loanValue*Math.pow(currentAccount.rate,(currentAccount.daysActive/365)) - currentAccount.loanValue);
	}
	
	
	public static double calculateTotalFee(AccountPlanning[] allAccounts) throws InvalidAccountsException {
	
	validator.validateAllAccounts(allAccounts);
	double totalFee=0.0;
	for	(int i=0;i<allAccounts.length;i++)	{
		totalFee = (allAccounts[i].accountType != AccountType.BUDGET ||allAccounts[i].accountType!= AccountType.STANDARD) ? getFeeWithBrokerValue(allAccounts[i],allAccounts[i].accountType.getBrokerFeeValue(), totalFee) : 0 ;
	}
	return	totalFee;
	}
		
}