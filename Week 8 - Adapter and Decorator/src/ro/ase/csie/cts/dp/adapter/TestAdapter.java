package ro.ase.csie.cts.dp.adapter;

import java.util.ArrayList;

import ro.ase.csie.cts.dp.adapter.disney.DisneyActions;
import ro.ase.csie.cts.dp.adapter.disney.DonaldDuck;

public class TestAdapter {

	public static void main(String[] args)
	{
		//stimulate the game by using the existing characters framework
		//usually try to use the base class to create objects (abstract)
		
		SuperHeroCharacter fantasyHero = new FantasySuperHero("Blue dragon", 1000, true);
		fantasyHero.move();
		fantasyHero.takeAHit(500);
		fantasyHero.heal(200);
		
		//use a Disney character as a SuperHeroCharacter one ( choose which framework integrates which one)
		
		DisneyActions donald = new DonaldDuck(500);
		donald.changeLocation(100, 500);
		donald.isWounded(100);
		donald.isHealing(90);
		
		ArrayList<SuperHeroCharacter> gameHeroes = new ArrayList<>();
		gameHeroes.add(fantasyHero);
		//gameHeroes.add(donald); --> can't directly do that
		//we could go for object reference (in the array type) but downcast every time we go through that collection to check the type of objects
		
		//or we can do the object adapters
		Disney2SuperHeroAdapter donaldAdapter = new Disney2SuperHeroAdapter(donald);
		gameHeroes.add(donaldAdapter);
		System.out.println("--------------------------");
		for(SuperHeroCharacter hero : gameHeroes)
		{
			hero.crouch();
			hero.takeAHit(50);
			hero.heal(50);
		}
	}
}
