package com.learn.factory;

import com.learn.product.AbstractComputer;
import com.learn.product.AbstractPhone;

public abstract class AbstractFactory {
  public abstract AbstractPhone createPhone();
  public abstract AbstractComputer createComputer();
}
