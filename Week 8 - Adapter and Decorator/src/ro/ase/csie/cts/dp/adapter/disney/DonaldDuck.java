package ro.ase.csie.cts.dp.adapter.disney;

public class DonaldDuck implements DisneyActions {

	String name;
	int lifePoints;
	
	public DonaldDuck(int lifePoints) {
		super();
		this.name = "Donald Duck";
		this.lifePoints = lifePoints;
	}

	@Override
	public void changeLocation(int x, int y) {
		System.out.println("Is moving to a new location");
		
	}

	@Override
	public void isWounded(int lostLifePoints) {
		System.out.println(this.name + " lost " + lostLifePoints + " points");	
	}

	@Override
	public void isHealing(int recoveredPoints) {
		System.out.println(this.name + " recovered " + recoveredPoints + " points");
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public int getPower() {
		return this.lifePoints;
	}

}
