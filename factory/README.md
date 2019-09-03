# 工厂模式
## 1. 简单工厂模式
### 意图
通过专门的工厂来创建其他类的实例，一般创建的类都有一个共同的父类，通过不同的参数返回不同的实例。例如：生产电脑，根据不同的参数可以生产小米电脑，华为电脑等。
### 角色结构
- **Factory:** 创建产品，包含了创建产品逻辑
- **Product:** 抽象产品
- **ConcreteProduct:** 具体的产品角色
![](https://github.com/fjnuwm/design_pattern/blob/master/factory/src/main/resources/uml/simple-factory.jpg "uml")
### 优点
1. 将创建和使用的过程分离开
2. 客户端只需要知道要创建的产品的类型的参数，不用关心创建逻辑
### 缺点
1. 当产品过多时会造成Factory内容庞大臃肿
2. 每次新增一个产品都需要往Factory添加内容，违反了开闭原则

## 2. 工厂方法模式
### 意图
简单工厂每新增一个产品就需要修改Factory里的创建逻辑，违反了开闭原则。工厂方法模式在简单工厂模式的基础上抽象了一个Factory，通过具体的工厂子类创建对应的产品，而不必修改具体的工厂角色。
### 角色结构
- **IFactory:** 抽象工厂
- **ConcreteFactory:** 具体的工厂
- **Product:** 抽象产品
- **ConcreteProduct:** 具体的产品角色
![](https://github.com/fjnuwm/design_pattern/blob/master/factory/src/main/resources/uml/factory-method.jpg "uml")
### 优点
1. 新增产品的时候，不需要修改具体的工厂角色，只需要新增一个工厂子类
2. 相对简单工厂模式，更符合开闭原则
### 缺点
1. 每新增一个产品就需要新增一个工厂类
