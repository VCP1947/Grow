package gym.hall;

public class Simulators {
  private int id;
  private String hierarchy;
  private String name;
  private String exercises;
  private double time;

  public Simulators(int id, String hierarchy, String name, String exercises, double time) {
    this.id = id;
    this.hierarchy = hierarchy;
    this.name = name;
    this.exercises = exercises;
    this.time = time;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getHierarchy() {
    return hierarchy;
  }

  public void setHierarchy(String hierarchy) {
    this.hierarchy = hierarchy;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getExercises() {
    return exercises;
  }

  public void setExercises(String exercises) {
    this.exercises = exercises;
  }

  public double getTime() {
    return time;
  }

  public void setTime(double time) {
    this.time = time;
  }

  @Override
  public String toString() {
    return "Simulators{" +
            "id=" + id +
            ", hierarchy='" + hierarchy + '\'' +
            ", name='" + name + '\'' +
            ", exercises='" + exercises + '\'' +
            ", time=" + time +'\n';
  }
}
