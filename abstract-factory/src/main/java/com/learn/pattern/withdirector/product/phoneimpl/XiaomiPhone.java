package com.learn.pattern.withdirector.product.phoneimpl;

import com.learn.pattern.withdirector.product.AbstractPhone;

public class XiaomiPhone extends AbstractPhone {
  @Override
  public void start() {
    System.out.println("小米手机开机界面");
  }
}
