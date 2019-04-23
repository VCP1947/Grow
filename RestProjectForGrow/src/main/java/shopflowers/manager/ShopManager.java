package shopflowers.manager;

import shopflowers.shop.Flower;
import shopflowers.shop.Posy;
import shopflowers.shop.Shop;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static shopflowers.shop.Shop.getFlowerList;
import static shopflowers.shop.Shop.getPosy;
import static shopflowers.shop.Shop.getPosyList;


public class ShopManager {

  private static Shop shop = new Shop();

  public static void createListOoFlowers(){
    shop.add(new Flower(1,"Rose", 29));
    shop.add(new Flower(2,"Konvalia", 25));
  }

  public static void createListOfPosy(){
    shop.addPosy(new Posy("Rose",5,shop.getPriceOfPosy("Rose",5)));
    shop.addPosy(new Posy("Konvalia",5,shop.getPriceOfPosy("Konvalia",5)));
  }

  public static void createPosy(){
    shop.addPosyss(getPosyList());
  }
  // Sorted by price in posy

  public static List<Posy> sortedByPrice(){
    return getPosyList().stream()
            .sorted(Comparator.comparingDouble(Posy::getPrice))
            .collect(Collectors.toList());
  }

}
