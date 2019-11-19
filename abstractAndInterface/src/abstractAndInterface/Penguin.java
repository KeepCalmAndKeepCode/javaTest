package abstractAndInterface;
public class Penguin extends Animal { 
  public Penguin(String myName, int myid) { 
      super(myName, myid); 
  }
  public static void main(String[] args) {
  	Penguin penguin1 = new Penguin("Æó¶ì",10);
  	penguin1.introduction();
	}
}