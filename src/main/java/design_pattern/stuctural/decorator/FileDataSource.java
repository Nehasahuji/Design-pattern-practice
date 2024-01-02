package design_pattern.stuctural.decorator;

//Step 2: Concrete product class
public class FileDataSource implements DataSource{

	@Override
	public String read() {
		return "Base";
	}

	@Override
	public void write(String value) {
		System.out.println(value);
		
	}

}
