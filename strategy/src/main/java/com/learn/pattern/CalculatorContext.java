package com.learn.pattern;

public class CalculatorContext {
  private IDiscountStrategy discountStrategy;

  public CalculatorContext(IDiscountStrategy discountStrategy) {
    this.discountStrategy = discountStrategy;
  }

  public void setDiscountStrategy(IDiscountStrategy discountStrategy) {
    this.discountStrategy = discountStrategy;
  }

  public double calcuPrice(double principal) {
    return this.discountStrategy.getPrice(principal);
  }
}
