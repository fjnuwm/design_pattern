package com.learn.factory.impl;

import com.learn.factory.AbstractFactory;
import com.learn.pattern.withdirector.product.AbstractComputer;
import com.learn.pattern.withdirector.product.AbstractPhone;
import com.learn.pattern.withdirector.product.computerimpl.HuaweiComputer;
import com.learn.pattern.withdirector.product.phoneimpl.HuaweiPhone;

public class HuaweiFactory extends AbstractFactory {
  @Override
  public AbstractPhone createPhone() {
    return new HuaweiPhone();
  }

  @Override
  public AbstractComputer createComputer() {
    return new HuaweiComputer();
  }
}
