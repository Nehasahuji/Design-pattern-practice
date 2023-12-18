package design_pattern.creational.singleton.thread_safe.v2_syncronized_block;

public class ConnectionPool {
	
	//Step 3- Create local instance
	private static ConnectionPool INSTANCE = null;
	
	// Step 1 - constructor Hiding 
	private ConnectionPool() {
		
	}
	
	//Step 2- Get aceess point 
	public synchronized static ConnectionPool getInstance() {
		//Step 4 = If instance is not null simply return 
		//Else - Create store and return 
		if(INSTANCE==null) {
			ConnectionPool connectionPool = new ConnectionPool(); 
			INSTANCE = connectionPool;
		}
		return INSTANCE;
	}
	
	
	/* use synchronized keyword to make it thread safe but  it is slow 
		1. we are blocking thread even we already have object created
	
	*/
}
