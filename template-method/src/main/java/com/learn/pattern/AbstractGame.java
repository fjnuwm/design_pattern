package com.learn.pattern;

public abstract class AbstractGame {
  public abstract void installSlice();

  public void openGameBox() {
    System.out.println("打开游戏机");
  }

  public void startGame() {
    System.out.println("开始游戏");
  }

  public abstract void playGame();

  public void closeGameBox() {
    System.out.println("游戏结束，关机");
  }

  public void uninstallSlice() {
    System.out.println("拔掉游戏片");
  };

  public void play() {
    // 1.插上片
    installSlice();

    // 2.打开游戏机
    openGameBox();

    // 3.开始游戏
    startGame();

    // 4.游戏中
    playGame();

    // 5.游戏结束关机
    closeGameBox();

    // 6.拔掉片
    uninstallSlice();
  }
}
