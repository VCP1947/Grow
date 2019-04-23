package dwelling.manager;

import dwelling.home.Bulding;
import dwelling.home.Dwelling;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class DwellingManager {
  private DwellingManager(){

  }

  public static void createListOfDwelling() {
    Bulding.add(new Dwelling(1, "House", 300, 2, "School"));
    Bulding.add(new Dwelling(2, "PentHouse", 1000, 1, "Hypermarket"));
    Bulding.add(new Dwelling(3, "Flat", 180, 1, "Kindergarten"));
    Bulding.add(new Dwelling(4, "House", 200, 1, "School"));
  }

  // Searching
  public static List<Dwelling> searchByPrice(double price, double distance, String kindOfSocialObj) {
    return Bulding.getListOfDweling().stream()
            .filter(s -> price > s.getPrice() && distance >= s.getDistanseToSocialObject() && kindOfSocialObj == s.getKindOfSocialObject())
            .collect(Collectors.toList());
  }

  // Sorting
  public static List<Dwelling> sortByPrice() {
    return Bulding.getListOfDweling().stream()
            .sorted(Comparator.comparingDouble(Dwelling::getPrice))
            .collect(Collectors.toList());
  }
}
