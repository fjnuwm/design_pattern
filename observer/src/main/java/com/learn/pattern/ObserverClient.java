package com.learn.pattern;

import com.learn.pattern.impl.ArticleSubject;
import com.learn.pattern.impl.UserObserver;

public class ObserverClient {
  public static void main(String[] args) {
    ISubject subject = new ArticleSubject();

    IObserver xmObserver = new UserObserver("小明");
    IObserver xhObserver = new UserObserver("小红");
    IObserver xlObserver = new UserObserver("小兰");

    subject.addObserver(xmObserver);
    subject.addObserver(xhObserver);
    subject.addObserver(xlObserver);
    subject.notifyObservers("新的文章推送，山村老师");

    subject.delObserver(xhObserver);
    subject.notifyObservers("新的文章推送，回魂夜");
  }
}
