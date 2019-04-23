package stones.options;

import static stones.options.Choosing.sListForNeck;

public class Searching {
  public void serching_transperency(double tr,double tr2){
    sListForNeck.stream()
            .filter(s->s.getTransparency()<tr2 &&s.getTransparency()>tr)
            .forEach(System.out::println);
  }
}
