package com.learn;

import com.learn.builder.AbstractComputerBuilder;
import com.learn.builder.impl.HuaweiComputerBuilder;
import com.learn.product.Computer;

/**
 * 建造者模式客户端
 */
public class BuilderClient {
  public static void main(String[] args) {
    AbstractComputerBuilder huaweiComputerBuilder = new HuaweiComputerBuilder();
    ComputerDirector director = new ComputerDirector(huaweiComputerBuilder);
    director.construct();
    Computer computer = huaweiComputerBuilder.genComputer();
    System.out.println(computer.getCpu());
    System.out.println(computer.getScreen());
  }
}
