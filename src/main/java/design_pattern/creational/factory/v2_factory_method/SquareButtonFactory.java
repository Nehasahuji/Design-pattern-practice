package design_pattern.creational.factory.v2_factory_method;


//Step 4: Concrete factory classes
public class SquareButtonFactory implements ButtonFactory {

	@Override
	public Button createButton(Double radius,Double border,Double length) {
		return new SquareBtn(border, length);
	}

}
