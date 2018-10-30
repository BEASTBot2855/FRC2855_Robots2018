package org.usfirst.frc.team2855.robot.commands;

import org.usfirst.frc.team2855.robot.Robot;
import org.usfirst.frc.team2855.robot.subsystems.Shifter;

import edu.wpi.first.wpilibj.command.Command;

public class SetToSlow extends Command {

	private Shifter shifter;
	
	public SetToSlow() { requires(Robot.shifter); }
	
	protected void initialize() {
		System.out.println("-----SetToSlow has run-----");
		shifter = Robot.shifter;
	}
	
	protected void execute() { shifter.setSlow(); }
	
	protected boolean isFinished() { return true; }
	
	protected void end() {}
	
	protected void interrupted() { end(); }
	
}
