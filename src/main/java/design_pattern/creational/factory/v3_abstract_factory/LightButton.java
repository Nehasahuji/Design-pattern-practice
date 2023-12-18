package design_pattern.creational.factory.v3_abstract_factory;


//Step 2: Create concrete product classes
public class LightButton extends Button {

	public LightButton(Double border) {
		super(border);
	}

	@Override
	public void onClick() {
		System.out.println("LightButton on click method called");
		
	}

	@Override
	public void render() {
		System.out.println("dark button render method called");
		
	}

}
