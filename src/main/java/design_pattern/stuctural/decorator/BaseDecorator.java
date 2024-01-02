package design_pattern.stuctural.decorator;

import lombok.AllArgsConstructor;

//Step 3 - Base Decorator
@AllArgsConstructor
public abstract class BaseDecorator implements DataSource{
   public DataSource nextlayer;
}
