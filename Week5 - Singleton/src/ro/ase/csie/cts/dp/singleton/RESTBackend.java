package ro.ase.csie.cts.dp.singleton;

public class RESTBackend {
	String url;
	String data;//what you send or receive
	
	//we can make it public if it's constant

	private static RESTBackend theBackend = null ;
	
	//make it private so users can't use it
	private RESTBackend(String url, String data) {
		System.out.println("Opening a connection to the backend service");
		this.url = url;
		this.data = data;
	}
	
	//make it private so users can't use it
	private RESTBackend()
	{
		
	}
	
	public void sendGET()
	{
		System.out.println("Send GET command to " + this.url);
		
	}
	
	// synchronized for multiple threads
	//lazt-instantiation example - the connection is opened only when needed (create the objects)
	public static synchronized RESTBackend getRESTBackend()
	{
		if(theBackend ==null)
		{	//get the backend data from a config/setttings file
			String url = "www.acs.ase.ro/game";
			String data = "get backend connection";
			theBackend = new RESTBackend(url,data);
		}
		return theBackend;
	}
	
}
