package stones.options;

import stones.jewelry.Necklace;
import stones.stone.Stones;

import java.util.Comparator;

public class Sorting {
  public void sorting_by_value() {
    Necklace.ListOfNecklace.sort(Comparator.comparing(Stones::getKarat));
  }
}
