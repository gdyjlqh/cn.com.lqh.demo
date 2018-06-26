###装饰模式

   Attach additional responsibilities to an object dynamically
   keeping the same interface.Decorators provide a flexible alternative
   to subclassing for extending functionality.


   动态地给一个对象添加一些额外的职责。就增加功能来说，装饰模式相比生成子类更为灵活。


   1. Component抽象构件
        接口后或抽象类，定义最核心，最原始的对象

   2. ConcreteComponent 具体构件

   3. 具体装饰类

    1. 需要扩展一个类的功能，或给一个类增加附加功能。
    2. 需要动态地给一个对象增加功能，这些功能可以再动态地撤销。
    3. 需要为一批的兄弟类进行改装或加装功能，当然是首选装饰模式。