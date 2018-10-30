package org.usfirst.frc.team2855.robot.commands;

import org.usfirst.frc.team2855.robot.Robot;
import org.usfirst.frc.team2855.robot.subsystems.Intake;

import edu.wpi.first.wpilibj.command.Command;

public class GrabCube extends Command {
	
	private Intake grabber;
	
	public GrabCube() { requires(Robot.intake); }
	
	protected void initialize() { grabber = Robot.intake; }
	
	protected void execute() { grabber.moveGrabber(false); }
	
	protected boolean isFinished() { return false; }
	
	protected void end() {}
	
	protected void interrupted() { end(); }
	
}
