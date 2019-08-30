package com.learn;

/**
 * 饿汉式单例模式
 * 优点：线程安全
 * 缺点：类加载时就初始化，可能造成内存浪费
 */
public class HungrySingleTon {
  private final static HungrySingleTon SINGLE_TON = new HungrySingleTon();

  public HungrySingleTon getInstance() {
    return SINGLE_TON;
  }

  private HungrySingleTon() {

  }
}
