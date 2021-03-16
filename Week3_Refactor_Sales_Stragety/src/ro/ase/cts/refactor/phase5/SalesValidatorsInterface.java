package ro.ase.cts.refactor.phase5;

import ro.ase.cts.refactor.exceptions.InvalidPriceException;
import ro.ase.cts.refactor.exceptions.InvalidValueException;
import ro.ase.cts.refactor.exceptions.InvalidYearsSinceRegistrationException;

public interface SalesValidatorsInterface {
	
	public abstract void validatePrice(float initialPrice) throws InvalidPriceException;
	
	public abstract void validateYearsSinceRegistration(int accountAge)
			throws InvalidYearsSinceRegistrationException;
	
    }


