package com.learn.factory.impl;

import com.learn.factory.AbstractFactory;
import com.learn.product.AbstractComputer;
import com.learn.product.AbstractPhone;
import com.learn.product.computerimpl.XiaomiComputer;
import com.learn.product.phoneimpl.XiaomiPhone;

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
