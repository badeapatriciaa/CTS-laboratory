package ro.ase.csie.cts.proxy;

public class LoginModule implements LoginInterface{

	String serverIP;
	String dbConnection;
	
	
	
	public LoginModule(String serverIP, String dbConnection) {
		super();
		this.serverIP = serverIP;
		this.dbConnection = dbConnection;
	}
	@Override
	public boolean login(String username, String password) {
		System.out.println("Connecting to the database " + this.dbConnection);
		if(username.toLowerCase().equals("admin") && password.equals("1234admin"))
		return true;
		return false;
	}
	@Override
	public boolean checkServerStatus() {
 		return true;
	}
	
}
