package Test;
/**
 * ##注解：
 * *概念：说明程序的。给计算机看的
 * *注释：用文字描述程序的。给程序员看的
 * *定义：注解（Annotation），也叫元数据。一种代码级别的说明。它是JDK1.5及以后版本引人的一个特性，与类、接口、枚举是在同一个层次。
 * 它可以声明在包、类、字段、方法、局部变量、方法参数等的前面，用来对这些元素进行说明，注释。
 * *概念描述：
 * *JDK1.5之后的新特性
 * *说明程序的
 * *使用注解：@注解名称
 * *作用分类：
 * ①编写文档：通过代码里标识的注解生成文档【生成文档doc文档]
 * ②代码分析：通过代码里标识的注解对代码进行分析【使用反射】
 * ③编译检童：通过代码里标识的注解让编译器能够实现基本的编译检查【override】
 *
 * * JDK中预定义的一些注解
 * * @override：检测被该注解标注的方法是否是继承自父类（接口）的
 * * @Deprecated：该注解标注的内容，表示已过时
 * * @Suppresswarnings：压制警告
 * * * 一般传递参数all @suppresswarnings（“all"）
 *
 * * 自定义注解
 * * 格式：
 * * * 元注解
 * * * public@interface 注解名称 {
 *        属性列表
 *    }
 * * 本质：注解本质上就是一个接口，该接口默认继承Annotation接口
 * * * public interface MyAnno extends java.lang.annotation.Annotation{}
 * * 属性：接中的抽象方法
 * * * 要求：
 * * * 1.属性的返回值类型有下列取值
 * * * * 基本数据类型
 * * * * string
 * * * * 枚举
 * * * * 注解
 * * * * 以上类型的数组
 * * * 2.定义了属性，在使用时需要给属性赋值
 * * * * 1.如果定义属性时，使用default关键字给属性默认初始化值，则使用注解时，可以不进行属性的赋值。
 * * * * 2.如果只有一个属性需要赋值，并且属性的名称是value，则value可以省略，直接定义值即可。
 * * * * 3.数组赋值时，值使用{}包裹。如果数组中只有一个值，则{}可以省略
 *
 * 1.注解的定义：Java文件叫做Annotation，用@interface表示。
 * 2.元注解：@interface上面按需要注解上一些东西，包括@Retention、@Target、@Document、@Inherited四种。
 * 3.注解的保留策略：
 * 　　@Retention(RetentionPolicy.SOURCE)         // 注解仅存在于源码中，在class字节码文件中不包含
 * 　　@Retention(RetentionPolicy.CLASS)          // 默认的保留策略，注解会在class字节码文件中存在，但运行时无法获得
 * 　　@Retention(RetentionPolicy.RUNTIME)        // 注解会在class字节码文件中存在，在运行时可以通过反射获取到
 * 4.注解的作用目标：
 * 　　@Target(ElementType.TYPE)                  // 接口、类、枚举、注解
 * 　　@Target(ElementType.FIELD)                 // 字段、枚举的常量
 * 　　@Target(ElementType.METHOD)                // 方法
 * 　　@Target(ElementType.PARAMETER)             // 方法参数
 * 　　@Target(ElementType.CONSTRUCTOR)           // 构造函数
 * 　　@Target(ElementType.LOCAL_VARIABLE)        // 局部变量
 * 　　@Target(ElementType.ANNOTATION_TYPE)       // 注解
 * 　　@Target(ElementType.PACKAGE)               // 包
 *
 * 5.注解包含在javadoc中：
 * 　　@Documented
 *
 * 6.注解可以被继承：
 * 　　@Inherited
 *
 * 7.注解解析器：用来解析自定义注解。
 *
 * */

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;

@Documented
@Inherited
public @interface Init {
}
