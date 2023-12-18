package com.example.demo.design_pattern.creational.factory.v3_abstract_factory;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import design_pattern.creational.factory.v3_abstract_factory.Button;
import design_pattern.creational.factory.v3_abstract_factory.DarkButton;
import design_pattern.creational.factory.v3_abstract_factory.DarkRadio;
import design_pattern.creational.factory.v3_abstract_factory.DarkThemeFactory;
import design_pattern.creational.factory.v3_abstract_factory.Radio;
import design_pattern.creational.factory.v3_abstract_factory.ThemeFactory;

public class ThemeFactoryTest {
	
	@Test
	public void testDarkTheme() {
		ThemeFactory darkThemeFactory = new DarkThemeFactory();
		 Button darkButton  = darkThemeFactory.createButton(10.0);
		 
		 assertTrue("If using dark theme button should be of dark btm",darkButton instanceof DarkButton);
		 
		 Radio darkRadio = darkThemeFactory.createRadio();
		 
		 assertTrue("If using dark theme button should be of dark Radio",darkRadio instanceof DarkRadio);
		 
	    
	}

}
