package gacl.javabean.study;
import java.util.Date;
/**
 * @author gacl
 * Person�����һ����򵥵�JavaBean
 */
public class Person {

  //------------------Person���װ��˽������---------------------------------------
  // ���� String����
  private String name;
  // �Ա� String����
  private String sex;
  // ���� int����
  private int age;
  // �Ƿ��ѻ� boolean����
  private boolean married;
  // ����
  private Date birthday;
  //---------------------------------------------------------
  
  //------------------Person����޲������췽��---------------------------------------
  /**
   * �޲������췽��
   */
  public Person() {
      
  }
  //---------------------------------------------------------
  
  //------------------Person������ṩ�����ڷ���˽�����Ե�public����---------------------------------------
  public String getName() {
      return name;
  }

  public void setName(String name) {
      this.name = name;
  }

  public String getSex() {
      return sex;
  }

  public void setSex(String sex) {
      this.sex = sex;
  }

  public int getAge() {
      return age;
  }

  public void setAge(int age) {
      this.age = age;
  }

  public boolean getMarried() {
      return married;
  }

  public void setMarried(boolean married) {
      this.married = married;
  }
  
  public void setBirthday(Date birthday) {
  	this.birthday = birthday;
	}
  
  public Date getBirthday() {
  	return birthday;
	}
  //---------------------------------------------------------
}