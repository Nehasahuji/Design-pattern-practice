package design_pattern.creational.builder.v1_telescoping;

import design_pattern.creational.builder.DataBaseType;

public class Database {
	
	private String name;

	private String password;
	
	private String userName;
	
	private DataBaseType type;
	
	private Boolean isCompressed;

	//Telescoping of constructor || constructor chaining
	public Database(String name, String password, String userName, DataBaseType type, Boolean isCompressed) {
		super();
		this.name = name;
		this.password = password;
		this.userName = userName;
		this.type = type;
		this.isCompressed = isCompressed;
		//throw IllegalArgumentException("Error is given in constructor"); //not able to add validations
	}

	
	public Database(String name, String password, String userName, DataBaseType type) {
		this(name ,password,userName,type,null);
	}
	
	public Database(String name, String password, String userName) {
	    this(name ,password,userName,null);
	}
	
	public Database(String name, String password) {
	    this(name ,password,null);
	}
	
	
	public Database(String name) {
	    this(name ,null);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public DataBaseType getType() {
		return type;
	}

	public void setType(DataBaseType type) {
		this.type = type;
	}

	public Boolean getIsCompressed() {
		return isCompressed;
	}

	public void setIsCompressed(Boolean isCompressed) {
		this.isCompressed = isCompressed;
	}
}


/*Problems with this code
 * It is difficult to create constructor for different type of object creation 
 * Telescoping of constructor => Creating different constructor for creating object is called constructor telescoping
 * Mutable object
 * Not able to add validation while object creation 
 */







