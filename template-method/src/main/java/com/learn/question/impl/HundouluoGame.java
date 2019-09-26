package com.learn.question.impl;

import com.learn.question.AbstractGame;

public class HundouluoGame extends AbstractGame {
  @Override
  public void installSlice() {
    System.out.println("插上魂斗罗片");
  }

  @Override
  public void openGameBox() {
    System.out.println("打开游戏机");
  }

  @Override
  public void startGame() {
    System.out.println("开始游戏");
  }

  @Override
  public void playGame() {
    System.out.println("正在玩魂斗罗");
  }

  @Override
  public void closeGameBox() {
    System.out.println("游戏结束，关机");
  }

  @Override
  public void uninstallSlice() {
    System.out.println("拔掉游戏片");
  }

  public void play() {
    // 1.插上魂斗罗片
    installSlice();

    // 2.打开游戏机
    openGameBox();

    // 3.开始游戏
    startGame();

    // 4.正在玩游戏
    playGame();

    // 5.游戏结束关机
    closeGameBox();

    // 6.拔掉游戏片
    uninstallSlice();
  }
}
