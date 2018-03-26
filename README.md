﻿### JavaToolsKit

 **项目说明** 

1. 本项目开发者或使用者如发现问题请及时进行修复或反馈，并在修复后更新项目信息
2. 若bug暂无法修复则需在下方“无法修复”中记录详细情况，并在修复后删除记录
3. 版本命名规则请参照“开发者版本号说明”


 **开发环境** 

1. CharlieZzo
    - 系统版本：macOS 10.13.3（High Sierra）
    - JDK版本：1.8.0_161
    - IDE版本：Eclipse Oxygen.2 Release (4.7.2) 20171218-0600
    - MySQL Driver：5.1.42
    - SQL Server Driver：4.0
    - SQLite Driver：3.21.0
    - POI：3.16
    - JSON lib：2.4


 **已有功能** 

1. 文件
    - 文件的字节流读写操作
    - 文件的字符流读写操作
    - 文件打开和保存对话框
    - Excel表格读写操作

2. 网络
    - 获取本机网卡
    - 发送和接收UDP包
    - 访问HTTP网页

3. 数据库
    - MySQL数据库操作
    - SQL Server数据库操作
    - SQLite数据库操作

4. 执行命令
    - 执行dos/shell命令

5. 排序算法
    - 冒泡排序
    - 快速排序

6. 查找算法
    - 折半查找

7. 加密算法
    - 栅栏密码
    - 培根密码
    - 凯撒密码
    - 维尼吉亚密码
    - 散列算法
    - 仿射密码
    - 异或加密

8. 解密算法
    - 栅栏密码
    - 培根密码
    - 凯撒密码
    - 维尼吉亚密码
    - 仿射密码
    - 异或解密

9. 图像处理
    - 灰度化图像
    - 递度图像
    - gamma优化图像

10. 安全相关
    - SQL注入检查

11. 杂项
    - 正则

12. 数据结构
    - 二叉树
    - 队列
    - 栈

 **无法修复** 

1. 2017/07/20
    - 标题：这是一个示例
    - 发现者：XXX
    - 问题描述：详细记录异常产生过程，可使用图片进行辅助描述


 **版本号说明** 

- 主版本号.次版本号.修正版本号
    1. 当项目进行局部微调或修复bug时,主版本号与次版本号均不变，修正版本号加一
    2. 当项目进行增加功能时，主版本号不变，次版本号加一，并将修正版本号清零
    3. 当项目进行重大修改或局部修改累计次数较多时，主版本号加一，并将次版本号与修正版本号清零


 **版本更新记录**
    
1. 2017/7/16
    - 负责人：CharlieZzo
    - 版本：-
    - 备注：创建项目，并完成一些常用操作的封装

2. 2017/07/27
    - 负责人：CharlieZzo
    - 版本：1.0.0
    - 备注：调整代码规范，启用版本号更新累加规则，面向项目开发者开源

3. 2017/07/30
    - 负责人：CharlieZzo
    - 版本：1.1.0
    - 备注：增加文件和文件夹打开对话框并返回所选文件或文件夹的路径

4. 2017/07/30
    - 负责人：CharlieZzo
    - 版本：1.2.0
    - 备注：增加文件保存对话框和Excel表格读写操作

5. 2018/01/06
    - 负责人：CharlieZzo
    - 版本：2.0.0
    - 备注：开始重构代码，更改设计原则，增加自定义错误提示

6. 2018/01/07
    - 负责人：CharlieZzo
    - 版本：2.1.0
    - 备注：重构基本完成，新版本现有功能请查阅 **已有功能**

7. 2018/01/09
    - 负责人：CharlieZzo
    - 版本：2.2.0
    - 备注：新增一些排序、查找算法

8. 2018/01/22
    - 负责人：CharlieZzo
    - 版本：2.2.1
    - 备注：修复hash算法中字符缺失情况

9. 2018/01/27
    - 负责人：CharlieZzo
    - 版本：2.2.2
    - 备注：修复SQL查询操作中无法返回字段名的问题

10. 2018/01/30
    - 负责人：CharlieZzo
    - 版本：2.3.0
    - 备注：增加访问遵从HTTP协议的网页的操作和一些图像处理操作

11. 2018/02/06
    - 负责人：CharlieZzo
    - 版本：2.4.0
    - 备注：增加新的加密方式和正则，调整部分包结构

12. 2018/02/15
    - 负责人：CharlieZzo
    - 版本：2.4.2
    - 备注：可从json或xml文件中读取自定义的SQL注入判定字符

13. 2018/02/19
    - 负责人：CharlieZzo
    - 版本：2.4.3
    - 备注：修复一些bug

14. 2018/02/20
    - 负责人：CharlieZzo
    - 版本：2.4.4
    - 备注：修改、增加正则表达式

15. 2018/03/05
    - 负责人：CharlieZzo
    - 版本：2.4.5
    - 备注：修复从xml和json文件中读取SQL注入关键字判断出错问题

16. 2018/03/06
    - 负责人：CharlieZzo
    - 版本：2.5.0
    - 备注：新增SQLite数据库操作

17. 2018/03/06
    - 负责人：CharlieZzo
    - 版本：2.5.1
    - 备注：微调

18. 2018/03/023
    - 负责人：CharlieZzo
    - 版本：2.6.0
    - 备注：增加三种数据结构操作（java原生的不太好用），部分类微调