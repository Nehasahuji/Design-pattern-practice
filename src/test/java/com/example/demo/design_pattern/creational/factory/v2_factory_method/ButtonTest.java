package com.example.demo.design_pattern.creational.factory.v2_factory_method;

import static org.junit.Assert.assertTrue;
 
import org.junit.Test;

import design_pattern.creational.factory.v2_factory_method.RoundBtnFactory;

public class ButtonTest {

	@Test
	public void testButton() {

		design_pattern.creational.factory.v2_factory_method.ButtonFactory buttonFactory = new RoundBtnFactory();
		design_pattern.creational.factory.v2_factory_method.Button button = buttonFactory.createButton(1.0, 10.0, null);

		assertTrue("If the creen size is of desktop , the btn shoud be round",
				button instanceof design_pattern.creational.factory.v2_factory_method.RoundBtn);

	}

}

/*
 * Down-side of the method factory class explosion => need to create a lot of
 * classes
 * 
 * 
 */
