package com;
/* 向上转型
 * 将子类对象转为父类对象。此处父类对象可以是接口。
 * 父类引用指向子类对象，而子类引用不能指向父类对象。
 * */
public class Animal {
  public void eat(){
    System.out.println("animal eatting...");
  }
}
class Bird extends Animal{
  public void eat(){
    System.out.println("bird eatting...");
  }
  public void fly(){
    
    System.out.println("bird flying...");
  }
}
class Main{
  public static void main(String[] args) {
    Animal b = new Bird(); //向上转型
    b.eat();
    // bird eatting...
    //! error: b.fly(); b虽指向子类对象，但此时丢失fly()方法
    dosleep(new Male()); // Male sleep..
    dosleep(new Female());// Female sleep..
    
    /*
     * 向下转型：父类对象转为子类对象。
     * 
     */
    Girl g1=new MMGirl(); //向上转型
    g1.smile();
    
    MMGirl mmg=(MMGirl)g1; //向下转型,编译和运行皆不会出错
    mmg.smile();
    mmg.c();
    
    
    Girl g2=new Girl();
//    MMGirl mmg1=(MMGirl)g2; //不安全的向下转型,编译无错但会运行会出错
//    mmg1.smile();
//    mmg1.c();
/*output:
* CGirl smile sounds sweet...
* CGirl smile sounds sweet...
* CGirl c()...
* Exception in thread "main" java.lang.ClassCastException: com.wensefu.other1.Girl
* at com.wensefu.other1.Main.main(Girl.java:36)
*/
    if(g2 instanceof MMGirl){
      MMGirl mmg1=(MMGirl)g2; 
      mmg1.smile();
      mmg1.c();
    }
  }
  public static void dosleep(Human h) {
    h.sleep();
  }
}
