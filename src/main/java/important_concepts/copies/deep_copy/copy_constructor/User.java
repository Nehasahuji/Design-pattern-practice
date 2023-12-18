package important_concepts.copies.deep_copy.copy_constructor;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class User {

	private String firstName;
	private String lastName;
	private Address address;

	//Copy constructor forn user
	public User(User that) {
		this(that.firstName, that.lastName, new Address(that.address));
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + "]";
	}

}
