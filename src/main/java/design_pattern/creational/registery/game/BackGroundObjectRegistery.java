package design_pattern.creational.registery.game;

import java.util.HashMap;
import java.util.Map;

public class BackGroundObjectRegistery {

	private Map<BackGroundType, BackGroundObject> registery = new HashMap<>();

	public void addPrototype(BackGroundObject backGroundObject) {
		registery.put(backGroundObject.getType(), backGroundObject);
	}

	public void removePrototype(BackGroundType type) {
		registery.remove(type);
	}

	public BackGroundObject getPrototype(BackGroundType type) {
		return registery.get(type);
	}

}
