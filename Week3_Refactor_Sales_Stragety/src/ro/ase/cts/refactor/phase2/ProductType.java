package ro.ase.cts.refactor.phase2;

public enum ProductType {
	NEW(0), DISCOUNTED(0.1f), LIMITED_STOCK(0.25f), LEGACY(0.35f);
	
	private float discount;
	
	// only private constructor for enumeration. 
	
	
	private ProductType(float discountValue)
	{
		this.discount = discountValue;
	}
	
	public float getDiscount()
	{
		return this.discount;
	}
}
