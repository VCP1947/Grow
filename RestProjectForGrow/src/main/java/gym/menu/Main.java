package gym.menu;

import gym.hallmanager.Manager;

public class Main {

    public static void main(String[] args){
      Manager.createListOfSimulators();
      Manager.searchByHierarchy("Arms");
      Manager.searchByNameOfSimulator("barbell");
  }
}
