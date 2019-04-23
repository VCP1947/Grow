package homeappliances.room;

public class ElectricalAppliance {
  private int id;
  private String name;
  private double power;
  private boolean idPluggedIn;

  public ElectricalAppliance(int id, String name, double power, boolean idPluggedIn) {
    this.id = id;
    this.name = name;
    this.power = power;
    this.idPluggedIn = idPluggedIn;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPower() {
    return power;
  }

  public void setPower(double power) {
    this.power = power;
  }

  public boolean isIdPluggedIn() {
    return idPluggedIn;
  }

  public void setIdPluggedIn(boolean idPluggedIn) {
    this.idPluggedIn = idPluggedIn;
  }

  @Override
  public String toString() {
    return "ElectricalAppliance{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", power=" + power +
            ", idPluggedIn=" + idPluggedIn +
            '}';
  }
}
