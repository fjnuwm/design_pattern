package com.learn.factory.impl;

import com.learn.factory.AbstractFactory;
import com.learn.pattern.withdirector.product.AbstractComputer;
import com.learn.pattern.withdirector.product.AbstractPhone;
import com.learn.pattern.withdirector.product.computerimpl.XiaomiComputer;
import com.learn.pattern.withdirector.product.phoneimpl.XiaomiPhone;

public class XiaomiFactory extends AbstractFactory {
  @Override
  public AbstractPhone createPhone() {
    return new XiaomiPhone();
  }

  @Override
  public AbstractComputer createComputer() {
    return new XiaomiComputer();
  }
}
