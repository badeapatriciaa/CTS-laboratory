package ro.ase.cts.hw1.refactor.phase1;

public enum AccountType {
	STANDARD(0), BUDGET(0), PREMIUM(.0125f), SUPER_PREMIUM(.0125f);
	
	private float brokerFeeValue;
	
	private AccountType(float brokerFeeValue)
	{
		this.brokerFeeValue = brokerFeeValue;
	}
	
	public float getBrokerFeeValue()
	{
		return this.brokerFeeValue;
	}
}
