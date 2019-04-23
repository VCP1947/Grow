package gameroom.menu;

import gameroom.room.Room;

import java.util.Scanner;

import static gameroom.room.Room.getALLToyOfList;

public class Main {

  public static void main(String[] args) {
    int choose;

    Room.createKids();
    Room.createToys();


    Menu menu = new Menu();
    while (true) {
      System.out.println("----------------------MENU---------------------------------------------------");
      System.out.println("Press 1 Add your kid to game room");
      System.out.println("Press 2 Search all free toys");
      System.out.println("Press 3 Searching options");
      System.out.println("Press 4 Sorting options");
      System.out.println("Press 0 Exit");
      Scanner scanner = new Scanner(System.in);
      choose = scanner.nextInt();
      switch (choose) {
        case 1:
          System.out.println(getALLToyOfList());
          menu.addingYourKid();
          break;
        case 2:
          Room.getFreeToyList();
          System.out.println(getALLToyOfList());
          break;
        case 3:
          Menu.searching();
          break;
        case 4:
          Menu.sorting();
          break;
        case 0:
          return;
      }
    }
  }
}
