package hypermarket.kind_of_materials;

import hypermarket.materials.IPlumbing;

public class Bath implements IPlumbing {
   private double price;
   private String color;

  public Bath(double price, String color) {
    this.price = price;
    this.color = color;
  }

  @Override
  public double getPrice() {
    return price;
  }

  @Override
  public String toString() {
    return "Bath :" +
            "price=" + this.price +
            ", color=" + this.color +' ';
  }
}
