package org.usfirst.frc.team2855.robot.commands;

import org.usfirst.frc.team2855.robot.Robot;
import org.usfirst.frc.team2855.robot.subsystems.Drive;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;

public class DriveRobot extends Command {

	private Drive robotDrive;
	private Joystick leftJ;
	private Joystick rightJ;
	private Joystick xboxJ;
	
	public DriveRobot() { requires(Robot.drive); }
	
	protected void initialize() {
		robotDrive = Robot.drive;
		leftJ = Robot.oi.attack3;
		rightJ = Robot.oi.extreme3dpro;
		xboxJ = Robot.oi.xbox;
	}
	
	protected void execute() {
//		if ((leftJ.getY() > 0.0 && rightJ.getY() < 0.0) || (leftJ.getY() < 0.0 && rightJ.getY() > 0.0)) {
//			robotDrive.driveRobot(leftJ.getY(Hand.kLeft), rightJ.getY(Hand.kRight));
//		} else {
//			robotDrive.driveRobot(leftJ.getY(Hand.kLeft) * -leftJ.getZ(), rightJ.getY(Hand.kRight) * -leftJ.getZ());
//		}
		
		robotDrive.driveRobot(xboxJ.getY() * 0.5, xboxJ.getRawAxis(3) * 0.5);
		
//	robotDrive.driveRobot(-leftJ.getY(), -rightJ.getY());
		
//		if ((xboxJ.getY() > 0.0 && xboxJ.getRawAxis(3) < 0.0) || (xboxJ.getY() < 0.0 && xboxJ.getRawAxis(3) > 0.0)) {
//			robotDrive.driveRobot(-xboxJ.getY() * 0.75, -xboxJ.getRawAxis(3) * 0.75);
//		} else {
//			robotDrive.driveRobot(-xboxJ.getY() * 0.5, -xboxJ.getRawAxis(3) * 0.5);
//		}
	}
	
	protected boolean isFinished() { return false; }
	
	protected void end() { robotDrive.driveRobot(0.0, 0.0); }
	
	protected void interrupted() { end(); }
	
}
