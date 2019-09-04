package com.learn;

import com.learn.builder.AbstractComputerBuilder;

public class ComputerDirector {
  private AbstractComputerBuilder builder;

  public ComputerDirector(AbstractComputerBuilder builder) {
    this.builder = builder;
  }

  public void construct() {
    builder.cpu();
    builder.screen();
  }
}
