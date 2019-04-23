package gameroom.manager;

import gameroom.room.Kid;
import gameroom.room.Toy;

import java.util.Comparator;

import static gameroom.room.Room.toys;
import static gameroom.room.Room.kids;

public class RoomManager {

  private static double tempPrice;

  private RoomManager() {
  }

  // Adding part of Toy
  public static void add(int id, String name, int age, double account) {
    for (Toy item : toys) {
      if (id == item.getId()) {
        tempPrice = item.getPrice();
      }
    }

    if (account >= tempPrice) {
      Kid k = new Kid(name, age, account);
      kids.add(k);
      chooseToy(id, name);
    } else {
      System.out.println("You write small account than price of toy !!!");
    }
  }

  private static void chooseToy(int id, String name) {
    toys.stream()
            .filter(s -> s.getId() == id)
            .forEach(s -> s.setNameOfKid(name));
  }

  //Searching part of Manager for Toys
  public static void searchingByType(String type) {
    toys.stream()
            .filter(s -> type.equalsIgnoreCase(s.getKindOfToy()))
            .forEach(System.out::println);
  }

  public static void searchingByPrice(double account) {
    toys.stream()
            .filter(s -> account >= s.getPrice())
            .forEach(System.out::println);
  }

  public static void searchingBySize(String type) {
    toys.stream()
            .filter(s -> type.equalsIgnoreCase(s.getSize()))
            .forEach(System.out::println);
  }

  public static void sortingByPrice() {
    toys.sort(Comparator.comparing(Toy::getPrice));
  }

  public static void sortingBySize() {
    toys.sort(Comparator.comparing(Toy::getSize));
  }

  public static void sortingByID() {
    toys.sort(Comparator.comparing(Toy::getId));
  }
}
