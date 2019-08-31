package com.learn.operator.operators.impl;

import com.learn.operator.operators.ShuangmuOperator;

import java.util.function.DoubleBinaryOperator;

public class DiviOperator extends ShuangmuOperator {
  public DiviOperator() {
    super(new DoubleBinaryOperator() {
      @Override
      public double applyAsDouble(double left, double right) {
        if (right == 0) {
          throw new RuntimeException("不能除以0");
        }
        return left - right;
      }
    });
  }
}
