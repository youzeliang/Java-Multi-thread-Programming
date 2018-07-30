# Java-Multi-thread-Programming

All code has been submitted to the warehouse for the convenience of the reader reference example. 

Reference to [here](https://github.com/loveincode/Java-Multi-thread-Programming) for part 

![](https://github.com/yzrds/Java-Multi-thread-Programming/blob/master/Java%E5%A4%9A%E7%BA%BF%E7%A8%8B%E7%BC%96%E7%A8%8B%E6%A0%B8%E5%BF%83%E6%8A%80%E6%9C%AF.jpg)





## Directory structure description：
### chapter    chapter_X    
### section    section_X    
### thread  thread_X_Y_Z 
### project  project_X_Y   




思考，
既然代码的运行结果和代码的执行顺序或调用顺序是无关的，那么如何按照特定的顺序执行

线程池




关于Redis分页查询缓存方案

关于我为什么写这篇文章是因为，有个知乎网友问到我这个问题

缓存确实是个好东西，因为可以极大的提升系统的服务能力，以及降低对数据库的压力。

我们经常在接口中可以看到这样的,page=1&limit=10。这是根据条件来查询分页的。这种情况就可以根据不同条件的分页来缓存多个key，
但是思考一下，缓存的value会存在冗余。因为页码数大的总会包括小的。这种情况缓存的意义就不是太大了。
而且这样会导致数据的不一致性。设置过期时间来自动失效，但是可能会出现的情况有第一页命中了缓存，第二页的数据已经变换了，

而且一般的分页缓存，按页放到缓存里。缺点是缓存不能及时更新。

数据以id为key缓存到Redis里；

数据id和排序都存在Redis的skip list，即zset里;

当查找数据时，先从Redis里的skip list取出对应的分页数据，得到ID列表。

用multi get从redis上一次性把ID列表里的所有数据都取出来。如果有缺少某些ID的数据，再从数据库里查找，再一块返回给用户，并把查出来的数据按ID缓存到Redis里。

用Lua脚本合并操作的优化 ?
以及用搜索引擎来实现也是一个办法。

基于SortedSet的分页查询缓存方案





热点数据，缓存才有价值



