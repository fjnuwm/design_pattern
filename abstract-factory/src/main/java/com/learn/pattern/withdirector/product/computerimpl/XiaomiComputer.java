package com.learn.pattern.withdirector.product.computerimpl;

import com.learn.pattern.withdirector.product.AbstractComputer;

public class XiaomiComputer extends AbstractComputer {
  @Override
  public void start() {
    System.out.println("小米电脑开机界面");
  }
}
