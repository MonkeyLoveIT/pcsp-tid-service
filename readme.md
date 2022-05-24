一、核心概念
· Ioc(Inversion of Control)控制反转
    对象的创建控制权由程序转移到外部，这种思想称为控制反转
· Sprint技术对IoC思想的实现
    Spring提供了一个容器，称为IoC容器，用来充当IoC思想中的"外部"
    IoC容器负责对象的创建、初始化等一系列工作，被创建或被管理的对象在IoC容器中统称为Bean
· DI(Dependency Injection)依赖注入
    在容器中建立bean和bean之间的依赖关系的整个过程，称为依赖注入
· 目标：充分解耦
    使用IoC容器管理bean（IoC）
    在IoC容器内将有依赖关系的bean进行关系绑定
· 最终效果
    使用对象不仅可以直接从IoC容器获取，并且获取到的bean已经绑定了所有的依赖关系

二、IoC入门案例思路分析
1. 管理什么？（Service和Dao）
2. 如何将被管理的对象告诉IoC容器（配置）
3. 被管理的对象交给IoC容器，如何获取到IoC容器？（接口）
4. IoC容器得到后，如何从容器中获取bean？（接口方法）
5. 使用Spring导入哪些坐标？（pom.xml)

三、DI入门案例分析
1. 基于IoC管理bean
2. Service中使用new形式创建的Dao对象是否保留？（否）
3. Service中需要的Dao对象如何进入到Service中？（提供方法）
4. Service与Dao间的关系如何描述？（配置）