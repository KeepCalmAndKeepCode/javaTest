public class Test implements Flyable,Bitable{
  @Override
  public void bite() {
    System.out.println("吸血");
  }

  @Override
  public void fly() {
    System.out.println("用翅膀飞");
  }

  public static void main(String[] args) {
    System.out.println(Flyable.wingsNumber);//2
    Test obj = new Test();
    obj.bite();
  }
}
