# 建造者模式
### 意图
建造者模式将一个产品的构建过程和表示分离开。通俗地来讲就是一步步地创建产品，通过相同的构建过程可以创建出不同的产品。
### 角色结构
- **Builder:** 抽象的构建接口
- **ConcreteBuider:**: 具体的构建接口
- **Direcor:** 指定构建产品的过程，也可以去掉该角色，由客户端自己指定构建过程
- **Product:** 要构建的产品
![](https://github.com/fjnuwm/design_pattern/blob/master/builder/src/main/resources/uml/builder.jpg "uml")
### 优点
1.建造者模式将一个产品的构建过程和表示分离开
### 缺点
1.需要创建更多的ConcreteBuider类
