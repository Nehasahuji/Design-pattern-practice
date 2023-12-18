package design_pattern.creational.factory.v1_simple.button;

public class ButtonFactory {

	// Step 3 - Create a static factory method
	public static Button createButton(ScreenSize screenSize, Double radius, Double length, Double border) {

		switch (screenSize) {
			case PHONE:
				System.out.println("Screen type is phone with round button");
				return new RoundBtn(border, radius);
			case DESKTOP:
				System.out.println("Screen type is desktop with square btn");
				return new SquareBtn(border, length);
			case TABLET:
				System.out.println("Screen type is TABLET with round btn");
				return new RoundBtn(border, radius);
			}
		throw new IllegalArgumentException("Invalid type " + screenSize);

	}

}


/*
 * Problems with Implementation
 * 
 */
