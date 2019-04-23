package gameroom.room;

import java.util.ArrayList;
import java.util.List;

public class Room {

  public static final List<Kid> kids = new ArrayList<>();
  public static final List<Toy> toys = new ArrayList<>();

  public static void createKids() {
    kids.add(new Kid("Alex", 5, 25));
    kids.add(new Kid("Tom", 2, 250));
    kids.add(new Kid("John", 10, 200));
  }

  public static void createToys() {
    toys.add(new Toy(1, 250, "Small", "Car", null));
    toys.add(new Toy(2, 25, "Small", "Lol", null));
    toys.add(new Toy(3, 250, "Middle", "Plane", null));
    toys.add(new Toy(4, 100, "Small", "Ship", "Alex"));
    toys.add(new Toy(5, 150, "Big", "Horse", "Tom"));
  }

  public static List<Kid> getAllKidOfList() {
    return kids;
  }

  public static List<Toy> getALLToyOfList() {
    return toys;
  }

  public static void getFreeToyList() {
    toys.stream()
            .filter(s -> s.getNameOfKid() == null)
            .forEach(System.out::println);
  }

  public static void getNotFreeToyList() {
    toys.stream()
            .filter(s -> s.getNameOfKid() != null)
            .forEach(System.out::println);
  }
}
