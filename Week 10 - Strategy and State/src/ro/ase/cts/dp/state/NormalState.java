package ro.ase.cts.dp.state;

public class NormalState implements MoveStateInterface {

	//if you need access to the object itself you can give it in the interface
	@Override
	public void moveAtDifferentLocation() {
		System.out.println("The hero is running");
	}

}
