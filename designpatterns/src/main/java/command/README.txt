###命令模式

命令模式是一个高内聚的模式，其定义为：
Encapsulate a request as an object,thereby letting you parameterize clients
with different requests,queue or log requests,and support undoable operations.

将一个请求封装成一个对象，从而让你使用不同的请求把客户端参数化，
对请求排队或者记录请求日志，可以提供命令的撤销和恢复功能。


    1. Receive接收者角色
        命令的执行

    2. Command命令角色
        需要执行的所有命令都在这声明

    3. Invoker调用这角色
        接受命令并执行命令
