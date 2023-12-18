package design_pattern.creational.factory.v3_abstract_factory;

import lombok.AllArgsConstructor;


// Step 1: Create an interface
@AllArgsConstructor
public abstract class Button {

	private Double border;

	public abstract void onClick();

	public abstract void render();

}
