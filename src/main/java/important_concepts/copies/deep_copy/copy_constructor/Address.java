package important_concepts.copies.deep_copy.copy_constructor;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Address {

	private String street;
	private String city;
	private String country;

	
	//Copy constructor for address
	public Address(Address address) {
		this(address.street, address.city, address.country);
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", country=" + country + "]";
	}

}
