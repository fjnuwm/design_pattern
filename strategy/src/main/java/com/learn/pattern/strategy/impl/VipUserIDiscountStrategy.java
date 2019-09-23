package com.learn.pattern.strategy.impl;

import com.learn.pattern.IDiscountStrategy;

public class VipUserIDiscountStrategy implements IDiscountStrategy {
  @Override
  public double getPrice(double principal) {
    System.out.println("vip用户打5折");
    return principal * 0.5;
  }
}
