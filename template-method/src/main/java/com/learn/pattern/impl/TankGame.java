package com.learn.pattern.impl;

import com.learn.pattern.AbstractGame;

public class TankGame extends AbstractGame {
  @Override
  public void installSlice() {
    System.out.println("插上坦克大战片");
  }

  @Override
  public void playGame() {
    System.out.println("正在玩坦克大战");
  }
}
