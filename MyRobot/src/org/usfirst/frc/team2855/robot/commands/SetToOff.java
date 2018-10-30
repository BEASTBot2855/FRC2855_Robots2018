package org.usfirst.frc.team2855.robot.commands;

import org.usfirst.frc.team2855.robot.Robot;
import org.usfirst.frc.team2855.robot.subsystems.Shifter;

import edu.wpi.first.wpilibj.command.Command;

public class SetToOff extends Command {
	
	private Shifter shifter;
	
	public SetToOff() { requires(Robot.shifter); }
	
	protected void initialize() { shifter = Robot.shifter; }
	
	protected void execute() { shifter.setOff(); }
	
	protected boolean isFinished() { return true; }
	
	protected void end() {}
	
	protected void interrupted() { end(); }
	
}
