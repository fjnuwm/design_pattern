package com.learn.pattern.strategy.impl;

import com.learn.pattern.IDiscountStrategy;

public class NoDiscountStrategy implements IDiscountStrategy {
  @Override
  public double getPrice(double principal) {
    System.out.println("其他用户不打折");
    return principal;
  }
}
