package design_pattern.stuctural.decorator;

//Step 4: Create Concrete Decorator  
public class EncryptionDecorator extends BaseDecorator {

	public EncryptionDecorator(DataSource nextLayer) {
		super(nextLayer);
	}
	 
	@Override
	public String read() {
		String value = nextlayer.read();
		return decrypt(value);
	}

	private String decrypt(String value) {
		return value + " -Decrypted";
	}

	@Override
	public void write(String value) {
		String encrypted = encrypt(value);
		nextlayer.write(encrypted);
		
	}

	private String encrypt(String value) {
		return value + " -Encrypted";
	}
	
}
