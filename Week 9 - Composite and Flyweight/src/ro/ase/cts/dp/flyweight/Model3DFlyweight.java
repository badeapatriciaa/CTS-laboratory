package ro.ase.cts.dp.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Model3DFlyweight implements Model3DFlyweightInterface {

	//dont forget the permanent state!
	//shared data
	String modelName;
	List<Integer> points = new ArrayList<>();
	
	@Override
	public void loadModel(String filename) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display(NPCCoordinates coordinates) {
		// TODO Auto-generated method stub
		
	}

	
}
