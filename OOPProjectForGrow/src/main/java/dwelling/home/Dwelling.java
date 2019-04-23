package dwelling.home;

import java.util.ArrayList;
import java.util.List;

public class Dwelling {
  private int id;
  private String typeOfDweling;
  private double price;
  private double distanseToSocialObject;
  private String kindOfSocialObject;

  public Dwelling(int id, String typeOfDweling, double price, double distanseToSocialObject, String kindOfSocialObject) {
    this.id = id;
    this.typeOfDweling = typeOfDweling;
    this.price = price;
    this.distanseToSocialObject = distanseToSocialObject;
    this.kindOfSocialObject = kindOfSocialObject;
  }


  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTypeOfDweling() {
    return typeOfDweling;
  }

  public void setTypeOfDweling(String typeOfDweling) {
    this.typeOfDweling = typeOfDweling;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public double getDistanseToSocialObject() {
    return distanseToSocialObject;
  }

  public void setDistanseToSocialObject(double distanseToSocialObject) {
    this.distanseToSocialObject = distanseToSocialObject;
  }

  public String getKindOfSocialObject() {
    return kindOfSocialObject;
  }

  public void setKindOfSocialObject(String kindOfSocialObject) {
    this.kindOfSocialObject = kindOfSocialObject;
  }

  @Override
  public String toString() {
    return "Dwelling : " +
            "id=" + id +
            ", typeOfDweling='" + typeOfDweling + '\'' +
            ", price=" + price +
            ", distanseToSocialObject=" + distanseToSocialObject +
            ", kindOfSocialObject='" + kindOfSocialObject + '\n';
  }
}
