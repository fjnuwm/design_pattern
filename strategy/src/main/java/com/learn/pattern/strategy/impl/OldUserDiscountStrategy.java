package com.learn.pattern.strategy.impl;

import com.learn.pattern.IDiscountStrategy;

public class OldUserDiscountStrategy implements IDiscountStrategy {
  @Override
  public double getPrice(double principal) {
    System.out.println("老用户打7折");
    return principal * 0.7;
  }
}
