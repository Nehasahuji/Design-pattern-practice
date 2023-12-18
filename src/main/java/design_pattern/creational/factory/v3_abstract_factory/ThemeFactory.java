package design_pattern.creational.factory.v3_abstract_factory;

//Step 3: Factory interfaces

public interface ThemeFactory {
	
	Button createButton(Double border);
	
	Radio createRadio();
}
