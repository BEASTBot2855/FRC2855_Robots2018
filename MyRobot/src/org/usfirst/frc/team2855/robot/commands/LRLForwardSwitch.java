package org.usfirst.frc.team2855.robot.commands;

import org.usfirst.frc.team2855.robot.Robot;

import edu.wpi.first.wpilibj.command.TimedCommand;

public class LRLForwardSwitch extends TimedCommand {

	public LRLForwardSwitch() { this(0.0); }
	
	public LRLForwardSwitch(double timeout) {
		super(timeout);
		requires(Robot.drive);
	}
	
	protected void initialize() {}
	
	protected void execute() {}
	
	protected void end() {}
	
	protected void interrupted() { end(); }
	
}
