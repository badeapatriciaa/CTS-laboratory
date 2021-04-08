package ro.ase.csie.cts.g1093.factory.facade;

public class TestFacade {

	public static void main(String[] args) {
		
	//1. create a game server instance and connect
		GameServer server = new GameServer();
		server.connect();
		
		//2 create a login
		Login login = new Login("player1","1234");
		login.login();
		
		//3. create and get the profile
		UserProfile userProfile = login.getUserProfile();
		String profile = userProfile.getProfile();
			
		
		//using the facade
		String profile2 = UserAPIFacade.getUserProfile("player2", "123456");
	}

}
