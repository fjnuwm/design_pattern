package com.learn.pattern.withdirector.product.phoneimpl;

import com.learn.pattern.withdirector.product.AbstractPhone;

public class HuaweiPhone extends AbstractPhone {
  @Override
  public void start() {
    System.out.println("华为手机开机界面");
  }
}
