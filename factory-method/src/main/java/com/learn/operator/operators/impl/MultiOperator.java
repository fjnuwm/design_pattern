package com.learn.operator.operators.impl;

import com.learn.operator.operators.ShuangmuOperator;

import java.util.function.DoubleBinaryOperator;

public class MultiOperator extends ShuangmuOperator {
  public MultiOperator() {
    super(new DoubleBinaryOperator() {
      @Override
      public double applyAsDouble(double left, double right) {
        return left * right;
      }
    });
  }
}
