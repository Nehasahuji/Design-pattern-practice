package com.example.demo.design_pattern.creational.singleton.connection_pool;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import design_pattern.creational.singleton.thread_safe.v1_syncronized_method.ConnectionPool;





public class ConnectionPoolTest {
	
	@Test
	public void testStaticInitializer() {
		ConnectionPool connectionPool = ConnectionPool.getInstance();
		ConnectionPool connectionPool1 = ConnectionPool.getInstance();
	    assertNotNull(connectionPool, "if the actor was called not null object is created");
	}
	
	@Test
	public void testsingleInstance() {
		ConnectionPool connectionPool = ConnectionPool.getInstance();
		ConnectionPool connectionPool1 = ConnectionPool.getInstance();
		assertEquals(connectionPool, connectionPool1,"two different instance of class are created");
	}

}
