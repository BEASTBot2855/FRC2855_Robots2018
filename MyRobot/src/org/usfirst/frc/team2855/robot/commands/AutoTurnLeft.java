package org.usfirst.frc.team2855.robot.commands;

import org.usfirst.frc.team2855.robot.Robot;
import org.usfirst.frc.team2855.robot.RobotMap;
import org.usfirst.frc.team2855.robot.subsystems.Drive;

import edu.wpi.first.wpilibj.command.TimedCommand;

public class AutoTurnLeft extends TimedCommand {

	private Drive robotDrive;
	
	public AutoTurnLeft() { this(0.0); }
	
	public AutoTurnLeft(double timeout) {
		super(timeout);
		requires(Robot.drive);
	}
	
	protected void initialize() {
		System.out.println("-----AutoTurnLeft has run-----");
		System.out.println("TurnToSwitch = " + RobotMap.preferences.getDouble("TurnToSwitch", 1.0));
		System.out.println("TurnToScale = " + RobotMap.preferences.getDouble("TurnToScale", 1.0));
		robotDrive = Robot.drive;
	}
	
	protected void execute() { robotDrive.driveRobot(-1.0, 1.0); }
	
	protected void end() { robotDrive.driveRobot(0.0, 0.0); }
	
	protected void interrupted() { end(); }
	
}
