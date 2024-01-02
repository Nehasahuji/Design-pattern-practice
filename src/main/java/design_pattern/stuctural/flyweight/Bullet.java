package design_pattern.stuctural.flyweight;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

//Step 1: create our intrinsic state fields that not changes
@AllArgsConstructor
@Getter
public class Bullet {

	private Double radius;

	private Double weight;

	private BulletType type;

}
