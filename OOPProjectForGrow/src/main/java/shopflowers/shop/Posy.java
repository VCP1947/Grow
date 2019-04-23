package shopflowers.shop;

public class Posy {
  private String nameFlower;
  private int number;
  private double price;

  public Posy(String nameFlower, int number, double price) {
    this.nameFlower = nameFlower;
    this.number = number;
    this.price = price;
  }

  public Posy() {

  }

  public String getNameFlower() {
    return nameFlower;
  }

  public void setNameFlower(String nameFlower) {
    this.nameFlower = nameFlower;
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "Posy{" +
            "nameFlower='" + nameFlower + '\'' +
            ", number=" + number +
            ", price=" + price +'\n';
  }
}
