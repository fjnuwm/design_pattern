package com.learn.builder.impl;

import com.learn.builder.AbstractComputerBuilder;

public class XiaomiComputerBuilder extends AbstractComputerBuilder {
  @Override
  public AbstractComputerBuilder screen() {
    computer.setScreen("小米屏幕");
    return this;
  }

  @Override
  public AbstractComputerBuilder cpu() {
    computer.setCpu("小米CPU");
    return this;
  }
}
