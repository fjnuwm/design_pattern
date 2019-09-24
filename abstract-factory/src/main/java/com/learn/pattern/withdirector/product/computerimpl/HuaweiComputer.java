package com.learn.pattern.withdirector.product.computerimpl;

import com.learn.pattern.withdirector.product.AbstractComputer;

public class HuaweiComputer extends AbstractComputer {
  @Override
  public void start() {
    System.out.println("华为电脑开机界面");
  }
}
