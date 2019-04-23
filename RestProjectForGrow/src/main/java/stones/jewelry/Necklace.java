package stones.jewelry;

import stones.stone.PreciousStones;
import stones.stone.Stones;

import java.util.ArrayList;

public class Necklace extends PreciousStones {
  public String name;
  public double price;
  public ArrayList<Stones> stones;

  public Necklace() {

  }

  public Necklace(String name, double price, ArrayList<Stones> stones) {
    super();
    this.name = name;
    this.price = price;
    this.stones = stones;
  }

  public static ArrayList<Stones> ListOfNecklace = new ArrayList();

  @Override
  public double getPrice() {
    return price;
  }

  public void getListOfNecklace() {
    ListOfNecklace.stream()
            .forEach(System.out::println);
  }

  @Override
  public String toString() {
    return "Necklace{" +
            "name='" + name + '\'' +
            ", price=" + price +
            ", stones.stone=" + stones +
            '}';
  }
}
