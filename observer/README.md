# 观察者模式
### 意图
定义一对多的依赖关系，当一个对象的状态改变时，所有依赖于它的对象能被通知并更新
### 角色结构
- **Subject:** 抽象主题接口（被观察者）
- **ConcreteSubject:** 具体主题实现
- **Observer:** 抽象观察者
- **ConcreteObserver:** 具体观察者
![](https://github.com/fjnuwm/design_pattern/blob/master/observer/src/main/resources/uml/observer.jpg "uml")
### 优点
1.解除耦合，让耦合的双方都依赖于抽象，从而使得各自的变换都不会影响另一边的变换。
### 缺点
1.在应用观察者模式时需要考虑一下开发效率和运行效率的问题，程序中包括一个被观察者、多个观察者，开发、调试等内容会比较复杂，而且在Java中消息的通知一般是顺序执行，那么一个观察者卡顿，会影响整体的执行效率，在这种情况下，一般会采用异步实现。