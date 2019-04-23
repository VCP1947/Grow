package dwelling.home;

import java.util.ArrayList;
import java.util.List;

public class Bulding {
  private static List<Dwelling> listOfDweling = new ArrayList<>();

  public static List<Dwelling> getListOfDweling() {
    return listOfDweling;
  }

  public static boolean add(Dwelling o){
    return listOfDweling.add(o);
  }
}
