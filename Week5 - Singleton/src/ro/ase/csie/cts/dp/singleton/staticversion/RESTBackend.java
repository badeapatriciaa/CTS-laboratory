package ro.ase.csie.cts.dp.singleton.staticversion;

public class RESTBackend {
	
	String url;
	String data;
	
	public static final RESTBackend theBackend ; //null by default
	
	//make it private so users can't use it
		private RESTBackend()
		{
			
		}
		
	
	//executed only once
	static
	{
		System.out.println("Is executed when the class is loaded  by the JVM");
		//get the data from config files
		theBackend = new RESTBackend();
		theBackend.url = "www.acs.ase.ro/cts";
		
	}
	
	
	{
		System.out.println("Is executed before and only bc of any constructor call");

	}
	
	
	
	//make it private so users can't use it
		//private RESTBackend()
		//{
			//get the data from config files
	//	}
		

}
