package com.learn.pattern.withoutdirector;

public class BuilderClient {
  public static void main(String[] args) {
    Computer computer = Computer.builder().cpu("A13CPU").screen("京东方屏幕").mouse("15块钱的鼠标").build();
    System.out.println(computer);
  }
}
