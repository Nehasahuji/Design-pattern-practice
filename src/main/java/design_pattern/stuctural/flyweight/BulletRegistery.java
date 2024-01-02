package design_pattern.stuctural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class BulletRegistery {

	Map<BulletType, Bullet> bullets = new HashMap<>();

	public void addBullet(Bullet bullet) {
		bullets.put(bullet.getType(), bullet);
	}

	public Bullet getBullet(BulletType type) {
		return bullets.get(type);
	}
}
