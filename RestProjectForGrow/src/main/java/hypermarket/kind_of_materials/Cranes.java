package hypermarket.kind_of_materials;

import hypermarket.materials.IPlumbing;

public class Cranes implements IPlumbing {
  private double price;
  private String material;

  public Cranes(double price, String material) {
    this.price = price;
    this.material = material;
  }

  @Override
  public String toString() {
    return "Cranes{" +
            "price=" + price +
            ", material='" + material + '\'' +
            '}';
  }

  @Override
  public double getPrice() {
    return this.price;
  }
}
