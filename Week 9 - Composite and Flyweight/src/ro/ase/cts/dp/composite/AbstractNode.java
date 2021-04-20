package ro.ase.cts.dp.composite;

public abstract class AbstractNode implements NPCActions {

	 public abstract void addNode(AbstractNode node); //asa sau ca mai jos 
	
//	public void addNode(AbstractNode node)
//	{
//		throw new UnsupportedOperationException(); -- sau asa
//	}
	
	public abstract void removeNode(AbstractNode node);
	
	
	public abstract AbstractNode getNode(int index);
	
}
