package com.learn.pattern.withdirector.builder.impl;

import com.learn.pattern.withdirector.builder.AbstractComputerBuilder;

public class HuaweiComputerBuilder extends AbstractComputerBuilder {
  @Override
  public AbstractComputerBuilder screen() {
    computer.setScreen("华为屏幕");
    return this;
  }

  @Override
  public AbstractComputerBuilder cpu() {
    computer.setCpu("华为CPU");
    return this;
  }
}
