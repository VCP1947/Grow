package airline.company;

import java.util.ArrayList;
import java.util.List;

public class Company {

  private static List<Plane> listOfPlane = new ArrayList<>();

  public static List<Plane> getListOfPlane() {
    return listOfPlane;
  }
  public static boolean addPlane(Plane o){
    return listOfPlane.add(o);
  }
}
