package ro.ase.cts.dp.strategy;

public class Player {
	
	String userName;
	int playTime;
	int experiencePoints;
	
	BonusStrategyInterface bonusCampaign = null;//instead of null
	//we can choose a default strategy

	public void setBonusCampaign(BonusStrategyInterface bonusCampaign) {
		this.bonusCampaign = bonusCampaign;
	}

	public Player(String userName, int playTime, int experiencePoints){
		super();
		this.userName = userName;
		this.playTime = playTime;
		this.experiencePoints = experiencePoints;
	}
	
	public void getExperiencePoints(int pointsReceived)
	{
		if(this.bonusCampaign!=null){
			this.bonusCampaign.getBonusPoints(pointsReceived, this);
// pasez this pt ca vreau sa modific atribute din obiect, based on the strategy. -> 
// -> sa pot ajunge la atributele obiectului, ii pasez referinta inca din interfata
		}
	}

}
