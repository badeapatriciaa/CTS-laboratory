package ro.ase.csie.cts.g1093.factory.method;

import ro.ase.csie.cts.g1093.factory.simple.AbstractWeapon;
import ro.ase.csie.cts.g1093.factory.simple.WeaponType;

public abstract class AbstractWeaponFactory {

	public abstract AbstractWeapon getWeapon(WeaponType type, String color);
}
