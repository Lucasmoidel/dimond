import javax.swing.*;
import java.awt.event.*;
import kareltherobot.*;
//This is the starter code for Karel the Robot AP CSA Thai

public class Main implements Directions {
  public static void turnRight(Robot fred) {
    for (int i = 0; i < 3; i++) {
      fred.turnLeft();
    }
  }

  public static void turnLeft(Robot fred) {
    fred.turnLeft();
  }

  public static void main(String[] args) {
    // My robot's name is Fred
    Robot fred = new Robot(1, 18, North, 100);
    World.setVisible(true);
    World.setSize(35, 35);
    World.setDelay(5);
    int length = 15;
    for (int i = 0; i < 2; i++) {
      for (int x = 0; x < length; x++) {
        fred.putBeeper();
        fred.move();
        turnLeft(fred);
        fred.move();
        turnRight(fred);
      }
      for (int x = 0; x < length; x++) {
        fred.putBeeper();
        fred.move();
        turnRight(fred);
        fred.move();
        turnLeft(fred);
      }
      turnLeft(fred);
      turnLeft(fred);
    }
    }

}