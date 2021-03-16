package ro.ase.cts.refactor.phase5.services;

import ro.ase.cts.refactor.phase5.marketing.MarketingStrategyInterface;

public class Marketing2021Service implements MarketingStrategyInterface {

	@Override
	public float getFidelityDiscount(int yearSinceRegistration) {
        return (yearSinceRegistration > FIDELITY_YEARS_THRESHOLD) ? MAX_FIDELITY_DISCOUNT : (float)yearSinceRegistration/100;

}
}
