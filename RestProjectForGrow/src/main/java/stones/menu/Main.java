package stones.menu;

import stones.jewelry.Necklace;
import stones.options.Choosing;
import stones.options.Searching;
import stones.options.Sorting;
import stones.stone.PreciousStones;
import stones.stone.SemiPreciousStones;

import java.util.Scanner;

public class Main {
  private static int id;
  private static double chd;
  private static double chd2;

  public static void main(String[] args) {

    Necklace necklace = new Necklace();
    Searching searching = new Searching();
    PreciousStones preciousStones = new PreciousStones();
    SemiPreciousStones semiPreciousStones = new SemiPreciousStones();
    Sorting sorting = new Sorting();
    preciousStones.create_ListPStones();
    semiPreciousStones.create_SemiPreciousStones();
    preciousStones.getListPStones();
    System.out.println();
    Choosing choosing = new Choosing();
    System.out.println();

    boolean tr = true;
    int choose;

    Scanner scanner = new Scanner(System.in);

    while (tr) {
      System.out.println("----------------------MENU---------------------------------------------------");
      System.out.println("Press 1 Chose stones.stone for necklace");
      System.out.println("Press 2 Get all price of stones.stone in necklace");
      System.out.println("Press 3 Searching stones.stone in transperency field");
      System.out.println("Press 4 Sorting stones.options");
      System.out.println("Press 0 Exit");

      choose = scanner.nextInt();
      switch (choose) {
        case 1:
          preciousStones.getListPStones();
          System.out.println();
          semiPreciousStones.getListSPtones();
          System.out.println();
          id = scanner.nextInt();
          choosing.addStoneforNeck(id);
          choosing.getAllListOfNeck();
          break;
        case 2:
          choosing.createNecklace();
          double dob = choosing.getPriceOfNecklace();
          System.out.println(dob);
          break;
        case 3:
          chd = scanner.nextDouble();
          chd2 = scanner.nextDouble();
          searching.serching_transperency(chd, chd2);
          break;
        case 4:
          sorting.sorting_by_value();
          necklace.getListOfNecklace();
          break;
        case 0:
          return;
      }
    }
  }
}
