Java-8-lambda-练习
========================

这个 git 仓库包含了 《Java 8 Lambdas》 这本书的补充材料。
工程项目结构
-----------------

整个代码布局是:

- 代码放在 `src/main/java`
- 测试代码放在 `src/test/java`

在这些目录中的元素是通过包来组织的:

* 练习的代码放在 `com.insightfullogic.java8.exercises` 包下
* 答案代码放在 `com.insightfullogic.java8.answers`包下，编程问题都是以失败的测试形式出现的， package-info.java的内容是对不涉及编写代码的问题（如是/否问题）的正确答案。比如第二章的答案就放在:[package-info.java](https://github.com/RichardWarburton/java-8-lambdas-exercises/blob/master/src/main/java/com/insightfullogic/java8/answers/chapter2/package-info.java)
* 示例/列表 代码放在 `com.insightfullogic.java8.examples` 包下。

子包的命名与章节编号一致，所以第四章的示例代码位于  `com.insightfullogic.java8.examples.chapter4` 下。

报告问题
----------------

如果你在练习、示例中发现任何问题，你可以通过这个链接提交给O`Reilly [O'Reilly Errata Page](http://www.oreilly.com/catalog/errata.csp?isbn=0636920030713).
