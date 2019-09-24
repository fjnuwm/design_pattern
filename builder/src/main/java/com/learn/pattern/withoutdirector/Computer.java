package com.learn.pattern.withoutdirector;

public class Computer {
  private String cpu;
  private String screen;
  private String mouse;

  public Computer(String cpu, String screen, String mouse) {
    this.cpu = cpu;
    this.screen = screen;
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

  public static ComputerBuilder builder() {
    return new ComputerBuilder();
  }

  public static class ComputerBuilder {
    private String cpu;
    private String screen;
    private String mouse;

    public ComputerBuilder cpu(String cpu) {
      this.cpu = cpu;
      return this;
    }

    public ComputerBuilder screen(String screen) {
      this.screen = screen;
      return this;
    }

    public ComputerBuilder mouse(String mouse) {
      this.mouse = mouse;
      return this;
    }

    public Computer build() {
      return new Computer(this.cpu, this.screen, this.mouse);
    }
  }
}
