package com.learn.operator.factorymethod.impl;

import com.learn.operator.factorymethod.IOperatorFactory;
import com.learn.operator.operators.IOperator;
import com.learn.operator.operators.impl.DiviOperator;

public class DiviOperatorFactory implements IOperatorFactory {
  @Override
  public IOperator create() {
    return new DiviOperator();
  }
}
