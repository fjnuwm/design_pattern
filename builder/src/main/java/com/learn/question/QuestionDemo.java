package com.learn.question;

/**
 * 当一个产品的构建参数非常多的时候，需要记住每一次参数的位置，有时候可能并不需要构建所有的参数
 */
public class QuestionDemo {
  public static void main(String[] args) {
    Computer computer = new Computer("13A", "京东方", "15块钱的鼠标");
    System.out.println(computer);
  }
}
