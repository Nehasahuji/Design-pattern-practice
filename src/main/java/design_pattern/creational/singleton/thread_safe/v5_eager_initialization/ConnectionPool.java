package design_pattern.creational.singleton.thread_safe.v5_eager_initialization;

public class ConnectionPool {

	// Step 3- Create local instance
	//Eager initialization 
	//It is thread safe because object gets created only when class is loaded
	private static ConnectionPool INSTANCE = new ConnectionPool();

	// Step 1 - constructor Hiding
	private ConnectionPool() {

	}

	// Step 2- Get access point
	public static ConnectionPool getInstance() {
		return INSTANCE;
	}
	
	/*
	 * startup call -> object gets created at the time of loading of class
	 * Problem with eager initialization 
	 * we can not have dynamic values pass to it
	 * 
	 */


	
}
