package design_pattern.creational.builder.v6_reference_variable;

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

		// Step 2: Create reference of outer class
		Database database;

		// Step 3: Expose setter on builder
		// Fluent interfaces || chaining methods
		public DatabaseBuilder setName(String name) {
			database.name = name;
			return this;
		}

		public DatabaseBuilder port(int port) {
			database.port = port;
			return this;
		}

		public DatabaseBuilder setCredentail(String userName, String password) {
			database.userName = userName;
			database.password = password;
			return this;
		}

		public DatabaseBuilder mysql() {
			database.type = DataBaseType.MY_SQL;
			return this;
		}

		public DatabaseBuilder compressed() {
			database.isCompressed = true;
			return this;
		}

		public Database build() {

			boolean isValid = validate();
			if (!isValid) {
				throw new IllegalArgumentException("Bad data");
			}
			Database database1 = new Database();
			database1.name = database.name;
			database1.userName = database.userName;
			database1.password = database.password;
			database1.type = database.type;
			database1.isCompressed = database.isCompressed;
			System.out.print("Database created sucessfully inside build method");
			return database1;
		}

		// we can add validations on input
		private boolean validate() {
			if (database.type == DataBaseType.MY_SQL && database.port != 3306) {
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
