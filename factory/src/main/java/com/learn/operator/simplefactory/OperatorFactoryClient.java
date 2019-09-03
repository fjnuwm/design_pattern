package com.learn.operator.simplefactory;

import com.learn.operator.operators.IOperator;

/**
 * 简单工厂模式
 */
public class OperatorFactoryClient {
  public static void main(String[] args) {
    String add = "+";
    IOperator addOperator =  OperatorFactory.create(add);
    System.out.println("10 + 20 = " + addOperator.calResult(10d, 20d));
  }
}
