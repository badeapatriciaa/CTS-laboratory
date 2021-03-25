package ro.ase.csie.cts.dp.singleton.registry;

public class TestSingletonRegistry {

	public static void main(String[] args) {

		RESTBackend backend1 = RESTBackend.getRESTBackend("10.0.0.1", "profile");
		RESTBackend backend2 = RESTBackend.getRESTBackend("10.0.0.1", "profile");

		if(backend1==backend2)
		{
			System.out.println("same reference - they point to the same object");
		}
		else
		{
			System.out.println("They are different");
		}
		
		RESTBackend backend3 = RESTBackend.getRESTBackend("127.0.0.1", "profile");

		if(backend3==backend2)
		{
			System.out.println("same reference - they point to the same object");
		}
		else
		{
			System.out.println("They are different");
		}
	}

}
