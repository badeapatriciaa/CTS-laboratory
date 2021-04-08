package ro.ase.cts.hw1.refactor.phase3;

public class ValidatorService implements AccountValidatorsInterface {

	@Override
	public void validateLoan(double loanValue) throws InvalidLoanException {
		if (loanValue <0) {
			throw new InvalidLoanException();		
		}
	}

	@Override
	public void validateAllAccounts(AccountPlanning[] allAccounts) throws InvalidAccountsException {
		if(allAccounts==null) {
			throw new InvalidAccountsException();
		}
		
	}

}
