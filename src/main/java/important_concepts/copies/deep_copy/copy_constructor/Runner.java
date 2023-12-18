package important_concepts.copies.deep_copy.copy_constructor;

public class Runner {

	public static void main(String[] args) {
		Address address = new Address("Downing St 10", "London", "England");
		User pm = new User("Prime", "Minister", address);

		System.out.println("Befor copy" + pm);

		User deepCopy = new User(pm);

		address.setCountry("Great Britain");
		
		System.out.println(deepCopy);
		System.out.println("After copy" + pm);
		
		System.out.println("Country of address " + pm.getAddress().getCountry() + " country of deep copy " + deepCopy.getAddress().getCountry());

	}

}
