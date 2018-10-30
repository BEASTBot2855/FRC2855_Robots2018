package org.usfirst.frc.team2855.robot.commands;

import org.usfirst.frc.team2855.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class ShiftGearboxes extends Command {

	public ShiftGearboxes() { requires(Robot.shifter); }
	
	protected void initialize() {}
	
	protected void execute() {}
	
	protected boolean isFinished() { return false; }
	
	protected void end() {}
	
	protected void interrupted() { end(); }
	
}
