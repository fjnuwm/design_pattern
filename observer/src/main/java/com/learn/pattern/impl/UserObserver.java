package com.learn.pattern.impl;

import com.learn.pattern.IObserver;

public class UserObserver implements IObserver {
  private String name;

  public UserObserver(String name) {
    this.name = name;
  }

  @Override
  public String observerName() {
    return this.name;
  }

  @Override
  public void receiveMessage(String message) {
    System.out.println(name + "收到了消息:" + message);
  }
}
