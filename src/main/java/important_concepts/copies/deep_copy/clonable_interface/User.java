package important_concepts.copies.deep_copy.clonable_interface;

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

	//clone method return shallow copy by default so we modify it to return deep copy
	@Override
	public Object clone() {
	    User user = null;
	    try {
	        user = (User) super.clone();
	    } catch (CloneNotSupportedException e) {
	        user = new User(
	          this.getFirstName(), this.getLastName(), this.getAddress());
	    }
	    user.address = (Address) this.address.clone();
	    return user;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + "]";
	}

}
