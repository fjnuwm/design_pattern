package com.learn.pattern.impl;

import com.learn.pattern.AbstractGame;

public class HundouluoGame extends AbstractGame {
  @Override
  public void installSlice() {
    System.out.println("插上魂斗罗片");
  }

  @Override
  public void playGame() {
    System.out.println("正在玩魂斗罗");
  }
}
