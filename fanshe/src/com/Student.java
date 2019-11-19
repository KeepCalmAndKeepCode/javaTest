package com;

public class Student {
	public String name;//定义学生姓名
  private int age;//定义学生年龄
  private String sex;//定义学生性别
  //获得学生姓名的方法
  public String getName() {
      return name;
  }
  //学生姓名赋值的方法
  public void setName(String name) {
      this.name = name;
  }
  //获得学生年龄的方法
  public int getAge() {
      return age;
  }
  //注意，这里没有为学生年龄赋值的方法，学生年龄为私有类型。

  //获得学生性别的方法
  public String getSex() {
      return sex;
  }
  //学生性别赋值的方法
  public void setSex(String sex) {
      this.sex = sex;
  }
}
