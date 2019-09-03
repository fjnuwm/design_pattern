package com.learn.factory.impl;

import com.learn.factory.AbstractFactory;
import com.learn.product.AbstractComputer;
import com.learn.product.AbstractPhone;
import com.learn.product.computerimpl.HuaweiComputer;
import com.learn.product.phoneimpl.HuaweiPhone;

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
