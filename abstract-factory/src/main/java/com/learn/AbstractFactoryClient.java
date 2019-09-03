package com.learn;

import com.learn.factory.AbstractFactory;
import com.learn.factory.impl.HuaweiFactory;
import com.learn.factory.impl.XiaomiFactory;
import com.learn.product.AbstractComputer;
import com.learn.product.AbstractPhone;

/**
 * 抽象工厂模式
 */
public class AbstractFactoryClient {
  public static void main(String[] args) {
    // huawei
    AbstractFactory huaweiFactory = new HuaweiFactory();
    AbstractPhone huaweiPhone = huaweiFactory.createPhone();
    huaweiPhone.start();
    AbstractComputer huaweiComputer = huaweiFactory.createComputer();
    huaweiComputer.start();

    // xiaomi
    AbstractFactory xiaomiFactory = new XiaomiFactory();
    AbstractPhone xiaomiPhone = xiaomiFactory.createPhone();
    xiaomiPhone.start();
    AbstractComputer xiaomiComputer = xiaomiFactory.createComputer();
    xiaomiComputer.start();
  }
}
