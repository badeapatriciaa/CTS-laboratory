package ro.acs.cts.g1092.refactor.phase1;

import ro.ase.cts.g1092.refactor.phase2.ProductType;

public class SalesStrategy {

	 public static final int FIDELITY_YEARS_THRESHOLD = 10;
	 public static final float MAX_FIDELITY_DISCOUNT = 0.15f;
	 
	 
	 public float computeFinalPrice(ProductType productType, float initialPrice, int yearsSinceRegistration)
	    {
	    	float finalResult = 0;
	    	float fidelityDiscount =
	                (yearsSinceRegistration > FIDELITY_YEARS_THRESHOLD) ?
	                        MAX_FIDELITY_DISCOUNT : (float)yearsSinceRegistration/100;
	    	
	    	switch(productType)
	    	{
	    	case NEW:
	    		{	
	    			finalResult = initialPrice;
	    			break;
	    		}
	    	case DISCOUNTED:
	    	{
	            finalResult = (initialPrice - (ProductType.DISCOUNTED.getDiscount() * initialPrice)) - fidelityDiscount * (initialPrice - (ProductType.DISCOUNTED.getDiscount()* initialPrice));
	    		break;
	    	}
	    	
	    	case LIMITED_STOCK:
	    	{
	            finalResult = (initialPrice - ( ProductType.LIMITED_STOCK.getDiscount() * initialPrice)) - fidelityDiscount * (initialPrice - (ProductType.LIMITED_STOCK.getDiscount() * initialPrice));
	            break;
	    	}
	    	
	    	case LEGACY:
	    	{
	            finalResult = (initialPrice - (ProductType.LEGACY.getDiscount() * initialPrice)) - fidelityDiscount * (initialPrice - (ProductType.LEGACY.getDiscount() * initialPrice));
	            break; // redundant break - it's the last acse
	    	}
	    	default:
	    		throw new UnsupportedOperationException("Type not managed");
	    	}
	    	
	    
	        return finalResult;
	    }
}