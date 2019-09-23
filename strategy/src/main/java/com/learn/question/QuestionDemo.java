package com.learn.question;

public class QuestionDemo {
  private static String oldUser = "oldUser";
  private static String newUser = "newUser";
  private static String vipUser = "vipUser";

  public static void main(String[] args) {
    double principal = 100;
    String currentUser = "oldUser";
    double finalPrice = principal;

    if (currentUser.equals(oldUser)) {
      finalPrice = finalPrice * 0.7;
      System.out.println("老用户打7折");
    } else if (currentUser.equals(vipUser)) {
      finalPrice = finalPrice * 0.5;
      System.out.println("vip用户打5折");
    } else {
      System.out.println("新用户没有优惠活动");
    }

    System.out.println("最后需付金额:" + finalPrice);
  }
}
