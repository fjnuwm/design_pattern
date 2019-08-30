package com.learn;

/**
 * 静态内部类单例模式
 * 优点：线程安全，在使用到时才会初始化
 */
public class InnerSingleTon {
  private static class InnerSingleTonHolder {
    public static InnerSingleTon singleTon = new InnerSingleTon();
  }

  public InnerSingleTon getInstance() {
    return InnerSingleTonHolder.singleTon;
  }

  private InnerSingleTon() {

  }
}
