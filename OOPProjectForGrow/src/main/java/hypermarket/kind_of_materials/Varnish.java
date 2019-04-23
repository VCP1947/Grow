package hypermarket.kind_of_materials;

import hypermarket.materials.IPaint_product;

public class Varnish implements IPaint_product {
  private Double price;
  private String color;
  private Double capacity;

  public Varnish(Double price, String color, Double capacity) {
    this.price = price;
    this.color = color;
    this.capacity = capacity;
  }

  @Override
  public String toString() {
    return "Paint{" +
            "price=" + price +
            ", color='" + color + '\'' +
            ", capacity=" + capacity +
            '}';
  }

  @Override
  public double getPrice() {
    return this.price;
  }
}
