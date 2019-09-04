package com.learn.builder;

import com.learn.product.Computer;

public abstract class AbstractComputerBuilder {
  protected Computer computer = new Computer();

  public Computer genComputer() {
    return computer;
  }

  public abstract AbstractComputerBuilder screen();
  public abstract AbstractComputerBuilder cpu();
}
