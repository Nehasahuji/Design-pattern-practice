package design_pattern.creational.registery.game;


// Step 1: Create a clonable interface
@FunctionalInterface
public interface GraphicalObject {
	GraphicalObject cloneObject();
}
