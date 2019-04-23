package hypermarket.menu;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Integer choose;
    String choose_str;
    Catalog catalog = new Catalog();
    catalog.add();
    Scanner scanner = new Scanner(System.in);
    while (true) {
      System.out.println("Welcome to our Hypermarket");
      System.out.println("Choose what do you need!!!");
      System.out.println("We offer to you");
      System.out.println("Press 1 for read our proposition");
      System.out.println("Press 2 for search what you need");
      System.out.println("Press 0 to exit");
      choose = Integer.valueOf(scanner.nextLine());
      switch (choose) {
        case 1:
          catalog.getAll();
          break;
        case 2:
          System.out.println("Write what stuff are you searching");
          choose_str = scanner.nextLine();
          catalog.searching(choose_str);
          break;
        case 0:
          return;
      }
    }
  }
}
