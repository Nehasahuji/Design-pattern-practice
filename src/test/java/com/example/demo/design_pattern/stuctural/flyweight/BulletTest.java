package com.example.demo.design_pattern.stuctural.flyweight;

import org.junit.Test;

import design_pattern.stuctural.flyweight.Bullet;
import design_pattern.stuctural.flyweight.BulletRegistery;
import design_pattern.stuctural.flyweight.BulletType;
import design_pattern.stuctural.flyweight.FlyingBullet;

public class BulletTest {

	@Test
	void createBullet() {
		Bullet bullet2= new Bullet(10.0, 10.0, BulletType.NINE_MM);
		Bullet bullet1 = new Bullet(10.0, 10.0, BulletType.TWELVE_MM);

		BulletRegistery bulletRegistery = new BulletRegistery();

		FlyingBullet flyingBullet1 = new FlyingBullet(10.0, 10.0, 10.0, 10.0, bulletRegistery.getBullet(BulletType.NINE_MM));
		FlyingBullet flyingBullet2 = new FlyingBullet(11.0, 11.0, 11.0, 11.0, bulletRegistery.getBullet(BulletType.TWELVE_MM));

		bulletRegistery.addBullet(bullet1);
		bulletRegistery.addBullet(bullet2);

	}

}
