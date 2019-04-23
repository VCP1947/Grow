package stones.options;

import stones.jewelry.Necklace;
import stones.stone.PreciousStones;
import stones.stone.Stones;

import java.util.ArrayList;
import java.util.Scanner;

import static stones.jewelry.Necklace.ListOfNecklace;
import static stones.stone.PreciousStones.listPStones;
import static stones.stone.SemiPreciousStones.ListSPtones;

public class Choosing {
  public Choosing() {
    super();
  }

  public static final Necklace necklace = new Necklace();

  public double getPriceOfNecklace() {
    double d;
    d = 0;
    for (Stones item : sListForNeck) {
      d += item.getPrice();
    }
    return d;
  }

  public static final ArrayList<Stones> sListForNeck = new ArrayList();

  public void addStoneforNeck(int id) {
    boolean tr = true;
    while (tr) {
      System.out.println("Choose what kind of stones.stone do you wanna choose for necklace");
      System.out.println("Write 1 Choose from Precious stones.stone");
      System.out.println("Write 2 Choose from Semi Precious stones.stone");
      System.out.println("Write 0 Exit");

      Scanner sc = new Scanner(System.in);
      int ch = sc.nextInt();
      switch (ch) {
        case 1:
          for (PreciousStones item : listPStones) {
            if (id == item.getId()) {
              createListOfNeck(item);
            }
          }
          break;
        case 2:
          for (PreciousStones item : ListSPtones) {
            if (id == item.getId()) {
              createListOfNeck(item);
            }
          }
          break;
        case 0:
          return;
      }
    }
  }

  public void createListOfNeck(Stones stones) {

    sListForNeck.add(stones);
  }

  // Print list of necklace
  public void getAllListOfNeck() {
    sListForNeck.stream()
            .forEach(System.out::println);
  }

  // Create Necklace
  public void createNecklace() {
    ListOfNecklace.add(new Necklace("Faberze", setPriceNec(sListForNeck), sListForNeck));
  }

  // method for creating necklace
  public double setPriceNec(ArrayList<Stones> list) {
    for (Stones item : list) {
      necklace.price += item.getPrice();
    }
    return necklace.price;
  }
}
