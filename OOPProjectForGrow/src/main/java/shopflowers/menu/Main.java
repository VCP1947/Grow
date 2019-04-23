package shopflowers.menu;

import shopflowers.manager.ShopManager;
import shopflowers.shop.Shop;

public class Main {
  public static void main(String[] args) {
    ShopManager.createListOoFlowers();
    ShopManager.createListOfPosy();
    System.out.println();
    System.out.println(Shop.getFlowerList());
    System.out.println();
    System.out.println(Shop.getPosyList());
    System.out.println("Sorted : ");
    System.out.println(ShopManager.sortedByPrice());
  }
}
