package com.example.demo.design_pattern.stuctural.decorator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import design_pattern.stuctural.decorator.DataSource;
import design_pattern.stuctural.decorator.EncryptionDecorator;
import design_pattern.stuctural.decorator.FileDataSource;

public class DataSourceTest {
	
	@Test
	void testRead() {
		DataSource db = new FileDataSource();
		assertEquals("Base",db.read(),"value read must be base");
	}
	
	@Test
	void testEncryption() {
		//Encrypt
		DataSource db = new FileDataSource();
		DataSource encryotDb = new EncryptionDecorator(db);
	    
		assertEquals("Base -Decrypted",encryotDb.read(),"if read is called, decrypted shpuld ne returned");
	}
}
