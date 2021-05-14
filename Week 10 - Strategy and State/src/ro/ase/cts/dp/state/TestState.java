package ro.ase.cts.dp.state;

public class TestState {

	public static void main(String[] args) {
		
		Superhero superMan = new Superhero("Superman",500);
		superMan.move();
		
		superMan.takeAHit(350);
		superMan.move();
		
		superMan.takeAHit(110);
		superMan.move();
		
		superMan.heal(500);
		superMan.move();
	}

}
