package com.learn.pattern.strategy.impl;

import com.learn.pattern.IDiscountStrategy;

public class NewUserIDiscountStrategy implements IDiscountStrategy {
  @Override
  public double getPrice(double principal) {
    System.out.println("新用户不打折");
    return principal;
  }
}
