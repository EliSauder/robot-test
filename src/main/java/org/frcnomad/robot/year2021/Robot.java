package org.frcnomad.robot.year2021;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj2.command.CommandScheduler;

public class Robot extends TimedRobot {
    
    private RobotContainer robotContainer;

    public Robot() {
        robotContainer = new RobotContainer();
    }

    @Override
    public void robotInit() {
        // No User Implementation Required atm
    }

    @Override
    public void robotPeriodic() {
      CommandScheduler.getInstance().run();
    }
  
    @Override
    public void disabledInit() {
        // No User Implementation Required atm
    }
  
    @Override
    public void disabledPeriodic() {
        // No User Implementation Required atm
    }
  
    @Override
    public void autonomousInit() {
        // No User Implementation Required atm
    }
  
    @Override
    public void autonomousPeriodic() {
        // No User Implementation Required atm
    }
  
    @Override
    public void teleopInit() {
        // No User Implementation Required atm
    }
  
    @Override
    public void teleopPeriodic() {
        // No User Implementation Required atm
    }
  
    @Override
    public void testInit() {
      CommandScheduler.getInstance().cancelAll();
    }
  
    @Override
    public void testPeriodic() {
        // No User Implementation Required atm
    }

}
