package ro.ase.csie.cts.proxy;

public class LoginWith2FactorAuthentification implements LoginInterface {

	
	LoginInterface loginModule = null;
	
	
	public LoginWith2FactorAuthentification(LoginInterface loginModule) {
		super();
		this.loginModule = loginModule;
	}
	
	public boolean checkGeneratedCode(int code)
	{
		if(code == 1245)
			return true;
		return false;
	}

	@Override
	public boolean login(String username, String password) {
		if(this.loginModule.login(username, password))
		{
			System.out.println("Please input the generated code that you have received over SMS");
			System.out.println("Check received code");
			if(checkGeneratedCode(1234)) {
				System.out.println("Hello" + username);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean checkServerStatus() {
		return this.loginModule.checkServerStatus();
	}

}
