package jiekou;
// 当类实现接口的时候，类要实现接口中所有的方法。否则，类必须声明为抽象的类。
public class MammalInt implements Animal{
	 public void eat(){
     System.out.println("Mammal eats");
  }

  public void travel(){
     System.out.println("Mammal travels");
  } 

  public int noOfLegs(){
     return 0;
  }

  public static void main(String args[]){
     MammalInt m = new MammalInt();
     m.eat();
     m.travel();
  }
}
