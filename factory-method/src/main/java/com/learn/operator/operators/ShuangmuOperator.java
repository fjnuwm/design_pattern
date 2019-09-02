package com.learn.operator.operators;

import java.util.function.DoubleBinaryOperator;

public abstract class ShuangmuOperator implements IOperator {
  public Double number1;
  public Double number2;
  private DoubleBinaryOperator operator;

  public ShuangmuOperator(DoubleBinaryOperator operator) {
    this.operator = operator;
  }

  @Override
  public double calResult() {
    if (number1 == null || number2 == null) {
      throw new RuntimeException("还未赋值");
    }
    return operator.applyAsDouble(number1, number2);
  }
}
