package com.learn.pattern;

public interface ISubject {
  /**
   * 添加观察者
   */
  void addObserver(IObserver observer);

  /**
   * 移除观察者
   */
  void delObserver(IObserver observer);

  /**
   * 通知观察者
   */
  void notifyObservers(String message);
}
