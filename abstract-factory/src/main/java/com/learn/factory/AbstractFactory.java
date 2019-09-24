package com.learn.factory;

import com.learn.pattern.withdirector.product.AbstractComputer;
import com.learn.pattern.withdirector.product.AbstractPhone;

public abstract class AbstractFactory {
  public abstract AbstractPhone createPhone();
  public abstract AbstractComputer createComputer();
}
