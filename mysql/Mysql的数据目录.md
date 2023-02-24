#### **查看数据存放的目录**
mysql> show variables like 'datadir';
#### **默认数据库**
mysql
用户账号和权限、储存过程、事件定义、日志、帮助信息、时区
information_schema
元数据 (所有其他数据库信息,比如有哪些表、视图、触发器、列、索引)、内部系统表
performance_schema
运行过程的状态信息,监控各类性能指标,包括执行了哪些语句,花费的时间, 内存情况
sys
通过视图的形式吧information_schema和performance_schema结合,帮助监控技术性能
#### **表在文件系统中的表示**
举例： 数据库a ， 表b 。 
1. 如果表b采用 InnoDB ，data\a中会产生1个或者2个文件：
b.frm ：描述表结构文件，字段长度等
如果采用 系统表空间 模式的，数据信息和索引信息都存储在 ibdata1 中
如果采用 独立表空间 存储模式，data\a中还会产生 b.ibd 文件（存储数据信息和索引信息）
此外：
① MySQL5.7 中会在data/a的目录下生成 db.opt 文件用于保存数据库的相关配置。比如：字符集、比较
规则。而MySQL8.0不再提供db.opt文件。
② MySQL8.0中不再单独提供b.frm，而是合并在b.ibd文件中。
2. 如果表b采用 MyISAM ，data\a中会产生3个文件：
MySQL5.7 中： b.frm ：描述表结构文件，字段长度等。
MySQL8.0 中 b.xxx.sdi ：描述表结构文件，字段长度等
b.MYD (MYData)：数据信息文件，存储数据信息(如果采用独立表存储模式) b.MYI (MYIndex)：存放索引信息文件