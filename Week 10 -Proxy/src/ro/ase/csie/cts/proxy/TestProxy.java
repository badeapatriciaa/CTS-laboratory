package ro.ase.csie.cts.proxy;

public class TestProxy {

	public static void main(String[] args) {

		
		LoginInterface loginModule = new LoginModule("10.0.0.1", "users");
		
		if(loginModule.login("admin","1234admin"))
		{
			System.out.println("hello admin");
		}
		else
		{
			System.out.println("wrong credentials");
		}
		
		
		loginModule = new LoginWith2FactorAuthentification(loginModule);
		
		String[] passwords = new String[] {"1234", "123456", "root", "1234admin"};
		for(String pass : passwords)
		{
			if(loginModule.login("admin", pass))
			{
				System.out.println("Found it. It is " + pass);
				break;
			}
		}
		
		
	}

}
