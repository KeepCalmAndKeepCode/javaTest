package com;

public class Girl {
	public void smile(){
    System.out.println("girl smile()...");
  }
}
class MMGirl extends Girl{
  
  @Override
  public void smile() {
    
    System.out.println("MMirl smile sounds sweet...");
  }
  public void c(){
    System.out.println("MMirl c()...");
  }
}
