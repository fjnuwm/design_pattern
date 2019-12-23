package com.learn.pattern;

public interface IObserver {
  void receiveMessage(String message);

  String observerName();
}
