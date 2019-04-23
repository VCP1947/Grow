package hypermarket.kind_of_materials;

import hypermarket.materials.IWood;

public class Laminate implements IWood {
  private double price;
  private String color;
  private double squ_of_lath;

  public Laminate(double price, String color, double squ_of_lath) {
    this.price = price;
    this.color = color;
    this.squ_of_lath = squ_of_lath;
  }

  @Override
  public String toString() {
    return "Laminate{" +
            "price=" + price +
            ", color='" + color + '\'' +
            ", squ_of_lath=" + squ_of_lath +
            '}';
  }

  @Override
  public double getPrice() {
    return this.price;
  }
}
