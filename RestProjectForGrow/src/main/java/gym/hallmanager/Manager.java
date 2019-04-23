package gym.hallmanager;

import gym.hall.Simulators;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Manager {

  private static List<Simulators> listOfSimulators = new ArrayList<>();

  public static void createListOfSimulators(){
    listOfSimulators.add(new Simulators(1,"Arms","barbell", "Pull_Ups",20));
    listOfSimulators.add(new Simulators(2,"Legs", "barbell","Seats",20));
    listOfSimulators.add(new Simulators(3,"Chest", "barbell","Pull_Ups",20));
  }

  public static List<Simulators> searchByHierarchy(String hierarchy){
    return listOfSimulators.stream()
            .filter(s->s.getHierarchy()==hierarchy)
            .collect(Collectors.toList());
  }

  public static List<Simulators> searchByNameOfSimulator(String nameOfSimulators){
    return listOfSimulators.stream()
            .filter(s->s.getHierarchy()==nameOfSimulators)
            .collect(Collectors.toList());
  }
}
