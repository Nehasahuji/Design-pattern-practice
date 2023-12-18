package design_pattern.creational.factory.v3_abstract_factory;

//Step 2: Create concrete product classes
public class LightRadio extends Radio{

	@Override
	public void onSelect() {
		System.out.println("Light Radio Button");
		
	}

	@Override
	public void render() {
		System.out.println("Light rende");
		
	}

}
