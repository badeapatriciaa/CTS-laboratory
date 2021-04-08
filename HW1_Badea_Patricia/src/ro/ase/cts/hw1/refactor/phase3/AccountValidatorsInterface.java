package ro.ase.cts.hw1.refactor.phase3;

public interface AccountValidatorsInterface {

public abstract void validateLoan(double loanValue) throws InvalidLoanException;
	
	public abstract void validateAllAccounts(AccountPlanning[] allAccounts)
			throws InvalidAccountsException;
}
