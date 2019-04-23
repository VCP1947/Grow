package shopflowers.shop;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.DoubleStream;

public class Shop {
  private static final List<Flower> flowerList = new ArrayList<>();
  private static  List<Posy> posyList = new ArrayList<>();

  private static final List<List<Posy>> posy = new ArrayList<>();

  public static List<Flower> getFlowerList() {
    return flowerList;
  }

  public boolean add(Flower o){
    return flowerList.add(o);
  }

  // add and get methods for posy


  public static List<Posy> getPosyList() {
    return posyList;
  }

  public  boolean addPosy(Posy o){
    return posyList.add(o);
  }

  public double getPriceOfPosy(String name , int number){
    double sum;
    sum=flowerList.stream()
            .filter(s->s.getName()==name)
            .mapToDouble(Flower::getPrice)
            .sum();
    return sum*number;
  }

  public static List<List<Posy>> getPosy() {
    return posy;
  }

  public  boolean addPosyss(List<Posy> o){
    return posy.add(o);
  }

}
