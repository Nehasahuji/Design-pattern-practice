package com.example.demo.design_pattern.creational.prototype.game;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import design_pattern.creational.prototype.game.BackGroundObject;
import design_pattern.creational.prototype.game.BackGroundType;

public class GroundObjectTest {
	

	@Test
	public void testClone() {
		
		//Step 3- Create a prototype clone it and use it
		BackGroundObject  prototype = new BackGroundObject(0.0,0.0,10.0,10.10,BackGroundType.TREE);
		BackGroundObject clone = prototype.cloneObject();
		assertEquals(clone,prototype,"Same values will we retrurn");
		
		System.out.println("Tests are running");
	
	
		//Modify it 
		clone.setX(10.0);
		clone.setY(10.0);
	}
	
	
	

	
}
