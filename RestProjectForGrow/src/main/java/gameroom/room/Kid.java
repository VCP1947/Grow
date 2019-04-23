package gameroom.room;

public class Kid {
  private String name;
  private int age;
  private double account;

  public Kid(String name, int age, double account) {
    this.name = name;
    this.age = age;
    this.account = account;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public double getAccount() {
    return account;
  }

  public void setAccount(double account) {
    this.account = account;
  }

  @Override
  public String toString() {
    return "Kid :" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", account=" + account +'\n';
  }
}
