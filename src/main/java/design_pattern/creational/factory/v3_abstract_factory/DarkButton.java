package design_pattern.creational.factory.v3_abstract_factory;


//Step 2: Create concrete product classes
public class DarkButton extends Button{

	public DarkButton(Double border) {
		super(border);
		
	}

	@Override
	public void onClick() {
		System.out.println("DarkButton on click method called");
		
	}

	@Override
	public void render() {
		System.out.println("DarkButton render method called");
		
	}
}
