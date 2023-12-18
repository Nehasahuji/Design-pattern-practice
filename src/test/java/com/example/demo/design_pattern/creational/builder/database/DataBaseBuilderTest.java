package com.example.demo.design_pattern.creational.builder.database;



import org.junit.Test;

import design_pattern.creational.builder.v5_setter_chaining.Database;





public class DataBaseBuilderTest {

	
    @Test
	public void testDatabseBuilder() {
		Database.DatabaseBuilder builder = Database.Builder();
					builder.setName("Neha")
					.setCredentail("Neha", "Neha@2497")
					.port(3306)
					.mysql()
					.compressed()
					.build();
	}

}
