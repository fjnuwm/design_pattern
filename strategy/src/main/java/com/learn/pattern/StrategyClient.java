package com.learn.pattern;

/**
 * 策略模式客户端
 */
public class StrategyClient {
  public static void main(String[] args) {
    double principal = 100;
    CalculatorContext context = new CalculatorContext(DiscountStrategyFactory.getDiscountStrategy("oldUser"));
    double finalPrice = context.calcuPrice(principal);
    System.out.println("最后需付金额:" + finalPrice);
  }
}
