package stones.stone;

import java.util.ArrayList;

public class PreciousStones implements Stones {
  private int id;
  private String name;
  private double karat;
  private double price;
  private int transparency;
  private double totalprice;
  private double totalKarat;

  public PreciousStones(int id, String name, double karat, double price, int transparency) {
    this.id = id;
    this.name = name;
    this.karat = karat;
    this.price = price;
    this.transparency = transparency;
  }

  public PreciousStones() {

  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public double getKarat() {
    return karat;
  }

  public double getPrice() {
    return price;
  }

  public int getTransparency() {
    return transparency;
  }

  public static ArrayList<PreciousStones> listPStones = new ArrayList();

  public void create_ListPStones() {
    listPStones.add(new PreciousStones(1, "Diamond", 4.5, 5000, 7));
    listPStones.add(new PreciousStones(2, "Rubin", 4, 20065, 5));
    listPStones.add(new PreciousStones(3, "Saphir", 5, 5656, 4));
  }

  public void getListPStones() {
    listPStones.stream()
            .forEach(System.out::println);
  }

  public String totalKaratandPrice() {
    for (PreciousStones item : listPStones) {
      totalKarat = item.getKarat();
      totalprice = item.getPrice();
    }
    return "Total price :" + totalprice + " Total karat :" + totalKarat;
  }

  public double getTotalprice() {
    return totalprice;
  }

  public double getTotalKarat() {
    return totalKarat;
  }

  @Override
  public String toString() {
    return "PreciousStones{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", karat=" + karat +
            ", price=" + price +
            ", transparency=" + transparency +
            '}';
  }
}
