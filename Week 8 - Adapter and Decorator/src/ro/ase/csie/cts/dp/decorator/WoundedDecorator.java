package ro.ase.csie.cts.dp.decorator;

public class WoundedDecorator extends AbstractDecorator{

	public WoundedDecorator(SuperHeroCharacter decoratedObject) {
		super(decoratedObject);
	}

	@Override
	public void move() {
	System.out.println("Barely moving because it is wounded");	
	//super.move(); -> comentat pt change the behavior of the action
	}

}
