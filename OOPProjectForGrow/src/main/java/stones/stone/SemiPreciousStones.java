package stones.stone;

import java.util.ArrayList;

public class SemiPreciousStones extends PreciousStones {

  public SemiPreciousStones(int ID, String name, double karat, double price, int transparency) {
    super(ID, name, karat, price, transparency);
  }

  public SemiPreciousStones(){

  }
  public static ArrayList<PreciousStones> ListSPtones = new ArrayList();

  public void create_SemiPreciousStones(){
    ListSPtones.add(new SemiPreciousStones(1,"Sklo",0,125,8));
    ListSPtones.add(new SemiPreciousStones(2,"Krishtal",0,211,10));

  }

  public void getListSPtones(){
    ListSPtones.stream()
            .forEach(System.out::println);
  }

  @Override
  public String toString() {
    return "SemiPreciousStones{" +
            "ID=" + getId() +
            ", name='" + getName() + '\'' +
            ", Karat=" + getKarat() +
            ", price=" + getPrice() +
            ", Transparency=" + getTransparency() +
            '}';
  }
}
