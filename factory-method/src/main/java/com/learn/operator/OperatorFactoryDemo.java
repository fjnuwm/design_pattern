package com.learn.operator;

import com.learn.operator.factory.OperatorFactory;
import com.learn.operator.operators.ShuangmuOperator;

public class OperatorFactoryDemo {
  public static void main(String[] args) {
    String add = "+";
    ShuangmuOperator shuangmuOperator = (ShuangmuOperator) OperatorFactory.create(add);
    shuangmuOperator.number1 = 10d;
    shuangmuOperator.number2 = 20d;
    System.out.println("10 + 20 = " + shuangmuOperator.calResult());
  }
}
