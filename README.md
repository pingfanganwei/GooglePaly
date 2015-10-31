# GooglePaly
###2015-11-1 02:30:53
1. 搭建软件整体框架
2. 自定义`PagerTab`控件，作为指示器，
3. 添加一些资源文件，
4. 添加`UIUtils`包，更好的编写代码。
5. 简单抽取基类`BaseApplication`，`BaseActivity`，`BaseFragmet`
运行成功
6. 使用`FragmentFactory`来构建我们需要分`Fragment`,在内部使用`HashMap`通过`position`保存构建过的`fragment`,保证下次再使用时，不需要在次创建。