package com.learn.pattern.impl;

import com.learn.pattern.IObserver;
import com.learn.pattern.ISubject;

import java.util.ArrayList;
import java.util.List;

public class ArticleSubject implements ISubject {
  private List<IObserver> observers = new ArrayList<>();

  @Override
  public void addObserver(IObserver observer) {
    System.out.println(observer.observerName() + "订阅了文章主题");
    observers.add(observer);
  }

  @Override
  public void delObserver(IObserver observer) {
    System.out.println(observer.observerName() + "取消订阅文章主题");
    observers.remove(observer);
  }

  @Override
  public void notifyObservers(String message) {
    for (IObserver observer : observers) {
      observer.receiveMessage(message);
    }
  }
}
