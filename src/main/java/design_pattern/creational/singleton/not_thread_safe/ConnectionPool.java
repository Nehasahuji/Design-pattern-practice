package design_pattern.creational.singleton.not_thread_safe;

public class ConnectionPool {
	
	//Step 3- Create local instance
	private static ConnectionPool INSTANCE = null;
	
	// Step 1 - constructor Hiding 
	private ConnectionPool() {
		
	}
	
	//Step 2- Get aceess point 
	public static ConnectionPool getInstance() {
		//Step 4 = If instance is not null simply return 
		//Else - Create store and return 
		if(INSTANCE==null) {
			ConnectionPool connectionPool = new ConnectionPool(); 
			INSTANCE = connectionPool;
		}
		return INSTANCE;
	}
}
