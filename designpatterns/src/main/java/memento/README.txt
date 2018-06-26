###备忘录模式

    Without violating encapsulation,capture and externalize an object's internal state
    so that the object can be restored to this state later.

    在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。
    这样以后就可将该对象恢复到原先保存的状态


    1. Originator 发起人角色
        定义状态，负责创建和恢复备忘录数据

    2. Memento 备忘录角色
            记录Originator的状态

    3. Caretaker 备忘录管理员角色
        对备忘录进行管理、保持和提供备忘录

