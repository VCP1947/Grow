package airline.manager;

import airline.company.Company;
import airline.company.Plane;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CompanyManager {
  private CompanyManager() {
  }

  private static Company company = new Company();

  public static void createPlane() {
    company.addPlane(new Plane(1, "AirBus748", 100, 576, 6000, 56));
    company.addPlane(new Plane(2, "AirBus788", 1000, 56, 3000, 1200));
    company.addPlane(new Plane(3, "AirBus738", 10, 120, 2000, 35));
  }

  // Total calculations

  public static double getTotalLoadCapacity() {
    return Company.getListOfPlane().stream()
            .mapToDouble(Plane::getLoadCapacity)
            .sum();
  }

  public static int getTotalCapacity() {
    return Company.getListOfPlane().stream()
            .mapToInt(Plane::getCapacity)
            .sum();
  }

  // Plane sorting by Load Capacity

  public static List<Plane> sortByRangeOfFlight() {
    return Company.getListOfPlane().stream()
            .sorted(Comparator.comparingDouble(Plane::getRangeOfFlight))
            .collect(Collectors.toList());
  }

  // Find plane by load capacity

  public static List<Plane> findPlaneByLoadCapacity(double loadCapacity) {
    return Company.getListOfPlane().stream()
            .filter(s -> s.getLoadCapacity() == loadCapacity)
            .collect(Collectors.toList());
  }

}