package airline.company;

public class Plane {
  private int id;
  private String nameOfPlane;
  private double loadCapacity;
  private int capacity;
  private double volumOfFuel;
  private double rangeOfFlight;

  public Plane(int id, String nameOfPlane, double loadCapacity, int capacity, double volumOfFuel, double rangeOfFlight) {
    this.id = id;
    this.nameOfPlane = nameOfPlane;
    this.loadCapacity = loadCapacity;
    this.capacity = capacity;
    this.volumOfFuel = volumOfFuel;
    this.rangeOfFlight = rangeOfFlight;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNameOfPlane() {
    return nameOfPlane;
  }

  public void setNameOfPlane(String nameOfPlane) {
    this.nameOfPlane = nameOfPlane;
  }

  public double getLoadCapacity() {
    return loadCapacity;
  }

  public void setLoadCapacity(double loadCapacity) {
    this.loadCapacity = loadCapacity;
  }

  public int getCapacity() {
    return capacity;
  }

  public void setCapacity(int capacity) {
    this.capacity = capacity;
  }

  public double getVolumOfFuel() {
    return volumOfFuel;
  }

  public void setVolumOfFuel(double volumOfFuel) {
    this.volumOfFuel = volumOfFuel;
  }

  public double getRangeOfFlight() {
    return rangeOfFlight;
  }

  public void setRangeOfFlight(double rangeOfFlight) {
    this.rangeOfFlight = rangeOfFlight;
  }

  @Override
  public String toString() {
    return "Plane : " +
            "id=" + id +
            ", nameOfPlane='" + nameOfPlane + '\'' +
            ", loadCapacity=" + loadCapacity +
            ", capacity=" + capacity +
            ", volumOfFuel=" + volumOfFuel +
            ", rangeOfFlight=" + rangeOfFlight + "\n" ;
  }
}
