package ro.ase.cts.dp.composite;

public class TestComposite {
	public static void main(String [] args)
	{
		AbstractNode group1 = new Group("Red Team");
		group1.addNode(new NPCCharacter("Soldier 1", 100));
		group1.addNode(new NPCCharacter("Soldier 2", 100));
		
		AbstractNode group2 = new Group("Blue Team");
		group1.addNode(new NPCCharacter("Soldier 3", 100));
		group1.addNode(new NPCCharacter("Demolition team", 300));
		
		AbstractNode levelGroup = new Group("Level 2");
		levelGroup.addNode(new NPCCharacter("Level Boss", 500));
		levelGroup.addNode(group1);
		levelGroup.addNode(group2);
		
		levelGroup.attack("Superman");
		levelGroup.retreat();
		levelGroup.getNode(0).move(); //will move the level boss
	}
	
}
