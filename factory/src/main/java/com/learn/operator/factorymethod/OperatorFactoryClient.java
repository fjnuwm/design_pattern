package com.learn.operator.factorymethod;

import com.learn.operator.factorymethod.impl.AddOperatorFactory;
import com.learn.operator.operators.IOperator;

/**
 * 工厂方法模式
 */
public class OperatorFactoryClient {
  public static void main(String[] args) {
    IOperatorFactory addOperatorFactory = new AddOperatorFactory();
    IOperator addOperator = addOperatorFactory.create();
    System.out.println("10 + 20 = " + addOperator.calResult(10d, 20d));
  }
}
