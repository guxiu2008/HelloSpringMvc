springmvc

一、SpringMvc的HelloWorld实现
1、所需的配置项目
    web.xml:
        1）webapp的入口
        2）servlet和servlet-mapping可以配置多个，根据url上下文匹配servlet实例运行网页
        3）listener标签用于监听用户行为的东西
        4）若运行helloworld只需要配置servlet、servlet-mapping、listener标签即可
        5）详细解释可以参考网页：https://blog.csdn.net/ahou2468/article/details/79015251
        6）标签context-param用于读取加载spring配置文件,如果不配置不配置,默认的路径是/WEB-INF/applicationontext.xml,如果有多个,可以使用逗号分开,必须存在,HelloWorld的实现可以先随便弄一个空的applicationContext.xml文件
    springmvc-servlet.xml：
        1）初步认为是control层和view层关联的配置文件
        2）详细解释可以参考网页：https://blog.csdn.net/zhang_jane_1987/article/details/80021166