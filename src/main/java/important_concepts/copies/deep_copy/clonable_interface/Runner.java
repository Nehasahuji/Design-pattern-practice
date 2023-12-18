package important_concepts.copies.deep_copy.clonable_interface;

public class Runner {

	public static void main(String[] args) {
		
		Address address = new Address("Downing St 10", "London", "England");
		User pm = new User("Prime", "Minister", address);
		
		
		System.out.println("Befor copy" + pm);
		User deepCopy = (User) pm.clone();

		
		address.setCountry("Great Britain");

		System.out.println(deepCopy);
		System.out.println("After copy" + pm);
		
		System.out.println("Country of address " + pm.getAddress().getCountry() + " country of deep copy " + deepCopy.getAddress().getCountry());

	}

}
