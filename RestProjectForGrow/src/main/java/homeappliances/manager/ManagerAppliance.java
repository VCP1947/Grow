package homeappliances.manager;

import homeappliances.room.ElectricalAppliance;
import homeappliances.room.Flat;

import java.util.Comparator;

public class ManagerAppliance {

  private static Flat flat = new Flat();

  public static void createInitiallListOfAppliance() {
    flat.add(new ElectricalAppliance(1, "Refrigerator", 125, true));
    flat.add(new ElectricalAppliance(2, "TV", 145, true));
    flat.add(new ElectricalAppliance(3, "Lamp", 50, false));
    flat.add(new ElectricalAppliance(4, "Computer", 120, true));
  }

  public Flat getFlat() {
    return flat;
  }

  public void setFlat(Flat flat) {
    this.flat = flat;
  }

  public static void countPowerOfAppliances() {
    double a;
    a = flat.getListOfDevices().stream()
            .mapToDouble(ElectricalAppliance::getPower)
            .sum();
    System.out.println(a);
  }

  public static void sortByPower() {
    flat.getListOfDevices().stream()
            .sorted(Comparator.comparingDouble(ElectricalAppliance::getPower))
            .forEach(System.out::println);
  }

  public static void findByPower(double power) {
    flat.getListOfDevices().stream()
            .filter(s -> power == s.getPower())
            .forEach(System.out::println);
  }
}
