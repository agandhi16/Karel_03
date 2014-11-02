/**
*
* CLimbers alex and tenzing get treasure and bring back to base camp. 
*
* @author <Alex Gandhi>
* @version <30/10/14>
*/

import edu.fcps.karel2.Display;
public class Lab03 {
 
      public static void main(String[] args) {
            
            Display.openWorld("maps/mountain.map");
            Display.setSize(16, 16);
            Display.setSpeed(8);
            
            Climber alex = new Climber();
            Climber tenzing = new Climber();
            
            alex.turnRight();
            tenzing.turnRight();
            alex.move();
            tenzing.move();
            alex.turnLeft();
            tenzing.turnLeft();
            alex.climbUpRight();
            tenzing.climbUpRight();
            alex.climbUpRight();
            tenzing.climbUpRight();
            alex.climbUpRight();
            tenzing.climbUpRight();
            alex.turnAround();
            tenzing.turnAround();
            alex.climbDownRight();
            tenzing.climbDownRight();
            alex.climbDownRight();
            tenzing.climbDownRight();
            alex.pickBeeper();
            alex.turnAround();
            tenzing.turnAround();
            alex.climbUpLeft();
            tenzing.climbUpLeft();
            alex.climbUpLeft();
            tenzing.climbUpLeft();
            alex.turnAround();
            tenzing.turnAround();
            alex.climbDownLeft();
            tenzing.climbDownLeft();
            alex.climbDownLeft();
            tenzing.climbDownLeft();
            alex.climbDownLeft();
            tenzing.climbDownLeft();
            alex.turnRight();
            tenzing.turnRight();
            alex.move();
            tenzing.move();
            alex.turnRight();
            tenzing.turnRight();
     }
 }
    
