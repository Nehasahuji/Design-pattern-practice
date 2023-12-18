package important_concepts.copies.shallow_copy.users;

public class Runner {

	public static void main(String[] args) {
		Address address = new Address("Downing St 10", "London", "England");
		User pm = new User("Prime", "Minister", address);

		System.out.println("Befor modification" + pm);

		User deepCopy = pm;

		address.setCountry("Great Britain");
		
		System.out.println(deepCopy);
		System.out.println("After modification" + pm);
		
		System.out.println("Country of address " + pm.getAddress().getCountry() + " country of deep copy " + deepCopy.getAddress().getCountry());

	}

}
