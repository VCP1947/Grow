package hypermarket.kind_of_materials;

import hypermarket.materials.IPlumbing;

public class Shower implements IPlumbing {
  private double price;
  private String material;

  @Override
  public String toString() {
    return "Shower{" +
            "price=" + price +
            ", material='" + material + '\'' +
            '}';
  }

  public Shower(double price, String material) {
    this.price = price;
    this.material = material;
  }

  @Override
  public double getPrice() {
    return this.price;
  }
}
