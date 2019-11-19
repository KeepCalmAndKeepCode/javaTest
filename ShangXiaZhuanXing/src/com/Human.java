package com;

public class Human {
  public void sleep() {
    System.out.println("Human sleep..");
  }
}
class Male extends Human {
  @Override
  public void sleep() {
    System.out.println("Male sleep..");
  }
}
class Female extends Human {
  @Override
  public void sleep() {
    System.out.println("Female sleep..");
  }
}