package airline.menu;

import airline.company.Company;
import airline.manager.CompanyManager;

import static airline.manager.CompanyManager.*;

public class Main {
  public static void main(String[] args){
    CompanyManager.createPlane();
    System.out.println(Company.getListOfPlane());
    System.out.println("Total Load capacity and capacity of passenger :");
    System.out.println(getTotalLoadCapacity());
    //CompanyManager.getTotalLoadCapacity();
    System.out.println(getTotalCapacity());

    System.out.println("Sorting : ");
    System.out.println(getTotalLoadCapacity());
    //sortByRangeOfFlight();
    System.out.println("Find by Load capacity : ");
    System.out.println(findPlaneByLoadCapacity(1000));
    System.out.println(sortByRangeOfFlight());
  //  findPlaneByLoadCapacity(1000);
  }
}
