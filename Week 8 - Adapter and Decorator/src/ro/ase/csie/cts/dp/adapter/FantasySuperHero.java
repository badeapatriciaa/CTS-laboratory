package ro.ase.csie.cts.dp.adapter;

public class FantasySuperHero extends SuperHeroCharacter{
	
	public FantasySuperHero(String name, int power, boolean canFly) {
		super(name, power);
		this.canFly=canFly;
	}

	boolean canFly;
	
	@Override
	public void move() {
		if(this.canFly) {
			System.out.println("Is flying");
		}
		else
		{
			System.out.println("Is moving fast");
		}
		
	}

	@Override
	public void crouch() {
		if(this.canFly) {
			System.out.println("Not able to crouch");
		}
		else
		{
			System.out.println("Is getting close to the ground");
		}
		
	}

	@Override
	public void takeAHit(int points) {
		System.out.println
		(String.format("%s took a hit of %d points", name,points));
		this.power-=points;
		
	}

	@Override
	public void heal(int points) {
		System.out.println
		(String.format("%s is healing with %d points", name,points));
		this.power+=points;
	}

}
