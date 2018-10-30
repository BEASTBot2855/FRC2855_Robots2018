package org.usfirst.frc.team2855.robot.commands;

import org.usfirst.frc.team2855.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class ScaleElevatorLift extends Command {

	public ScaleElevatorLift() { requires(Robot.elevator); }
	
	protected void initialize() {}
	
	protected void execute() {}
	
	protected boolean isFinished() { return false; }
	
	protected void end() {}
	
	protected void interrupted() { end(); }
	
}
