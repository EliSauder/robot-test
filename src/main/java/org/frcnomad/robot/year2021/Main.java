package org.frcnomad.robot.year2021;

import edu.wpi.first.wpilibj.RobotBase;

public final class Main {

    private Main() {}
    
    public static void main(String[] args) {
        RobotBase.startRobot(Robot::new);
    }
    
}
