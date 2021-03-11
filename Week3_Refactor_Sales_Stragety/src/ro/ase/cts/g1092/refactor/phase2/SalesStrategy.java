package ro.ase.cts.g1092.refactor.phase2;

import ro.ase.cts.g1092.refactor.exceptions.InvalidValueException;

public class SalesStrategy {
//camelcase 
	 public float computeFinalPrice(int productType, float initialPrice, int yearsSinceRegistration) throws InvalidValueException
	    {
		 
		 if(initialPrice <=0 || yearsSinceRegistration <0)
		 {
			 throw new InvalidValueException();
		 } 
		 
	    	float finalPrice = 0;
	        float fidelityDiscount = (yearsSinceRegistration > 10) ? (float)15/100 : (float)yearsSinceRegistration/100;
	        if (productType == 1)
	        {
	            finalPrice = initialPrice;
	        }
	        else if (productType == 2)
	        {
	            finalPrice = (initialPrice - (0.1f * initialPrice)) - fidelityDiscount * (initialPrice - (0.1f * initialPrice));
	        }
	        else if (productType == 3)
	        {
	            finalPrice = (initialPrice - (0.25f * initialPrice)) - fidelityDiscount * (initialPrice - (0.25f * initialPrice));
	        }
	        else if (productType == 4)
	        {
	            finalPrice = (initialPrice - (0.35f * initialPrice)) - fidelityDiscount * (initialPrice - (0.35f * initialPrice));
	        }
	        return finalPrice;
	    }
}