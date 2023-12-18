package design_pattern.creational.factory.v3_abstract_factory;

import lombok.AllArgsConstructor;

//Step 1: Create product interfaces 
@AllArgsConstructor
public abstract class Radio {
	
	public abstract void onSelect();
	
	public abstract void render();

}
