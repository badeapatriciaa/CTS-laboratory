package ro.ase.cts.dp.state;

public class Superhero{
	
	public static final int CRITICAL_VALUE = 50;
	public static final int WOUNDED_VALUE = 200;

	String name;
	int lifePoints;
	MoveStateInterface moveState = null;
	
	
	public Superhero(String name, int lifePoints) {
		super();
		this.name = name;
		this.lifePoints = lifePoints;
		this.moveState = new NormalState(); //initial state!
	}

	public void move(){
		if(this.moveState!=null){
			this.moveState.moveAtDifferentLocation();
		}
		else{
			throw new UnsupportedOperationException();
		}
	}
	
	public void takeAHit(int points) //update its own state
	{	this.lifePoints = this.lifePoints - points;
		if(this.lifePoints<=CRITICAL_VALUE)
		{
			this.moveState = new CriticalWoundedState();
		}
		else
			if(this.lifePoints<=WOUNDED_VALUE)
			{
				this.moveState = new WoundedState();
			}
		
	}
	
	public void heal(int points)
	{
		this.lifePoints += points;
		if(this.lifePoints>=WOUNDED_VALUE)
		{
			this.moveState = new NormalState();
		}
		else
			if(this.lifePoints>CRITICAL_VALUE)
			{
				this.moveState = new WoundedState();
			}
	}

}
