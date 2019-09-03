package com.learn.operator.factorymethod.impl;

import com.learn.operator.factorymethod.IOperatorFactory;
import com.learn.operator.operators.IOperator;
import com.learn.operator.operators.impl.SubOperator;

public class SubOperatorFactory implements IOperatorFactory {
  @Override
  public IOperator create() {
    return new SubOperator();
  }
}
