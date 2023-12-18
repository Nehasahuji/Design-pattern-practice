package important_concepts.copies.shallow_copy.car;

public class Person implements Cloneable {

	private Car car;
	private String personName;

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public String getName() {
		return personName;
	}

	public void setName(String personName) {
		this.personName = personName;
	}

	public Person(String carName, String personName) {
		super();
		this.car = new Car(carName);
		this.personName = personName;
	}

	@Override
	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}

	}

	@Override
	public String toString() {
		return "Person [car=" + car + ", personName=" + personName + "]";
	}

}
