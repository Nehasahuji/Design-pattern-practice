package design_pattern.creational.factory.v2_factory_method;

import lombok.Getter;

@Getter
// Step 2: Create concrete class
public class RoundBtn extends Button {

	private Double radius;

	public RoundBtn(Double border, Double radius) {
		super(border);
		this.radius = radius;
	}

	@Override
	public void onClick() {
		System.out.println("Round butoon was clicked");
	}

	@Override
	public void render() {
		System.out.println("Rendered");
	}

}
