package design_pattern.stuctural.decorator;


//Step 4: Create Concrete Decorator 
public class CompressionDecorator extends BaseDecorator{

	public CompressionDecorator(DataSource nextlayer) {
		super(nextlayer);
		
	}

	@Override
	public String read() {
		String value = nextlayer.read();
		return decompress(value);
	}

	private String decompress(String value) {
		return value + " -DeCompressed";
	}

	@Override
	public void write(String value) {
		String compressed = compressed(value);
		nextlayer.write(compressed);
	}

	private String compressed(String value) {
		return value + " -Compressed";
	}

}
