package design_pattern.creational.builder.v5_setter_chaining;

import design_pattern.creational.builder.DataBaseType;

public class Database {

	private String name;

	private String password;

	private String userName;

	private int port;
	
	private DataBaseType type;

	private Boolean isCompressed;

	private Database() {

	}

	// Trick 1: Create a static Builder method => static initializer
	public static DatabaseBuilder Builder() {
		return new DatabaseBuilder();
	}

	// Step 1: Create a Static inner Class
	public static class DatabaseBuilder {

		// Step 2 copy all the parameters in the static class
		private String name;

		private String password;

		private String userName;

		private DataBaseType type;

		private Boolean isCompressed;

		private int port;

		// Step 3: Expose setter on builder
		// Fluent interfaces || chaining methods
		public DatabaseBuilder setName(String name) {
			this.name = name;
			return this;
		}

		public DatabaseBuilder port(int port) {
			this.port = port;
			return this;
		}

		public DatabaseBuilder setCredentail(String userName, String password) {
			this.userName = userName;
			this.password = password;
			return this;
		}

		public DatabaseBuilder mysql() {
			this.type = DataBaseType.MY_SQL;
			return this;
		}

		public DatabaseBuilder compressed() {
			this.isCompressed = true;
			return this;
		}

		// Create object of database class
		public Database build() {

			boolean isValid = validate();
			if (!isValid) {
				throw new IllegalArgumentException("Bad data");
			}
			Database database = new Database();
			database.name = name;
			database.userName = userName;
			database.password = password;
			database.type = type;
			database.isCompressed = isCompressed;
			return database;
		}

		// we can add validations on input
		private boolean validate() {
			if (type == DataBaseType.MY_SQL && port != 3306) {
				return false;
			} else
				return true;
		}

	}
}

/*
 * Problems with this code type Safety => in hash-map we cannot put different
 * type of key and values and this may cause runtime error we need to read code
 * to change the code // it is difficult to extend
 */
