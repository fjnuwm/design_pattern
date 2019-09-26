package com.learn.pattern;

import com.learn.pattern.impl.HundouluoGame;
import com.learn.pattern.impl.TankGame;

public class TemplateMethodClient {
  public static void main(String[] args) {
    // 1.先玩魂斗罗
    AbstractGame huodouluoGame = new HundouluoGame();
    huodouluoGame.play();
    System.out.println("======================");

    // 2.玩完魂斗罗玩坦克大战
    AbstractGame tankGame = new TankGame();
    tankGame.play();
  }
}
