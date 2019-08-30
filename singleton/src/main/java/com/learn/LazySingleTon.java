package com.learn;

/**
 * 懒汉式单例模式
 * 优点：只有在用到的时候才会创建
 * 缺点：线程不安全
 */
public class LazySingleTon {
  private static LazySingleTon singleTon = null;

  public LazySingleTon getInstance() {
    if (singleTon == null) {
      singleTon = new LazySingleTon();
    }
    return singleTon;
  }

  private LazySingleTon() {

  }
}
