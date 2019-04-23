package hypermarket.kind_of_materials;

import hypermarket.materials.Hypermarket_materials;

public class Parquet implements Hypermarket_materials {
  private double price;
  private String color;
  private String kind_of_wood;
  private double squ_of_lath;

  public Parquet(double price, String color, double squ_of_lath) {
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
