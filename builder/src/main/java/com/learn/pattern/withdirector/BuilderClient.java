package com.learn.pattern.withdirector;

import com.learn.pattern.withdirector.builder.AbstractComputerBuilder;
import com.learn.pattern.withdirector.builder.impl.HuaweiComputerBuilder;
import com.learn.pattern.withdirector.product.Computer;

/**
 * 建造者模式客户端
 */
public class BuilderClient {
  public static void main(String[] args) {
    AbstractComputerBuilder huaweiComputerBuilder = new HuaweiComputerBuilder();
    ComputerDirector director = new ComputerDirector(huaweiComputerBuilder);
    director.construct();
    Computer computer = huaweiComputerBuilder.genComputer();
    System.out.println(computer);
  }
}
