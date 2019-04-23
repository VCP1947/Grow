package hypermarket.kind_of_materials;

import hypermarket.materials.IPlumbing;

public class Pipes implements IPlumbing {
  private double price;
  private String material;
  private double volume;

  public Pipes(double price, String material, double volume) {
    this.price = price;
    this.material = material;
    this.volume = volume;
  }

  @Override
  public String toString() {
    return "Pipes{" +
            "price=" + price +
            ", material='" + material + '\'' +
            ", volume=" + volume +
            '}';
  }

  @Override
  public double getPrice() {
    return this.price;
  }
}
