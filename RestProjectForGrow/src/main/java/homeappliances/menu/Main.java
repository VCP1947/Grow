package homeappliances.menu;

import homeappliances.manager.ManagerAppliance;

public class Main {
  public static void main(String[] args) {
    ManagerAppliance.createInitiallListOfAppliance();
    System.out.println("Count power");
    ManagerAppliance.countPowerOfAppliances();
    System.out.println("Find 125");
    ManagerAppliance.findByPower(125);
    System.out.println("Sorting by power");
    ManagerAppliance.sortByPower();
  }
}
