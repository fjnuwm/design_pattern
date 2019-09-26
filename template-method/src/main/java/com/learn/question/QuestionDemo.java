package com.learn.question;

import com.learn.question.impl.HundouluoGame;
import com.learn.question.impl.TankGame;

public class QuestionDemo {

  public static void main(String[] args) {
    // 1.玩魂斗罗
    AbstractGame hundouluoGame = new HundouluoGame();
    hundouluoGame.play();
    System.out.println("==============");

    // 2.玩完魂斗罗完坦克大战
    AbstractGame tankGame = new TankGame();
    tankGame.play();
  }
}
