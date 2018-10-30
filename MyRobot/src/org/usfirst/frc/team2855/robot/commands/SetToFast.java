package org.usfirst.frc.team2855.robot.commands;

import org.usfirst.frc.team2855.robot.Robot;
import org.usfirst.frc.team2855.robot.subsystems.Shifter;

import edu.wpi.first.wpilibj.command.Command;

public class SetToFast extends Command {

	private Shifter shifter;
	
	public SetToFast() { requires(Robot.shifter); }
	
	protected void initialize() { shifter = Robot.shifter; }
	
	protected void execute() { shifter.setFast(); }
	
	protected boolean isFinished() { return true; }
	
	protected void end() {}
	
	protected void interrupted() { end(); }
	
}
