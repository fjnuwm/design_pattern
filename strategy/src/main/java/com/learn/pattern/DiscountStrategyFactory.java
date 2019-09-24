package com.learn.pattern;

import com.learn.pattern.strategy.impl.NoDiscountStrategy;
import com.learn.pattern.strategy.impl.OldUserDiscountStrategy;
import com.learn.pattern.strategy.impl.VipUserDiscountStrategy;

public class DiscountStrategyFactory {
  public static IDiscountStrategy getDiscountStrategy(String userType) {
    switch (userType) {
      case "oldUser":
        return new OldUserDiscountStrategy();
      case "vipUser":
        return new VipUserDiscountStrategy();
      default:
        return new NoDiscountStrategy();
    }
  }
}
