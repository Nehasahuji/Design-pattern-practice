package com.example.demo.design_pattern.creational.registery.game;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import design_pattern.creational.registery.game.BackGroundObject;
import design_pattern.creational.registery.game.BackGroundObjectRegistery;
import design_pattern.creational.registery.game.BackGroundType;


public class BackGroundObjectRegisteryTest {

	
	@Test
	public void testRegistery() {
		
		
		// Create a prototype
		BackGroundObject  prototype = new BackGroundObject(0.0,0.0,10.0,10.10,BackGroundType.TREE);
		
		//Create a registery
		BackGroundObjectRegistery registery = new BackGroundObjectRegistery();
		
		//add prototype in registery
		registery.addPrototype(prototype);
		
		//Fetch the prototype
		BackGroundObject backGroundObject  = registery.getPrototype(prototype.getType());
		assertNotNull("If prototype is stored in registery it must display",backGroundObject);
		
	
	}
}
