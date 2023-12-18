package design_pattern.creational.builder.v2_hahsmaap;

import java.util.HashMap;

import design_pattern.creational.builder.DataBaseType;

public class Database {
	
	private String name;

	private String password;
	
	private String userName;
	
	private DataBaseType type;
	
	private Boolean isCompressed;

	//Solve telescoping constructor problem by passing hash-map in constructor
	public Database(HashMap<String,Object> parameterMap) {
		if(parameterMap.containsKey("name")) {
			this.name = (String) parameterMap.get("name");
		}
		if(parameterMap.containsKey("password")) {
			this.password = (String) parameterMap.get("password");
		}
		if(parameterMap.containsKey("userName")) {
			this.userName = (String) parameterMap.get("userName");
		}
		if(parameterMap.containsKey("type")) {
			this.type = (DataBaseType) parameterMap.get("type");
		}
		if(parameterMap.containsKey("isCompressed")) {
			this.isCompressed = (Boolean) parameterMap.get("isCompressed");
		}
	}
}


/*Problems with this code
 * type Safety => in hash-map we cannot put different type of key and values and this may cause runtime error 
 * we need to read code to change the code // it is difficult to extend 
 */


