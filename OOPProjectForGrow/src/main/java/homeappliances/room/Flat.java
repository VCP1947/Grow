package homeappliances.room;

import java.util.ArrayList;
import java.util.List;

public class Flat {

  private final List<ElectricalAppliance> listOfDevices = new ArrayList<>();

  public List<ElectricalAppliance> getListOfDevices() {
    return listOfDevices;
  }

  public boolean add(ElectricalAppliance o) {
    return listOfDevices.add(o);
  }
}
