package important_concepts.copies.deep_copy.clonable_interface;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Address implements Cloneable{

	private String street;
	private String city;
	private String country;

	// overwrite clone method
	//clone method return shallow copy by default so we modify it to return deep copy
	@Override
	public Object clone() {
	    try {
	        return (Address) super.clone();
	    } catch (CloneNotSupportedException e) {
	        return new Address(this.street, this.getCity(), this.getCountry());
	    }
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", country=" + country + "]";
	}
	
	

}
