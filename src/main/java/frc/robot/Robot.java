
package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.motorcontrol.MotorController;


public class Robot extends TimedRobot {
 // define xbox controller

 public XboxController ctrl = new XboxController(0);

 // define the left motors
 public CANS
  @Override
  public void robotInit() {}
//What ever in this code runs after you start up the robot
  @Override
  public void robotPeriodic() {}
// What ever in this code runs as long as the robot is up
  @Override
  public void autonomousInit() {}
/// whatever is in this block of code runs after the driver turns on auto
  @Override
  public void autonomousPeriodic() {}
// whatever is in this block of code runs as long as auto is on
  @Override
  public void teleopInit() {}
// what ever is in this block of code runs when the driver turns on manual control
  @Override
  public void teleopPeriodic() {}
// what ever is in this block of code runs as long as driver has manual on
  @Override
  public void disabledInit() {}

  @Override
  public void disabledPeriodic() {}

  
}
