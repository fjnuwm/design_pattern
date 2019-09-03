package com.learn.operator.simplefactory;

import com.learn.operator.operators.IOperator;

public class OperatorFactoryClient {
  public static void main(String[] args) {
    String add = "+";
    IOperator addOperator =  OperatorFactory.create(add);
    System.out.println("10 + 20 = " + addOperator.calResult(10d, 20d));
  }
}
