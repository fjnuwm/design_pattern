package com.learn;

/**
 * 枚举单例模式
 * 缺点：类加载就初始化，可能浪费资源
 * 优点：线程安全
 */
public enum  EnumSingleTon {
  INSTANCE;
}
