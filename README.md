# AndroidAnnotations Example
Android 项目集成 [AndroidAnnotations](https://github.com/excilys/androidannotations) 的使用示例.

对于为什么要使用AndroidAnnotations, 它的价值用一句话可以概括: **让你的代码更简洁易懂, 省时省力.**

不明白怎么个简洁易懂法? 觉得有点虚?

那么就请速速围观 [AndroidAnnotations](http://androidannotations.org/), Before -> After 代码量直接减少一半够你大吃一惊了吧!

## 本示例包含功能
1. 基础代码通过 [AndroidKickstartR](http://androidkickstartr.com/) 生成而来
2. AndroidKickstartR目前(2014-05-05)只提供 androidannotations-2.7.1, 手工升级为 androidannotations-3.0.1
3. 能够通过ANT来构建项目, 无需依赖IDE(基于Android的build.xml), 包含集成androidannotations时ProGuard所需的正确配置
4. 当然也可以作为Eclipse项目来运作, 无需关心ANT构建
5. 仅使用了最简单的androidannotations注解功能, 更多实用功能请参考: [AndroidAnnotations Documentation](https://github.com/excilys/androidannotations/wiki) 和 [HelloWorldEclipse](https://github.com/excilys/androidannotations/tree/develop/examples/HelloWorldEclipse)

## 既然有官方示例了, 还要这个项目做什么
主要增强(区别)的地方:

1. 集成了ANT构建项目, 参考[Building Project Ant](https://github.com/excilys/androidannotations/wiki/Building-Project-Ant)
2. 修正官方示例中的 ProGuard 配置, 以及未在[How to configure Proguard for AndroidAnnotations](https://github.com/excilys/androidannotations/wiki/Proguard)中提及的配置项