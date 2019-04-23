package hypermarket.kind_of_materials;

import hypermarket.materials.IWood;


public class Door implements IWood {
  private double price;
  private String color;
  private int number;

  public Door(double price, String color, int number) {
    this.price = price;
    this.color = color;
    this.number = number;
  }


  @Override
  public String toString() {
    return "Door :" +
            "price=" + this.price +
            ", color=" + this.color +
            ", number=" + this.number +
            ' ';
  }

  @Override
  public double getPrice() {
    return this.price;
  }
}
