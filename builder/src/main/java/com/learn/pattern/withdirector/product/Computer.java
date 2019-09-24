package com.learn.pattern.withdirector.product;

public class Computer {
  private String screen;
  private String cpu;

  public String getScreen() {
    return screen;
  }

  public void setScreen(String screen) {
    this.screen = screen;
  }

  public String getCpu() {
    return cpu;
  }

  public void setCpu(String cpu) {
    this.cpu = cpu;
  }

  @Override
  public String toString() {
    return "Computer{" +
        "screen='" + screen + '\'' +
        ", cpu='" + cpu + '\'' +
        '}';
  }
}
