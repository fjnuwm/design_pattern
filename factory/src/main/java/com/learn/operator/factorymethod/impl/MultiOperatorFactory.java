package com.learn.operator.factorymethod.impl;

import com.learn.operator.factorymethod.IOperatorFactory;
import com.learn.operator.operators.IOperator;
import com.learn.operator.operators.impl.MultiOperator;

public class MultiOperatorFactory implements IOperatorFactory {
  @Override
  public IOperator create() {
    return new MultiOperator();
  }
}
