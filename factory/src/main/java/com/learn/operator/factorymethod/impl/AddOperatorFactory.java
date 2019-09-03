package com.learn.operator.factorymethod.impl;

import com.learn.operator.factorymethod.IOperatorFactory;
import com.learn.operator.operators.IOperator;
import com.learn.operator.operators.impl.AddOperator;

public class AddOperatorFactory implements IOperatorFactory {
  @Override
  public IOperator create() {
    return new AddOperator();
  }
}
