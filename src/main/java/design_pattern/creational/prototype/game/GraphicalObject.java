package design_pattern.creational.prototype.game;


// Step 1: Create a clonable interface
@FunctionalInterface
public interface GraphicalObject {	
	
	GraphicalObject cloneObject();

}
