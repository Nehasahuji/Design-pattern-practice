package design_pattern.stuctural.decorator;

//Step 1: create a product interface
public interface DataSource{
		public String read();
		
		public void write(String value);
}
