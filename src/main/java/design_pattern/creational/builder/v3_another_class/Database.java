package design_pattern.creational.builder.v3_another_class;

import design_pattern.creational.builder.DataBaseType;

public class Database {
	
	private String name;

	private String password;
	
	private String userName;
	
	private DataBaseType type;
	
	private Boolean isCompressed;

	//Solve telescoping constructor problem by passing hash-map in constructor
	public Database(DataBaseParameters paramters) {
		this.name = paramters.name;
		this.password = paramters.password;
		this.type = paramters.type;
		this.userName = paramters.userName;
		this.isCompressed = paramters.isCompressed;
		
	}
}


/*Problems with this code
  It id difficult to maintain and extend the code
  we need to create a constructor if the Database parameter
  It will violates SRP and OCP
  No parameter validation
 */


