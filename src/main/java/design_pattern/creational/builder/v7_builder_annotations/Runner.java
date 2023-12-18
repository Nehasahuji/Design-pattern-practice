package design_pattern.creational.builder.v7_builder_annotations;

public class Runner {

	public static void main(String[] args) {
		Database builder = new Database.DatabaseBuilder()
									   .name("MY")
									   .userName("neha")
									   .password("@sahu")
									   .isCompressed(true)
									   .port(3036)
									   .build();
		
		
		System.out.println(builder.toString());

	}

}
