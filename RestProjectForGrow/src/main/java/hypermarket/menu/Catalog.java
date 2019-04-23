package hypermarket.menu;

import hypermarket.kind_of_materials.*;
import hypermarket.materials.Hypermarket_materials;

import java.util.ArrayList;
import java.util.Scanner;

public class Catalog {

  private int choose;

  ArrayList<Hypermarket_materials> container = new ArrayList<>();

  public void add() {
    container.add(new Bath(250, "white"));
    container.add(new Door(25.2, "brown", 5));
    container.add(new Door(205, "brown", 5));
    container.add(new Cranes(250, "black"));
    container.add(new Laminate(156, "black", 0.5));
    container.add(new Laminate(55, "light-brown", 0.75));
    container.add(new Paint(50, "Red", 0.5));
    container.add(new Paint(100, "Black", 1));
    container.add(new Parquet(555, "Brown", 0.75));
    container.add(new Parquet(75, "Black", 0.5));
    container.add(new Pipes(50, "Aluminium", 50));
    container.add(new Pipes(55, "", 8));
    container.add(new Door(555, "black", 8));
    container.add(new Door(555, "black", 8));
  }

  public void getAll() {
    for (Hypermarket_materials item : container) {
      System.out.println(item);
    }
  }

  public void searching(String srch_name) {
    Catalog c = new Catalog();
    System.out.println("------------------------RESULTS----------------------------------");
    String name_class;
    Double ch;
    boolean f;
    for (Hypermarket_materials item : container) {
      name_class = item.getClass().getName();
      name_class = name_class.substring(18);

      if (f = name_class.equals(srch_name)) {
        System.out.println(name_class);
        System.out.println(container);
      }
    }

    Scanner scanner = new Scanner(System.in);

    System.out.println("-------------------ADDITIONAL OPTIONS-----------------------------");
    System.out.println("Write 1 if you want more detailed searching");
    System.out.println("Write 0 for exit");
    System.out.println("-----------------------------------------------------------------");
    choose = Integer.valueOf(scanner.nextLine());
    while (true) {
      switch (choose) {
        case 1:
          System.out.println("-------------------DETAILED SEARCHING-----------------------------");
          System.out.println("Write 1 Searching by Price ");
          System.out.println("Write 2 Searching by Color ");
          choose = Integer.valueOf(scanner.nextLine());
          switch (choose) {
            case 1:
              ch = Double.valueOf(scanner.nextLine());
              System.out.println("Find price less than your value");
              c.searching_by_price(srch_name, ch, container);
          }
          break;
        case 0:
          return;
      }
    }
  }

  public void searching_by_price(String search_class, Double pr, ArrayList<Hypermarket_materials> cont) {
    boolean f;
    for (Hypermarket_materials item : cont) {
      String name_class = item.getClass().getName();
      name_class = name_class.substring(18);
      if (f = name_class.equals(search_class) && item.getPrice() < pr) {
        System.out.println(name_class);
        System.out.println(item);
      }
    }
  }
}
