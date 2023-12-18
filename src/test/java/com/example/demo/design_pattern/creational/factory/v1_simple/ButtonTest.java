package com.example.demo.design_pattern.creational.factory.v1_simple;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import design_pattern.creational.factory.v1_simple.button.Button;
import design_pattern.creational.factory.v1_simple.button.ButtonFactory;
import design_pattern.creational.factory.v1_simple.button.RoundBtn;
import design_pattern.creational.factory.v1_simple.button.ScreenSize;

public class ButtonTest {

	@Test
	public void testButton() {
		Button button = ButtonFactory.createButton(ScreenSize.DESKTOP, 10.0, null, 1.0);

		assertTrue("If the screen size is of desktop, the btn shoud be round", button instanceof RoundBtn);

	}

}

/*
 * Why factory pattern 1. SRP and OCP => Done 2. Complex construction logic =>
 * Done 3. Reduce usage of subclasses => Done
 */

/*
 * Down-side of the simple factory parameter explosion -> Assignment => Builder
 * pattern SRP + OCP in library code ->
 * 
 * 
 */
