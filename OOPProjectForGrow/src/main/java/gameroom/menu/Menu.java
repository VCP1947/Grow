package gameroom.menu;

import gameroom.manager.RoomManager;

import java.util.Scanner;

import static gameroom.room.Room.getALLToyOfList;

public class Menu {
  private static double account;
  private static boolean aBoolean = true;
  private static int choose;
  private static String name;
  private static Scanner scanner = new Scanner(System.in);
  Scanner s = new Scanner(System.in);

  public void addingYourKid() {

    System.out.println("ID: ");
    int id = scanner.nextInt();
    System.out.println("Name: ");
    name = s.nextLine();
    System.out.println("Age: ");
    int age = scanner.nextInt();
    System.out.println("Account: ");
    account = scanner.nextDouble();
    RoomManager.add(id, name, age, account);
  }

  public static void searching() {
    String type;
    while (aBoolean) {
      System.out.println("---------------------SEARCHING---------------------------------------------------");
      System.out.println("Choose options what kind of toy do you search, or it's price, or size");
      System.out.println("Press 1, search by type");
      System.out.println("Press 2, search by price");
      System.out.println("Press 3, search by size");
      System.out.println("Press 0, exit");

      choose = scanner.nextInt();
      switch (choose) {
        case 1:
          System.out.println("Write type of your toy");
          type = scanner.nextLine();
          RoomManager.searchingByType(type);
          break;
        case 2:
          System.out.println("Write price of your toy");
          account = scanner.nextDouble();
          RoomManager.searchingByPrice(account);
          break;
        case 3:
          System.out.println("Write size of your toy (Small, Average, Big)");
          type = scanner.nextLine();
          RoomManager.searchingBySize(type);
          break;
        case 0:
          return;
      }
    }
  }

  public static void sorting() {
    while (aBoolean) {
      System.out.println("---------------------SORTING---------------------------------------------------");
      System.out.println("Choose options what kind of sorting do you want to use");
      System.out.println("Press 1, Sorting by ID");
      System.out.println("Press 2, Sorting by Price");
      System.out.println("Press 3, Sorting by Size");
      System.out.println("Press 0, exit");

      choose = scanner.nextInt();
      switch (choose) {
        case 1:
          RoomManager.sortingByID();
          System.out.println(getALLToyOfList());
          break;
        case 2:
          RoomManager.sortingByPrice();
          System.out.println(getALLToyOfList());
          break;
        case 3:
          RoomManager.sortingBySize();
          System.out.println(getALLToyOfList());
          break;
        case 0:
          return;
      }
    }
  }
}
