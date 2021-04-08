package ro.ase.csie.cts.g1093.factory.facade;

public class UserAPIFacade {

	public static String getUserProfile(String user, String password)
	{
		GameServer server = new GameServer();
		server.connect();
		
		//2 create a login
		Login login = new Login("player1","1234");
		login.login();
		
		//3. create and get the profile
		UserProfile userProfile = login.getUserProfile();
		String profile = userProfile.getProfile();
		
		return profile;
	}
}
