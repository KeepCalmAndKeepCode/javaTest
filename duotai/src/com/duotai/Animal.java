package com.duotai;

class Animal {
  /**
   * 声明一个私有的成员变量name。
   */
  private String name;

  /**
   * 在Animal类自定义的构造方法
   *
   * @param name
   */
  Animal(String name) {
    this.name = name;
  }

  /**
   * 在Animal类里面自定义一个方法enjoy
   */
  public void enjoy() {
    System.out.println("动物的叫声……");
  }
}

/**
 * 子类Cat从父类Animal继承下来，Cat类拥有了Animal类所有的属性和方法。
 *
 * @author gacl
 */
class Cat extends Animal {
  /**
   * 在子类Cat里面定义自己的私有成员变量
   */
  private String eyesColor;

  /**
   * 在子类Cat里面定义Cat类的构造方法
   *
   * @param n
   * @param c
   */
  Cat(String n, String c) {
    /**
     * 在构造方法的实现里面首先使用super调用父类Animal的构造方法Animal(String name)。
     * 把子类对象里面的父类对象先造出来。
     */
    super(n);
    this.eyesColor = c;
  }

  /**
   * 子类Cat对从父类Animal继承下来的enjoy方法不满意，在这里重写了enjoy方法。
   */
  public void enjoy() {
    System.out.println("我养的猫高兴地叫了一声……");
  }
}

/**
 * 子类Dog从父类Animal继承下来，Dog类拥有了Animal类所有的属性和方法。
 *
 * @author gacl
 */
class Dog extends Animal {
  /**
   * 在子类Dog里面定义自己的私有成员变量
   */
  private String furColor;

  /**
   * 在子类Dog里面定义Dog类的构造方法
   *
   * @param n
   * @param c
   */
  Dog(String n, String c) {
    /**
     * 在构造方法的实现里面首先使用super调用父类Animal的构造方法Animal(String name)。
     * 把子类对象里面的父类对象先造出来。
     */
    super(n);
    furColor = c;
  }

  /**
   * 子类Dog对从父类Animal继承下来的enjoy方法不满意，在这里重写了enjoy方法。
   */
  public void enjoy() {
    System.out.println("我养的狗高兴地叫了一声……");
  }
}

/**
 * 子类Bird从父类Animal继承下来，Bird类拥有Animal类所有的属性和方法
 *
 * @author gacl
 */
class Bird extends Animal {
  /**
   * 在子类Bird里面定义Bird类的构造方法
   */
  Bird() {
    /**
     * 在构造方法的实现里面首先使用super调用父类Animal的构造方法Animal(String name)。
     * 把子类对象里面的父类对象先造出来。
     */
    super("bird");
  }

  /**
   * 子类Bird对从父类Animal继承下来的enjoy方法不满意，在这里重写了enjoy方法。
   */
  public void enjoy() {
    System.out.println("我养的鸟高兴地叫了一声……");
  }
}

/**
 * 定义一个类Lady(女士)
 *
 * @author gacl
 */
class Lady {
  /**
   * 定义Lady类的私有成员变量name和pet
   */
  private String name;
  private Animal pet;

  /**
   * 在Lady类里面定义自己的构造方法Lady()，
   * 这个构造方法有两个参数，分别为String类型的name和Animal类型的pet，
   * 这里的第二个参数设置成Animal类型可以给我们的程序带来最大的灵活性，
   * 因为作为养宠物来说，可以养猫，养狗，养鸟，只要是你喜欢的都可以养，
   * 因此把它设置为父类对象的引用最为灵活。
   * 因为这个Animal类型的参数是父类对象的引用类型，因此当我们传参数的时候，
   * 可以把这个父类的子类对象传过去，即传Dog、Cat和Bird等都可以。
   *
   * @param name
   * @param pet
   */
  Lady(String name, Animal pet) {
    this.name = name;
    this.pet = pet;
  }

  /**
   * 在Lady类里面自定义一个方法myPetEnjoy()
   * 方法体内是让Lady对象养的宠物自己调用自己的enjoy()方法发出自己的叫声。
   */
  public void myPetEnjoy() {
    pet.enjoy();
  }
}

