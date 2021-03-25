package ro.ase.csie.cts.dp.singleton.staticversion;

public class TestSingleton {

	public static void main(String[] args) {

		RESTBackend backend = RESTBackend.theBackend;
		
		//DONT FORGET THE DEFAULT CTR THAT IS PUBLIC !
		//remove this : 
		//RESTBackend backend2 = new RESTBackend();
	}

}
