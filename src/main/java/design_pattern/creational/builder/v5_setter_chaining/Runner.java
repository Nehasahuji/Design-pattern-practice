package design_pattern.creational.builder.v5_setter_chaining;

public class Runner {

	public static void main(String[] args) {
		Database.DatabaseBuilder builder = Database.Builder();
		builder.setName("Neha")
		.setCredentail("Neha", "Neha@2497")
		.port(3307)
		.mysql()
		.compressed()
		.build();
		
		System.out.println(builder);
	}

}
