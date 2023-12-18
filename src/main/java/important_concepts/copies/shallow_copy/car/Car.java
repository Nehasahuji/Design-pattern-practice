package important_concepts.copies.shallow_copy.car;

public class Car {
	private String carName;

	public String getName() {
		return carName;
	}

	public void setName(String carName) {
		this.carName = carName;
	}

	public Car(String carName) {
		super();
		this.carName = carName;
	}

	@Override
	public String toString() {
		return "Car [carName=" + carName + "]";
	}

}