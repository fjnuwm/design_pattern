# 模板方法模式
### 意图
定义好算法结构，部分算法通过子类继承父类提供不同的算法过程。
例：玩小霸王游戏机。分为6个步骤1.插上游戏片 2.打开游戏机 3.开始游戏 4.玩游戏中 5.游戏结束，关机 6.拔掉游戏片
其中1插上的游戏片决定了4中所有游戏的内容
### 角色结构
- **AbstractClass:** 抽象父类，有一个模板方法，定义了算法的逻辑结构；定义一系列需要在子类中实现的抽象方法
- **ConcreteClass:** 具体子类，实现父类中定义的抽象方法
![](https://github.com/fjnuwm/design_pattern/blob/master/template-method/src/main/resources/uml/template-method.jpg "uml")
### 优点
1.提高了代码的复用性
2.容易扩展，通过子类实现提供不同的算法
### 缺点
1.每个子类都需要继承一个父类