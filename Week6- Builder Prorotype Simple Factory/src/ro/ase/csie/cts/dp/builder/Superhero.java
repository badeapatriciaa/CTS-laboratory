package ro.ase.csie.cts.dp.builder;

public class Superhero {
	String name;
	int lifePoints;
	boolean isVillain;
	boolean isCriticalWounded;
	
	Weapon leftHandWeapon;
	Weapon rightHandWeapon;
	
	String superPower;
	String superSuperPower;
	
	private Superhero()
	{
		
	}

	public Superhero(String name, int lifePoints, boolean isVillain, boolean isCriticalWounded, Weapon leftHandWeapon,
			Weapon rightHandWeapon, String superPower, String superSuperPower) {
		this.name = name;
		this.lifePoints = lifePoints;
		this.isVillain = isVillain;
		this.isCriticalWounded = isCriticalWounded;
		this.leftHandWeapon = leftHandWeapon;
		this.rightHandWeapon = rightHandWeapon;
		this.superPower = superPower;
		this.superSuperPower = superSuperPower;
	}
	
	public static class SuperheroBuilder //static?
	{
		Superhero superhero = null;
		
		//define a constructor with the most important attributes
		public SuperheroBuilder(String name, int lifePoints)
		{
			this.superhero = new Superhero();
			this.superhero.name= name;
			this.superhero.lifePoints = lifePoints;
			
			//the other way :
			//this.superhero = new Superhero(name, lifePoints, false, false, null, null,"","");
			
		}
		
		//boolean - by default false, you dont need to ask for true or false
		public SuperheroBuilder isVillain()
		{
			this.superhero.isVillain = true;
			return this; //return the reference to the builder so they can't change the values
		}
		
		public SuperheroBuilder isWounded()
		{
			this.superhero.isCriticalWounded = true;
			return this;
		}
		
		public SuperheroBuilder setLeftWeapon(Weapon weapon)
		{
			this.superhero.leftHandWeapon = weapon;
			return this;
		}
		
		public SuperheroBuilder setRightWeapon(Weapon weapon)
		{
			this.superhero.rightHandWeapon = weapon;
			return this;
		}
		
		public SuperheroBuilder setSuperPower(String superPower)
		{
			this.superhero.superPower = superPower;
			return this;
		}
		
		public SuperheroBuilder setSuperSuperPower(String superSuperPower)
		{
			this.superhero.superSuperPower = superSuperPower;
			return this;
		}
		
		public Superhero build()
		{
			return this.superhero;
		}
		
	}
	
	
	
}
