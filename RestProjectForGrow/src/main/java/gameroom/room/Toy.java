package gameroom.room;

public class Toy {
  private int id;
  private double price;
  private String size;
  private String kindOfToy;
  private String nameOfKid;

  public Toy(int id, double price, String size, String kindOfToy, String nameOfKid) {
    this.id = id;
    this.price = price;
    this.size = size;
    this.kindOfToy = kindOfToy;
    this.nameOfKid = nameOfKid;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public String getKindOfToy() {
    return kindOfToy;
  }

  public void setKindOfToy(String kindOfToy) {
    this.kindOfToy = kindOfToy;
  }

  public String getNameOfKid() {
    return nameOfKid;
  }

  public void setNameOfKid(String nameOfKid) {
    this.nameOfKid = nameOfKid;
  }

  @Override
  public String toString() {
    return "Toy :" +
            "id=" + id +
            ", price=" + price +
            ", size='" + size +
            ", kindOfToy='" + kindOfToy +
            ", nameOfKid='" + nameOfKid + '\n';
  }
}
