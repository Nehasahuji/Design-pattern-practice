package design_pattern.creational.builder.v4_builder;

import design_pattern.creational.builder.DataBaseType;
public class Database {
	
	private String name;

	private String password;
	
	private String userName;
	
	private DataBaseType type;
	
	private Boolean isCompressed;
	
	private Database() {
		
	}
	
	//Trick 1: Create a static Builder method  => static initializer
	public static DatabaseBuilder Builder(){
		return  new DatabaseBuilder();
	}

	//Step 1: Create a Static inner Class[friend class || Helper class]
	public static class DatabaseBuilder{
		
		//Step 2 copy all the parameters in the static class
		private String name;

		private String password;
		
		private String userName;
		
		private DataBaseType type;
		
		private Boolean isCompressed;
		
		//Step 3: Expose setter on builder
		
		public void setName(String name) {
			this.name = name;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public void setType(DataBaseType type) {
			this.type = type;
		}

		public void setIsCompressed(Boolean isCompressed) {
			this.isCompressed = isCompressed;
		}	
	}
}


/*Problems solve with this code
 * type Safety => in hash-map we cannot put different type of key and values and this may cause runtime error 
 * we need to read code to change the code // it is difficult to extend 
 */


