package design_pattern.creational.factory.v2_factory_method;

import lombok.AllArgsConstructor;
import lombok.Getter;


//Step 2: Create concrete class
@Getter
public class SquareBtn extends Button {

	private Double length;

	public SquareBtn(Double border,Double length) {
		super(border);
		this.length = length;

	}
    
	@Override
	public void onClick() {
		System.out.println("square butoon was clicked");
	}

	@Override
	public void render() {
		System.out.println("Rendered");
	}

}
