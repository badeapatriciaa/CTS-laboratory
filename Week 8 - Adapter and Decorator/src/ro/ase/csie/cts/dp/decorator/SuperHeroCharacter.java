package ro.ase.csie.cts.dp.decorator;

//ACME 
//base class every superhero inherits
public abstract class SuperHeroCharacter {
	String name;
	int power;
	
	public SuperHeroCharacter(String name, int power) {
		super();
		this.name = name;
		this.power = power;
	}
	//constructor with fields, altfel se apeleaza automat cel default de catre clasele copil
	
	public abstract void move();
	public abstract void crouch();
	public abstract void takeAHit(int points);
	public abstract void heal(int points);
}
