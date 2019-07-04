# aopdemo
常见的java异常分析工具
1、top 查看系统每个pid的cpu使用情况
2、top -Hp <pid> 查看pid下的所有线程id<pid>的情况
3、jstack <pid> 查看所有线程的堆栈信息找到异常的线程id（16进制的表示形式） 可以检查出死锁 具体哪行代码的问题 以及垃圾回收线程的运行
4、jstat -gcutil <pid> <period(监控多久ms)> <times(多久刷新一次ms)> 监测gc的具体情况
5、jmap -dump:format=b,file=<filePath> <pid> 导出内存信息 包含所有对象使用的内存信息。 二进制文件需要mat等工具解析
6、使用mat等工具分析 具体哪个对象占用了大量的内存空间。
