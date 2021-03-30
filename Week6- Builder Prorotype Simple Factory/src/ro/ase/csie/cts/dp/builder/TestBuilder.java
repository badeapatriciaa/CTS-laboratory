package ro.ase.csie.cts.dp.builder;

import ro.ase.csie.cts.dp.builder.Superhero.SuperheroBuilder;

public class TestBuilder {

	public static void main(String[] args) {

		//option 1:use default ctr -problems bc you might forget to initialize it
		//1. create
		//Superhero superHero = new Superhero();
		//2. init
		//TO DO: don't forget to initialize the object(superhero) with values
		//remove the default constructor entirely - make it private
		
		//option 2: use that giant constructor (very difficult to follow, so many attributes)
		
		Weapon pistol = new Weapon("Pistol");
		
		Superhero superHero = new Superhero("Superman", 100, false, false,pistol,null,
				"fly", "");
		Superhero superHero2 = new Superhero("Batman", 100, false, false,null,null,
				"", "");
		
		
		//builder version
		Superhero superMan = new Superhero.SuperheroBuilder("Superman",100)
				.setSuperPower("He can fly")
				.setLeftWeapon(pistol)
				.setSuperSuperPower("Laser eyes")
				.build(); //once you created it, you can't change the values again
		
		
		Superhero joker = new Superhero.SuperheroBuilder("Joker", 200)
				.isVillain()
				.setRightWeapon(pistol)
				.build();
		
		Superhero dummyHero = new Superhero.SuperheroBuilder("Dummy",50).build();
		
		
	}

}
