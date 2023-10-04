package gvconnect;

import robocode.Robot;
import robocode.ScannedRobotEvent;

public class team1_theKoolKidsBot extends Robot {

    @Override public void run() {
        while(true){
            ahead(100);
            turnLeft(90);
        }
    }

    @Override
    public void onScannedRobot(ScannedRobotEvent event) {
        fire(3);
    }
}
