package com.learn.question;

public class Computer {
  private String cpu;
  private String screen;
  private String mouse;

  public Computer(String cpu, String screen, String mouse) {
    this.cpu = cpu;
    this.screen = screen;
    this.mouse = mouse;
  }

  public String getCpu() {
    return cpu;
  }

  public void setCpu(String cpu) {
    this.cpu = cpu;
  }

  public String getScreen() {
    return screen;
  }

  public void setScreen(String screen) {
    this.screen = screen;
  }

  public String getMouse() {
    return mouse;
  }

  public void setMouse(String mouse) {
    this.mouse = mouse;
  }

  @Override
  public String toString() {
    return "Computer{" +
        "cpu='" + cpu + '\'' +
        ", screen='" + screen + '\'' +
        ", mouse='" + mouse + '\'' +
        '}';
  }
}
