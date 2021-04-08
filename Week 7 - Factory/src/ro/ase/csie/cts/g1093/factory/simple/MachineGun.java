package ro.ase.csie.cts.g1093.factory.simple;

public class MachineGun extends AbstractWeapon{

	public MachineGun(String color) {
		super(color, 500);
	}

	@Override
	public void pewPew() {
	System.out.println("-> -> -> -> -> -> ->");
	}

}
