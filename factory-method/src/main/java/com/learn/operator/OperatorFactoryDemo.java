package com.learn.operator;

import com.learn.operator.factory.OperatorFactory;
import com.learn.operator.operators.IOperator;

public class OperatorFactoryDemo {
  public static void main(String[] args) {
    String add = "+";
    IOperator addOperator =  OperatorFactory.create(add);
    System.out.println("10 + 20 = " + addOperator.calResult(10d, 20d));
  }
}
