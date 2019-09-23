package com.learn.pattern;

import com.learn.pattern.strategy.impl.OldUserIDiscountStrategy;

public class StrategyClient {
  public static void main(String[] args) {
    double principal = 100;
    CalculatorContext context = new CalculatorContext(new OldUserIDiscountStrategy());
    double finalPrice = context.calcuPrice(principal);
    System.out.println("最后需付金额:" + finalPrice);
  }
}
