package org.usfirst.frc.team2855.robot.commands;

import org.usfirst.frc.team2855.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class ScaleForwardAfterRight extends Command {

	public ScaleForwardAfterRight() { requires(Robot.drive); }
	
	protected void initialize() {}
	
	protected void execute() {}
	
	protected boolean isFinished() { return false; }
	
	protected void end() {}
	
	protected void interrupted() { end(); }
	
}
