package design_pattern.creational.builder.v4_builder;

public class Runner {

	public static void main(String[] args) {
        Database.DatabaseBuilder builder  = new Database.DatabaseBuilder();
        builder.setName("Akash");
        builder.setPassword("Auth@Jan2");
        System.out.println(builder);

	}

}
