package com.learn.operator.operators.impl;

import com.learn.operator.operators.IOperator;

public class AddOperator implements IOperator {
  @Override
  public double calResult(double num1, double num2) {
    return num1 + num2;
  }
}
