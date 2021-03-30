package ro.ase.csie.cts.dp.prototype;

import java.util.ArrayList;
import java.util.Random;

import com.sun.source.tree.Tree;

public class Tree3DModel implements Cloneable{

	String color;
	int height;
	ArrayList<Integer> points = null;
	
	public Tree3DModel(String color, int height) {
		
		System.out.println("Loading the 3D model...");
		
		try {
			Thread.sleep(2000);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		this.points = new ArrayList<>();
		Random random = new Random();
		
		for( int i=0;i<20;i++)
		{
			this.points.add(random.nextInt(1000));
		}
		
		System.out.println("Applying color....");
		
		this.color = color;
		this.height = height;
		
		System.out.println("Rendering final 3D model");
	}

	private Tree3DModel() { //private so no one(but me) can use it ( they will forget to initialize the attributes)
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		//Tree3DModel copy = new Tree3DModel(this.color, this.height);
		//mistake - we are going through that constructor so we regenerate the points - we lose time 
		
		Tree3DModel copy = new Tree3DModel();
		copy.color = this.color;
		copy.height=this.height;
		copy.points=(ArrayList<Integer>) this.points.clone(); //deep copy!!!! (not sure if for objects or just for primitives)
		
		return copy;
	}
	
	
	
}
