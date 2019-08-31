package com.learn.operator.factory;

import com.learn.operator.operators.*;
import com.learn.operator.operators.impl.AddOperator;
import com.learn.operator.operators.impl.DiviOperator;
import com.learn.operator.operators.impl.MultiOperator;
import com.learn.operator.operators.impl.SubOperator;

public class OperatorFactory {
  public static IOperator create(String operator) {
    switch (operator) {
      case "+":
        return new AddOperator();
      case "-":
        return new SubOperator();
      case "/":
        return new DiviOperator();
      case "*":
        return new MultiOperator();
      default:
        throw new RuntimeException("不支持的运算符");
    }
  }
}
