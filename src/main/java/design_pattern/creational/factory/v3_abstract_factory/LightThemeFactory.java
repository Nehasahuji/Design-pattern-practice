package design_pattern.creational.factory.v3_abstract_factory;


//Step 4: Implement factory classes
public class LightThemeFactory implements ThemeFactory {

	@Override
	public Button createButton(Double border) {
		return new LightButton(border);
	}

	@Override
	public Radio createRadio() {
		return  new LightRadio();
	}

}
