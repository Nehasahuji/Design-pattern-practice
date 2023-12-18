package design_pattern.creational.registery.game;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
//Step 2: Implements the clonable interfaces 
public class BackGroundObject implements GraphicalObject {

	private Double x;
	private Double y;
	private Double width;
	private Double height;
	private BackGroundType type;
	
	
	@Setter(AccessLevel.NONE)
	private List<Double> Pixels = new ArrayList<Double>();
	
	
	public BackGroundObject(Double x, Double y, Double width, Double height, BackGroundType type) {
		super();
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.type = type;
		this.Pixels = genratePixels(); 
	}

	//Copy constructor
	public BackGroundObject(BackGroundObject backGroundObject) {
		this.x = backGroundObject. x;
		this.y = backGroundObject.y;
		this.width = backGroundObject.width;
		this.height = backGroundObject.height;
		this.type = backGroundObject.type;
		this.Pixels = backGroundObject.Pixels ; 
		
	}

	private List<Double> genratePixels() {
		return Collections.emptyList();
	}

	@Override
	public BackGroundObject cloneObject() {
		return new BackGroundObject(this);
		
	}
}
