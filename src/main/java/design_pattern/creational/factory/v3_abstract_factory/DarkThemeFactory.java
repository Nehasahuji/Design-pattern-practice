package design_pattern.creational.factory.v3_abstract_factory;


//Step 4: Implement factory classes
public class DarkThemeFactory implements ThemeFactory{

	@Override
	public Button createButton(Double border) {
		return  new DarkButton(border);
	}

	@Override
	public Radio createRadio() {
		return new DarkRadio();
	}

}
