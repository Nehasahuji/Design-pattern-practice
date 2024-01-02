package design_pattern.stuctural.flyweight;

import lombok.AllArgsConstructor;

//Step 2: Create extrinsic state
@AllArgsConstructor
public class FlyingBullet {
	
	private Double x,y,z;
	
	private Double Direction;
	
	//Step3: Add a has a relation 
	private Bullet bullet;
	
	
}
