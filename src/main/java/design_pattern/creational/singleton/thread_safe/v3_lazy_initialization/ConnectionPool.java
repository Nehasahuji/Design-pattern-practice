package design_pattern.creational.singleton.thread_safe.v3_lazy_initialization;

public class ConnectionPool {

	// Step 3- Create local instance
	private static ConnectionPool INSTANCE = null;

	// Step 1 - constructor Hiding
	private ConnectionPool() {

	}
    
	//called it lazy initialization because we are creating object by inside method 
	// Step 2- Get access point
	public static ConnectionPool getInstance() {
		// Step 4 = If instance is not null simply return
		// Else - Create store and return
		//Use synchronized block to make it thread safe
		synchronized (ConnectionPool.class) {
			if (INSTANCE == null) {
				ConnectionPool connectionPool = new ConnectionPool();
				INSTANCE = connectionPool;
			}
		}
		return INSTANCE;
	}

	/*
	 *problem with sync block 
	 * it is allowing single thread even if object exists 
	 */
	
}
