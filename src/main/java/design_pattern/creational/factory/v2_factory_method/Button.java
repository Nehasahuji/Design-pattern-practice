package design_pattern.creational.factory.v2_factory_method;

import lombok.AllArgsConstructor;


// Step 1: Create an interface
@AllArgsConstructor
public abstract class Button {

	private Double border;

	public void onClick() {}

	public void render() {}

}
