package hypermarket.kind_of_materials;

import hypermarket.materials.IPaint_product;

public class Paint implements IPaint_product {
  private double price;
  private String color;
  private double capacity;

  public Paint(double price, String color, double capacity) {
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
