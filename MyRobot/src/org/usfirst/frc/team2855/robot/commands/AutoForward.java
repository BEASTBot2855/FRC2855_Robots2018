package org.usfirst.frc.team2855.robot.commands;

import org.usfirst.frc.team2855.robot.Robot;
import org.usfirst.frc.team2855.robot.RobotMap;
import org.usfirst.frc.team2855.robot.subsystems.Drive;

import edu.wpi.first.wpilibj.command.TimedCommand;

public class AutoForward extends TimedCommand {

	private Drive robotDrive;
	
	public AutoForward() { this(0.0); }
	
	public AutoForward(double timeout) {
		super(timeout);
		requires(Robot.drive);
	}
	
	protected void initialize() {
		System.out.println("-----AutoForward has run-----");
		System.out.println("WallToTurn = " + RobotMap.preferences.getDouble("WallToTurn", 1.0));
		System.out.println("DriveToSwitch = " + RobotMap.preferences.getDouble("DriveToSwitch", 1.0));
		System.out.println("SwitchToScale = " + RobotMap.preferences.getDouble("SwitchToScale", 1.0));
		System.out.println("DriveToScale" + RobotMap.preferences.getDouble("DriveToScale", 1.0));
		robotDrive = Robot.drive;
	}
	
	protected void execute() { robotDrive.driveRobot(0.5, 0.5); }
	
	protected void end() { robotDrive.driveRobot(0.0, 0.0); }
	
	protected void interrupted() { end(); }
	
}
