package design_pattern.creational.factory.v2_factory_method;

//step 3: create button factory 
public interface ButtonFactory {
	
   //Factory method
   //This method is responsible for creating object 
   Button createButton(Double radius,Double border,Double length);

}




