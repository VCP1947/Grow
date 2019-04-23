package dwelling.menu;

import dwelling.home.Bulding;
import dwelling.manager.DwellingManager;

public class Main {
    public static void main(String[] args){
      DwellingManager.createListOfDwelling();
      System.out.println(Bulding.getListOfDweling());
      System.out.println("Searching by price less than 250, by distance = 1 km, by kind of social object School :");
      System.out.println(DwellingManager.searchByPrice(250,1,"School"));
      System.out.println("Sorting : ");
      System.out.println(DwellingManager.sortByPrice());
    }
  }
