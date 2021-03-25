package ro.ase.csie.cts.dp.singleton;

public class TestGame {

	public static void main(String[] args) {
		
	//	RESTBackend backend = new RESTBackend("acs.ase.ro/cts", "get some data");
		RESTBackend backend = RESTBackend.getRESTBackend();

		
		UIModule uiModule = new UIModule();
		PlayerModule playerModule = new PlayerModule();
		
	}
}
