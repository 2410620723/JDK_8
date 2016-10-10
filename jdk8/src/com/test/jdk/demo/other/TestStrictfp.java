package com.test.jdk.demo.other;
/**
 * strictfp 精确浮点
 * 在Java虚拟机进行浮点运算时，如果没有指定strictfp关键字时，Java的编译器以及运 行环境在对浮点运算的表达式是采取一种近似于我行我素的行为来完成这些操作，以致于得到的结果往往无法令你满意。而一旦使用了strictfp来声明一个 类、接口或者方法时，那么所声明的范围内Java的编译器以及运行环境会完全依照浮点规范IEEE-754来执行。因此如果你想让你的浮点运算更加精确， 而且不会因为不同的硬件平台所执行的结果不一致的话，那就请用关键字strictfp。
 * 你可以将一个类、接口以及方法声明为strictfp，但是不允许对接口中的方法以及构造函数声明strictfp关键字
 * 一旦使用了关键字strictfp来声明某个类、接口或者方法时，那么在这个关键字所声明的范围内所有浮点运算都是精确的，符合IEEE-754规范的。例如一个类被声明为strictfp，那么该类中所有的方法都是strictfp的。
 * @author zxm
 *
 */
public class TestStrictfp {
	
}
