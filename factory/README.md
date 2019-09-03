# 工厂模式
### 意图
通过专门的工厂来创建其他类的实例，一般创建的类都有一个共同的父类，通过不同的参数返回不同的实例。例如：生产电脑，根据不同的参数可以生产小米电脑，华为电脑等。

### 角色结构
- **Factory:** 创建产品，包含了创建产品逻辑
- **Product:** 抽象产品
- **ConcreteProduct:** 具体的产品角色
![](https://github.com/fjnuwm/design_pattern/blob/master/factory-method/src/main/resources/uml/simple-factory.jpg "uml")

### 优点
1. 将创建和使用的过程分离开
2. 客户端只需要知道要创建的产品的类型的参数，不用关心创建逻辑

### 缺点
1. 当产品过多时会造成Factory内容庞大臃肿