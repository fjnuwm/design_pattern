package com.learn;

/**
 * 线程安全的懒汉式单例模式
 * 通过双重判断加锁
 */
public class SafeLazySingleTon {
  private volatile static SafeLazySingleTon singleTon = null;

  public SafeLazySingleTon getInstance() {
    if (singleTon == null) {
      synchronized (SafeLazySingleTon.class) {
        if (singleTon == null) {
          singleTon = new SafeLazySingleTon();
        }
      }
    }
    return singleTon;
  }

  private SafeLazySingleTon() {

  }
}
