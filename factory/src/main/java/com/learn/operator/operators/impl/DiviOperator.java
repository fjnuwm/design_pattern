package com.learn.operator.operators.impl;

import com.learn.operator.operators.IOperator;

public class DiviOperator implements IOperator {
  @Override
  public double calResult(double num1, double num2) {
    if (num2 == 0) {
      throw new ArithmeticException("不能除以0");
    }
    return num1 / num2;
  }
}
